package eu.modelwriter.configuration.alloy2emf;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.List;

import edu.mit.csail.sdg.alloy4.ConstList;
import edu.mit.csail.sdg.alloy4compiler.ast.Command;
import eu.modelwriter.configuration.alloy.trace.TraceException;

public class AlloyRunCommandsPage extends AlloyToEMFWizardPage {

  private final ConstList<Command> commandList;
  private List list;

  public AlloyRunCommandsPage(final ConstList<Command> commands) {
    super("Run Commands");
    setTitle("Select Run Command");
    resetMessage();
    commandList = commands;
  }

  private void resetMessage() {
    setDescription("Select a command to start.");
  }

  @Override
  public void createControl(final Composite parent) {
    final Composite container = new Composite(parent, SWT.NULL);
    container.setLayout(new FillLayout(SWT.HORIZONTAL));

    list = new org.eclipse.swt.widgets.List(container, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);

    for (final Command command : commandList) {
      if (!command.check)
        list.add("run " + command.label);
    }

    list.add("Create new run");
    list.setSelection(0);
    list.addSelectionListener(new SelectionListener() {

      @Override
      public void widgetSelected(SelectionEvent e) {
        setPageComplete(true);
        resetMessage();
      }

      @Override
      public void widgetDefaultSelected(SelectionEvent e) {

      }
    });
    setControl(container);
  }

  @Override
  public boolean nextPressed() throws TraceException {

    getAlloyToEMF().setSelectedCommand(getSelection());
    BoundSelectionPage nextPage = (BoundSelectionPage) getNextPage();
    nextPage.setSelectedCommand(getSelection());

    return true;
  }

  public Command getSelection() {
    // Create new run command
    if (list.getSelectionIndex() == commandList.size())
      return null;

    return commandList.get(list.getSelectionIndex());
  }

}
