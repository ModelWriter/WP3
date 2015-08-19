package eu.modelwriter.marker.ui.internal.wizards.markerwizard;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import eu.modelwriter.marker.internal.MarkerTypeElement;

public class MarkerTreeViewContentProvider implements ITreeContentProvider {

  @Override
  public void dispose() {}

  @Override
  public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {}

  @Override
  public Object[] getElements(Object inputElement) {
    if (inputElement instanceof Object[]) {
      return (Object[]) inputElement;
    } else {
      return new Object[0];
    }
  }

  @Override
  public Object[] getChildren(Object parentElement) {
    if (parentElement instanceof MarkerTypeElement) {
      MarkerTypeElement type = (MarkerTypeElement) parentElement;
      return type.getChildren().toArray();
    }
    return null;
  }

  @Override
  public Object getParent(Object element) {
    return null;
  }

  @Override
  public boolean hasChildren(Object element) {
    if (element instanceof MarkerTypeElement) {
      MarkerTypeElement type = (MarkerTypeElement) element;
      return !type.getChildren().isEmpty();
    }
    return false;
  }
}
