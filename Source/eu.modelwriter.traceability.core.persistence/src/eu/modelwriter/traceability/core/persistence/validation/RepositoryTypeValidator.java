/*******************************************************************************
 * Copyright (c) 2015 UNIT Information Technologies R&D Ltd
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ferhat Erata - initial API and implementation
 *     H. Emre Kirmizi - initial API and implementation
 *     Serhat Celik - initial API and implementation
 *     U. Anil Ozturk - initial API and implementation
 *******************************************************************************/
/**
 *
 * $Id$
 */
package eu.modelwriter.traceability.core.persistence.validation;

import eu.modelwriter.traceability.core.persistence.ItemType;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link eu.modelwriter.traceability.core.persistence.RepositoryType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RepositoryTypeValidator {
  boolean validate();

  boolean validateItem(EList<ItemType> value);
}
