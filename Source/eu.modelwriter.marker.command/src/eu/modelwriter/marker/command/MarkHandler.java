/*******************************************************************************
 * Copyright (c) 2015 UNIT Information Technologies R&D Ltd All rights reserved. This program and
 * the accompanying materials are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: Ferhat Erata - initial API and implementation H. Emre Kirmizi - initial API and
 * implementation Serhat Celik - initial API and implementation U. Anil Ozturk - initial API and
 * implementation
 *******************************************************************************/
package eu.modelwriter.marker.command;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.presentation.EcoreEditor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

import eu.modelwriter.marker.MarkerActivator;
import eu.modelwriter.marker.internal.AnnotationFactory;
import eu.modelwriter.marker.internal.MarkElementUtilities;
import eu.modelwriter.marker.internal.MarkerFactory;
import eu.modelwriter.marker.typing.internal.AlloyUtilities;

public class MarkHandler extends AbstractHandler {
  IEditorPart editor;
  IFile file;
  ISelection selection;

  private void createMarker() {
    this.editor =
        PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
    this.file = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
        .getActiveEditor().getEditorInput().getAdapter(IFile.class);
    this.selection =
        PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService().getSelection();

    IMarker beAdded = this.getMarker();
    String message = "";
    if (this.selection instanceof ITextSelection) {
      if ((beAdded != null) && beAdded.exists()) {
        message = ((ITextSelection) this.selection).getText();
        AnnotationFactory.addAnnotation(beAdded, this.editor, AnnotationFactory.ANNOTATION_MARKING);
      }
    } else if (this.selection instanceof ITreeSelection) {
      if (this.editor instanceof EcoreEditor) {
        ITreeSelection treeSelection = (ITreeSelection) this.selection;
        if ((beAdded != null) && beAdded.exists()) {
          if (treeSelection.getFirstElement() instanceof EModelElement) {
            message = ((ENamedElement) treeSelection.getFirstElement()).getName();
          } else {
            message = MarkElementUtilities.getMessage(beAdded);
          }
        }
      }
    }

    MessageDialog dialog = new MessageDialog(MarkerActivator.getShell(), "Mark Information", null,
        "\"" + message + "\" has been selected to be marked", MessageDialog.INFORMATION,
        new String[] {"OK"}, 0);
    dialog.open();
  }

  @Override
  public Object execute(ExecutionEvent event) throws ExecutionException {
    this.createMarker();
    this.refresh();
    return null;
  }

  private IMarker getMarker() {
    IMarker beAdded = null;
    if (this.selection instanceof ITextSelection) {
      beAdded = MarkerFactory.createMarker(this.file, (ITextSelection) this.selection);
    } else if (this.selection instanceof ITreeSelection) {
      if (this.editor instanceof EcoreEditor) {
        ITreeSelection treeSelection = (ITreeSelection) this.selection;
        beAdded = MarkerFactory.createMarker(this.file, treeSelection);
      }
    }
    AlloyUtilities.addMarkerToRepository(beAdded);
    return beAdded;
  }

  private void refresh() {
    MarkerFactory.refreshProjectExp();
  }
}
