package eu.modelwriter.writer.markers.views.sourceview.internal;

import eu.modelwriter.writer.markers.actions.MarkElement;

public class SourceViewOffsetColumn extends SourceViewColumn {

	@Override
	public String getText(Object element) {
		if (element instanceof MarkElement) {
			return Integer.toString(((MarkElement) element).getOffset());
		}
		return "";
	}

	@Override
	public String getTitle() {
		return "Offset";
	}

	public int getWidth() {
		return 50;
	}
}
