package eu.modelwriter.marker.ui.internal;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.File;
import java.io.IOException;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.NotEnabledException;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.core.resources.IMarker;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.services.IServiceLocator;

import edu.mit.csail.sdg.alloy4.Err;
import edu.mit.csail.sdg.alloy4.Util;
import edu.mit.csail.sdg.alloy4graph.GraphViewer;
import edu.mit.csail.sdg.alloy4viz.AlloyAtom;
import edu.mit.csail.sdg.alloy4viz.AlloyInstance;
import edu.mit.csail.sdg.alloy4viz.AlloyTuple;
import edu.mit.csail.sdg.alloy4viz.StaticInstanceReader;
import edu.mit.csail.sdg.alloy4viz.VizGraphPanel;
import edu.mit.csail.sdg.alloy4viz.VizState;
import eu.modelwriter.configuration.internal.AlloyUtilities;
import eu.modelwriter.marker.internal.MarkUtilities;

public class AlloyVisualization {
  private static AlloyVisualization manager;

  public static AlloyVisualization getInstance() {
    if (AlloyVisualization.manager == null) {
      AlloyVisualization.manager = new AlloyVisualization();
    }
    return AlloyVisualization.manager;
  }

  AlloyInstance myInstance = null;
  VizState myState = null;
  VizGraphPanel graph;
  JFrame frame = new JFrame("Traceability Virtualization");
  File f = null;

  final String xmlFileName = Util.canon(AlloyUtilities.getLocation());

  private AlloyVisualization() {}

