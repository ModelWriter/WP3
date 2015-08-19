package eu.modelwriter.marker.internal;

import org.eclipse.core.resources.IResource;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Color;

public class FileDecorator extends LabelProvider implements ILightweightLabelDecorator {

  public static final String ICON = "/icons/Black.gif";
  private static Color color = new Color(null, 255, 192, 0);

  @Override
  public void decorate(Object resource, IDecoration decoration) {
    int markers = MarkerFactory.findMarkers((IResource) resource).size();
    if (markers > 0) {
      decoration.addOverlay(ImageDescriptor.createFromFile(FileDecorator.class, ICON),
          IDecoration.TOP_RIGHT);
      decoration.setForegroundColor(color);
    } else {
      decoration.addOverlay(null);
      decoration.setForegroundColor(new Color(null, 0, 0, 0, 0));
    }
  }
}
