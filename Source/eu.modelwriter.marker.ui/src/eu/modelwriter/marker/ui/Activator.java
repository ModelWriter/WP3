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
package eu.modelwriter.marker.ui;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import eu.modelwriter.configuration.alloy.trace.TraceException;
import eu.modelwriter.configuration.alloy.trace.TraceManager;
import eu.modelwriter.marker.ui.internal.views.visualizationview.commands.TraceObserver;
import eu.modelwriter.marker.ui.internal.views.visualizationview.commands.VisualizationActionListenerFactory;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

  // The plug-in ID
  public static final String PLUGIN_ID = "eu.modelwriter.marker.ui"; //$NON-NLS-1$

  // The shared instance
  private static Activator plugin;

  /**
   * The constructor
   */
  public Activator() {}

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
   */
  @Override
  public void start(BundleContext context) throws Exception {
    super.start(context);
    plugin = this;
    try {
      TraceManager.get().loadSpec(getDefault().getDialogSettings().get("alloyFile"));
    } catch (TraceException | NullPointerException e) {
      // No need to handle
    }
    VisualizationActionListenerFactory.get().registerListener(TraceObserver.get());
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
   */
  @Override
  public void stop(BundleContext context) throws Exception {
    plugin = null;
    VisualizationActionListenerFactory.get().unregisterListener(TraceObserver.get());
    super.stop(context);
  }

  /**
   * Returns the shared instance
   *
   * @return the shared instance
   */
  public static Activator getDefault() {
    return plugin;
  }

  public static Shell getShell() {
    return getActiveWorkbenchWindow().getShell();
  }

  public static IWorkbenchWindow getActiveWorkbenchWindow() {
    return PlatformUI.getWorkbench().getActiveWorkbenchWindow();
  }

  /**
   * Always good to have this static method as when dealing with IResources having a interface to
   * get the editor is very handy
   * 
   * @return
   */
  public static IEditorPart getEditor() {
    return getActiveWorkbenchWindow().getActivePage().getActiveEditor();
  }

  public static MessageDialog infoDialogOK(String title, String message) {
    return new MessageDialog(getShell(), title, null, message, MessageDialog.INFORMATION, 0, "OK");
  }

  public static MessageDialog infoDialogYESNO(String title, String message) {
    return new MessageDialog(getShell(), title, null, message, MessageDialog.INFORMATION, 0, "Yes",
        "No");
  }

  public static MessageDialog errorDialogOK(String title, String message) {
    return new MessageDialog(getShell(), title, null, message, MessageDialog.ERROR, 0, "Yes", "No");
  }

  public static MessageDialog errorDialogYESNO(String title, String message) {
    return new MessageDialog(getShell(), title, null, message, MessageDialog.ERROR, 0, "Yes", "No");
  }
}