  private ActionListener createActionListenerByCommand(String commandId) {
    ActionListener acl = new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        Object annotation =
            AlloyVisualization.this.graph.alloyGetViewer().alloyGetHighlightedAnnotation();
        MarkUtilities.focusMarker(AlloyVisualization.this.getMarker((AlloyAtom) annotation));
        //
        // try {
        // Thread.sleep(500);
        // } catch (InterruptedException e2) {
        // e2.printStackTrace();
        // }

        Display.getDefault().syncExec(new Runnable() {

          @Override
          public void run() {
            IServiceLocator serviceLocator = PlatformUI.getWorkbench();

            ICommandService commandService = serviceLocator.getService(ICommandService.class);

            try {
              Command command = commandService.getCommand(commandId);

              // Optionally pass a ExecutionEvent instance, default no-param arg creates blank
              // event
              command.executeWithChecks(new ExecutionEvent());

            } catch (ExecutionException | NotDefinedException | NotEnabledException
                | NotHandledException e1) {
              // Replace with real-world exception handling
              e1.printStackTrace();
            }
          }
        });
        AlloyVisualization.this.showViz();
      }
    };
    return acl;
  }

  private IMarker getMarker(AlloyAtom highLightedAtom) {

    String atomType = highLightedAtom.getType().getName();
    String stringIndex = highLightedAtom.toString().substring(atomType.length());
    int index = 0;
    if (!stringIndex.isEmpty()) {
      index = Integer.parseInt(stringIndex);
    }

    IMarker marker = AlloyUtilities.findMarker(atomType, index);

    return marker;
  }

  public void showViz() {
    this.f = new File(this.xmlFileName);
    try {
      if (!this.f.exists()) {
        throw new IOException("File " + this.xmlFileName + " does not exist.");
      }

      this.myState = new VizState(StaticInstanceReader.parseInstance(this.f));
      if (this.graph != null && this.frame.getComponent(0) != null) {
        this.frame.remove(AlloyVisualization.this.graph);
      }

      this.graph = new VizGraphPanel(this.myState, false);
      this.frame.add(this.graph);
      this.frame.setVisible(true);
      Dimension dim = new Dimension(500, 500);
      this.frame.setMinimumSize(dim);

    } catch (Err e1) {
      e1.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    JMenu modelWriterMenu = new JMenu("ModelWriter");
    JMenuItem deleteMarkerMenuItem = new JMenuItem("Delete Marker");
    JMenuItem addRemoveTypeMenuItem = new JMenuItem("Remove Type");
    JMenuItem removeRelationMenuItem = new JMenuItem("Remove Relation");
    JMenuItem mapMarkerMenuItem = new JMenuItem("Map Marker");

    modelWriterMenu.add(deleteMarkerMenuItem, 0);
    modelWriterMenu.add(addRemoveTypeMenuItem, 1);
    modelWriterMenu.add(removeRelationMenuItem, 2);
    modelWriterMenu.add(mapMarkerMenuItem, 3);

    deleteMarkerMenuItem.addActionListener(
        this.createActionListenerByCommand("eu.modelwriter.marker.command.delete"));
    addRemoveTypeMenuItem.addActionListener(
        this.createActionListenerByCommand("eu.modelwriter.marker.command.addremovetype"));
    removeRelationMenuItem
        .addActionListener(this.createActionListenerByCommand("eu.modelwriter.marker.command.map"));
    mapMarkerMenuItem
        .addActionListener(this.createActionListenerByCommand("eu.modelwriter.marker.command.map"));

    this.graph.alloyGetViewer().pop.add(modelWriterMenu, 0);

    this.graph.alloyGetViewer().addMouseMotionListener(new MouseMotionAdapter() {
      @Override
      public void mouseMoved(MouseEvent e) {
        GraphViewer viewer = (GraphViewer) e.getSource();
        Object annotation = viewer.alloyGetAnnotationAtXY(e.getX(), e.getY());
        JComponent cmpnt = (JComponent) e.getComponent();
        String tooltip = null;

        if (annotation instanceof AlloyAtom) {
          IMarker marker = AlloyVisualization.this.getMarker((AlloyAtom) annotation);
          if (marker == null) {
            return;
          }

          tooltip = MarkUtilities.getText(marker);
        } else if (annotation instanceof AlloyTuple) {
          AlloyTuple tuple = (AlloyTuple) annotation;

          AlloyAtom highLightedAtomStart = tuple.getStart();
          AlloyAtom highLightedAtomEnd = tuple.getEnd();

          IMarker markerStart = AlloyVisualization.this.getMarker(highLightedAtomStart);
          IMarker markerEnd = AlloyVisualization.this.getMarker(highLightedAtomEnd);

          if (markerStart == null || markerEnd == null) {
            return;
          }

          tooltip = MarkUtilities.getText(markerStart) + " --> " + MarkUtilities.getText(markerEnd);
        }
        cmpnt.setToolTipText(tooltip);
      }
    });

    this.graph.alloyGetViewer().addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        super.mouseClicked(e);
        if (e.getClickCount() > 1) {
          GraphViewer viewer = (GraphViewer) e.getSource();
          Object annotation = viewer.alloyGetAnnotationAtXY(e.getX(), e.getY());

          if (annotation instanceof AlloyAtom) {
            IMarker marker = AlloyVisualization.this.getMarker((AlloyAtom) annotation);
            if (marker == null) {
              return;
            }
            MarkUtilities.focusMarker(marker);
          }
        }
      }

      @Override
      public void mousePressed(MouseEvent e) {
        switch (e.getButton()) {
          case MouseEvent.BUTTON3: // right click
            GraphViewer viewer = (GraphViewer) e.getSource();
            Object annotation = viewer.alloyGetAnnotationAtXY(e.getX(), e.getY());
            JMenu menu = (JMenu) viewer.pop.getComponent(0);
            if (annotation == null) {
              menu.setVisible(false);
            } else {
              if (annotation instanceof AlloyAtom) {
                menu.getItem(0).setVisible(true);
                menu.getItem(1).setVisible(true);
                menu.getItem(2).setVisible(false);
                menu.getItem(3).setVisible(true);
              } else if (annotation instanceof AlloyTuple) {
                menu.getItem(0).setVisible(false);
                menu.getItem(1).setVisible(false);
                menu.getItem(2).setVisible(true);
                menu.getItem(3).setVisible(false);
              }
              menu.setVisible(true);
            }
          default:
            break;
        }
      }
    });

    // JDialog dialog = new JDialog();
    // dialog.add(graph);
    // dialog.setVisible(true);
    // dialog.pack();
  }

}
