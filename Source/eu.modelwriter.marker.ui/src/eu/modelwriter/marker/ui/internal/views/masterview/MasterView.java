package eu.modelwriter.marker.ui.internal.views.masterview;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.ViewPart;

import eu.modelwriter.marker.internal.MarkUtilities;
import eu.modelwriter.marker.internal.MarkerFactory;
import eu.modelwriter.marker.ui.Activator;

public class MasterView extends ViewPart {

  private static final String MARKERS_ID = "org.eclipse.ui.ide.MarkersView";

  private TreeViewer treeViewer;

  public MasterView() {
    super();
  }

  @Override
  public void createPartControl(final Composite parent) {
    this.treeViewer = new TreeViewer(parent, SWT.BORDER | SWT.MULTI);
    this.treeViewer.setContentProvider(new MasterViewContentProvider());
    this.treeViewer.setLabelProvider(new MasterViewLabelProvider());

    this.treeViewer
        .setInput(MarkerFactory.findMarkers(ResourcesPlugin.getWorkspace().getRoot()).toArray());
    // this.getSite().setSelectionProvider(this.treeViewer);
    this.registerContextMenu();

    this.treeViewer.addDoubleClickListener(new IDoubleClickListener() {

      @Override
      public void doubleClick(final DoubleClickEvent event) {
        final IStructuredSelection selection = (IStructuredSelection) event.getSelection();
        final IMarker selected = (IMarker) selection.getFirstElement();
        try {
          final IWorkbenchPage page = Activator.getActiveWorkbenchWindow().getActivePage();
          IDE.openEditor(page, MarkerFactory.findMarkerBySourceId(selected.getResource(),
              MarkUtilities.getSourceId(selected)));
        } catch (final PartInitException e) {
          e.printStackTrace();
        }
      }
    });

    Activator.getActiveWorkbenchWindow().getWorkbench().getDisplay().asyncExec(new Runnable() {

      @Override
      public void run() {
        ResourcesPlugin.getWorkspace().addResourceChangeListener(new IResourceChangeListener() {
          @Override
          public void resourceChanged(final IResourceChangeEvent event) {
            if (event.findMarkerDeltas(MarkerFactory.MARKER_MARKING, true).length != 0) {
              if (!MasterView.this.treeViewer.getTree().isDisposed()) {
                MasterView.this.treeViewer.setInput(
                    MarkerFactory.findMarkers(ResourcesPlugin.getWorkspace().getRoot()).toArray());
              }
            }
          }
        }, IResourceChangeEvent.POST_CHANGE);
      }
    });
  }

  private void registerContextMenu() {
    final MenuManager contextMenu = new MenuManager();
    contextMenu.setRemoveAllWhenShown(true);
    this.getSite().registerContextMenu(contextMenu, this.treeViewer);
    // Add in the entries for all markers views if this has a different if
    if (!this.getSite().getId().equals(MARKERS_ID)) {
      this.getSite().registerContextMenu(MARKERS_ID, contextMenu, this.treeViewer);
    }
    final Control control = this.treeViewer.getControl();
    final Menu menu = contextMenu.createContextMenu(control);
    control.setMenu(menu);
  }

  @Override
  public void setFocus() {
    this.treeViewer.getTree().setFocus();
  }
}
