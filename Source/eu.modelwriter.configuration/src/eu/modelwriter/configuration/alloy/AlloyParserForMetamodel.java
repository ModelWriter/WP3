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
package eu.modelwriter.configuration.alloy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.PlatformUI;

import edu.mit.csail.sdg.alloy4.A4Reporter;
import edu.mit.csail.sdg.alloy4.Err;
import edu.mit.csail.sdg.alloy4.ErrorWarning;
import edu.mit.csail.sdg.alloy4.SafeList;
import edu.mit.csail.sdg.alloy4compiler.ast.Module;
import edu.mit.csail.sdg.alloy4compiler.ast.Sig;
import edu.mit.csail.sdg.alloy4compiler.ast.Sig.Field;
import edu.mit.csail.sdg.alloy4compiler.ast.Sig.PrimSig;
import edu.mit.csail.sdg.alloy4compiler.ast.Sig.SubsetSig;
import edu.mit.csail.sdg.alloy4compiler.ast.Type;
import edu.mit.csail.sdg.alloy4compiler.ast.Type.ProductType;
import edu.mit.csail.sdg.alloy4compiler.parser.CompUtil;
import eu.modelwriter.configuration.internal.AlloyUtilities;
import eu.modelwriter.marker.internal.MarkerTypeElement;
import eu.modelwriter.traceability.core.persistence.AlloyType;
import eu.modelwriter.traceability.core.persistence.DocumentRoot;
import eu.modelwriter.traceability.core.persistence.FieldType;
import eu.modelwriter.traceability.core.persistence.InstanceType;
import eu.modelwriter.traceability.core.persistence.RelationType;
import eu.modelwriter.traceability.core.persistence.RepositoryType;
import eu.modelwriter.traceability.core.persistence.SigType;
import eu.modelwriter.traceability.core.persistence.SourceType;
import eu.modelwriter.traceability.core.persistence.TypeType;
import eu.modelwriter.traceability.core.persistence.TypesType;
import eu.modelwriter.traceability.core.persistence.persistenceFactory;

public class AlloyParserForMetamodel {

  private String filename;
  private ArrayList<String> rels = new ArrayList<String>();
  private Map<SigType, String> sigTypeParentMap = new HashMap<SigType, String>();
  private ArrayList<MarkerTypeElement> types = new ArrayList<MarkerTypeElement>();

  AlloyParserForMetamodel() {}

  public AlloyParserForMetamodel(String filename) {
    this.filename = filename;
    this.parse(filename);
  }

  private MarkerTypeElement convertToMarkerType(Sig rootSig) {
    if (rootSig instanceof PrimSig) {
      PrimSig primSig = (PrimSig) rootSig;
      MarkerTypeElement rootType;
      if (primSig.isAbstract != null) {
        rootType = new MarkerTypeElement(
            primSig.toString().substring(primSig.toString().indexOf("/") + 1) + " {abs}");
      } else {
        rootType = new MarkerTypeElement(
            primSig.toString().substring(primSig.toString().indexOf("/") + 1));
      }
      try {
        if (primSig.children().isEmpty()) {
          return rootType;
        } else {
          for (int i = 0; i < primSig.children().size(); i++) {
            rootType.getChildren().add(this.convertToMarkerType(primSig.children().get(i)));
          }
          return rootType;
        }
      } catch (Err e) {
        MessageDialog dialog =
            new MessageDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
                "Alloy Error Information", null, e.getMessage(), MessageDialog.INFORMATION,
                new String[] {"OK"}, 0);
        dialog.open();
      }
    } else if (rootSig instanceof SubsetSig) {
      SubsetSig subsetSig = (SubsetSig) rootSig;
      String parentName = subsetSig.type().toString();
      parentName = parentName.substring(parentName.indexOf("/") + 1, parentName.length() - 1);
      MarkerTypeElement parentMarkerType = getMarkTypeElementByName(parentName, types);
      parentMarkerType.getChildren().add(new MarkerTypeElement(
          subsetSig.toString().substring(subsetSig.toString().indexOf("/") + 1)));
    }
    return null;
  }

  private MarkerTypeElement getMarkTypeElementByName(String elementName,
      ArrayList<MarkerTypeElement> typeList) {
    MarkerTypeElement element = null;

    for (MarkerTypeElement markerTypeElement : typeList) {
      if (markerTypeElement.getType().contains("{abs}") && markerTypeElement.getType()
          .substring(0, markerTypeElement.getType().indexOf(" {abs}")).equals(elementName)
          || markerTypeElement.getType().equals(elementName))
        return markerTypeElement;
      if (markerTypeElement.getChildren().size() != 0)
        element = getMarkTypeElementByName(elementName, markerTypeElement.getChildren());
      if (element != null)
        break;
    }

    return element;
  }

  private DocumentRoot createBaseXmlFile() {
    // Resource res = AlloyUtilities.getResource();
    // RepositoryType oldRepositoryType = null;
    //
    // if (res == null) {
    // res = AlloyUtilities.createResource();
    // } else {
    // DocumentRoot oldDocumentRoot = (DocumentRoot) res.getContents().get(0);
    // oldRepositoryType = oldDocumentRoot.getAlloy().getRepository();
    // }

    RepositoryType oldRepositoryType = null;
    RelationType oldRelationType = null;
    DocumentRoot oldDocumentRoot = AlloyUtilities.getDocumentRoot();
    if (oldDocumentRoot != null) {
      oldRepositoryType = oldDocumentRoot.getAlloy().getRepository();
      oldRelationType = oldDocumentRoot.getAlloy().getRelation();
    }

    // RepositoryType oldRepositoryType = null;
    // if (res.getContents().size() != 0) {
    // DocumentRoot oldDocumentRoot = (DocumentRoot) res.getContents().get(0);
    // oldRepositoryType = oldDocumentRoot.getAlloy().getRepository();
    // }

    DocumentRoot documentRoot = persistenceFactory.eINSTANCE.createDocumentRoot();

    AlloyType alloyType = persistenceFactory.eINSTANCE.createAlloyType();
    documentRoot.setAlloy(alloyType);
    alloyType.setBuilddate("");
    if (oldRepositoryType == null) {
      RepositoryType repositoryType = persistenceFactory.eINSTANCE.createRepositoryType();
      repositoryType.setNextId(0);
      alloyType.setRepository(repositoryType);
    } else {
      alloyType.setRepository(oldRepositoryType);
    }

    if (oldRelationType == null) {
      RelationType relationType = persistenceFactory.eINSTANCE.createRelationType();
      alloyType.setRelation(relationType);
    } else {
      alloyType.setRelation(oldRelationType);
    }

    InstanceType instanceType = persistenceFactory.eINSTANCE.createInstanceType();
    alloyType.setInstance(instanceType);
    instanceType.setBitwidth(0);
    instanceType.setFilename(this.filename);
    instanceType.setMaxseq(0);
    instanceType.setMetamodel("yes");

    SigType sigSegInt = persistenceFactory.eINSTANCE.createSigType();
    instanceType.getSig().add(sigSegInt);
    sigSegInt.setID(0);
    sigSegInt.setLabel("seq/Int");
    sigSegInt.setParentID(1);
    sigSegInt.setBuiltin("yes");

    SigType sigInt = persistenceFactory.eINSTANCE.createSigType();
    instanceType.getSig().add(sigInt);
    sigInt.setID(1);
    sigInt.setLabel("Int");
    sigInt.setParentID(2);
    sigInt.setBuiltin("yes");

    SigType sigUniv = persistenceFactory.eINSTANCE.createSigType();
    instanceType.getSig().add(sigUniv);
    sigUniv.setID(2);
    sigUniv.setLabel("univ");
    sigUniv.setBuiltin("yes");

    SigType sigString = persistenceFactory.eINSTANCE.createSigType();
    instanceType.getSig().add(sigString);
    sigString.setID(3);
    sigString.setLabel("String");
    sigString.setParentID(2);
    sigString.setBuiltin("yes");



    // AlloyUtilities.saveResource(res, documentRoot);

    return documentRoot;
  }

  private FieldType getFieldType(Field field, int idIndex, EList<FieldType> fieldTypeList,
      EList<SigType> sigTypeList) {
    FieldType fieldType = persistenceFactory.eINSTANCE.createFieldType();

    int fieldParentId = this.parentId(field.sig.label.toString(), sigTypeList);
    int firstTypeId = this.parentId(
        field.type().toString().substring(1, field.type().toString().indexOf("->")), sigTypeList);
    fieldType.setLabel(field.label);
    fieldType.setID(idIndex);
    fieldType.setParentID(fieldParentId);

    Iterator<ProductType> iter = field.decl().expr.type().iterator();
    while (iter.hasNext()) {
      Type.ProductType productType = iter.next();

      TypesType typesType = persistenceFactory.eINSTANCE.createTypesType();
      fieldType.getTypes().add(typesType);

      TypeType firstTypeType = persistenceFactory.eINSTANCE.createTypeType();
      typesType.getType().add(firstTypeType);
      firstTypeType.setID(firstTypeId);

      TypeType secondTypeType = persistenceFactory.eINSTANCE.createTypeType();
      typesType.getType().add(secondTypeType);
      int secondTypeId = this.parentId(productType.toString(), sigTypeList);
      secondTypeType.setID(secondTypeId);
    }

    return fieldType;
  }

  public ArrayList<String> getRels() {
    return this.rels;
  }

  private SigType getSigType(PrimSig primSig, int idIndex, EList<SigType> sigTypeList) {
    String parentName = primSig.parent.toString();


    // int parentId = parentId(parentName, sigTypeList);

    SigType sigType = persistenceFactory.eINSTANCE.createSigType();
    sigType.setID(idIndex);
    sigType.setLabel(primSig.label);
    // sigType.setParentID(parentId);

    this.sigTypeParentMap.put(sigType, parentName);

    setStatuofSig(primSig, sigType);

    return sigType;
  }

  public ArrayList<MarkerTypeElement> getTypes() {
    return this.types;
  }

  private int parentId(String parentName, EList<SigType> sigTypeList) {

    for (SigType sigType : sigTypeList) {
      if (sigType.getLabel().equals(parentName)) {
        return sigType.getID();
      }
    }

    return -1;

  }

  private void parse(String filename) {
    // AlloyUtilities.createXMLFromAlloy(filename);
    try {
      A4Reporter rep = new A4Reporter() {
        // For example, here we choose to display each "warning" by printing it to System.out

        @Override
        public void warning(ErrorWarning msg) {
          MessageDialog dialog =
              new MessageDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
                  "Alloy Error Information", null,
                  "Relevance Warning:\n" + (msg.toString().trim()) + "\n\n",
                  MessageDialog.INFORMATION, new String[] {"OK"}, 0);
          dialog.open();
        }
      };

      // Parse+typecheck the model
      System.out.println("=========== Parsing+Typechecking " + filename + " =============");
      Module world;

      DocumentRoot documentRoot = this.createBaseXmlFile();
      EList<SigType> xmlSigList = documentRoot.getAlloy().getInstance().getSig();
      EList<FieldType> xmlFieldList = documentRoot.getAlloy().getInstance().getField();

      int idIndex = 4;
      Map<String, String> map = new LinkedHashMap<String, String>();
      world = CompUtil.parseEverything_fromFile(rep, map, filename);
      for (Module modules : world.getAllReachableModules()) {
        SafeList<Sig> list = modules.getAllSigs();
        for (Sig sig : list) {
          if (sig instanceof PrimSig) {
            PrimSig primSig = (PrimSig) sig;

            xmlSigList.add(this.getSigType(primSig, idIndex, xmlSigList));
            idIndex++;

            if ((primSig.children().size() == 0) && primSig.toString()
                .substring(primSig.toString().indexOf("/") + 1).equals("Univ")) {
              break;
            }
            if (primSig.isTopLevel()) {
              this.types.add(this.convertToMarkerType(primSig));
            }
          } else if (sig instanceof SubsetSig) {
            SubsetSig subsetSig = (SubsetSig) sig;
            this.convertToMarkerType(subsetSig);
            xmlSigList.add(this.getSigType(subsetSig, idIndex, xmlSigList));
            idIndex++;
            // this.types.add(this.convertToMarkerType(subsetSig));
          }
        }
      }

      this.setParentIdForSigTypes(xmlSigList);

      for (Module modules : world.getAllReachableModules()) {
        SafeList<Sig> list = modules.getAllSigs();
        for (Sig sig : list) {
          SafeList<Field> fields = sig.getFields();
          for (Field field : fields) {

            xmlFieldList.add(this.getFieldType(field, idIndex, xmlFieldList, xmlSigList));
            idIndex++;

            String product = "";
            if (field.decl().expr.type().size() > 1) {
              Iterator<ProductType> iter = field.decl().expr.type().iterator();
              while (iter.hasNext()) {
                Type.ProductType productType = iter.next();
                if (iter.hasNext()) {
                  product +=
                      productType.toString().substring(productType.toString().indexOf("/") + 1)
                          + ",";
                } else {
                  product +=
                      productType.toString().substring(productType.toString().indexOf("/") + 1);
                }
              }
            } else {
              product = field.decl().expr.type().toExpr().toString()
                  .substring(field.decl().expr.type().toExpr().toString().indexOf("/") + 1);
            }
            String str2 = field.label + " : "
                + field.sig.toString().substring(field.sig.toString().indexOf("/") + 1) + " -> "
                + field.decl().expr.mult() + " " + product;
            this.rels.add(str2);
          }
        }
      }

      Iterator<Entry<String, String>> mapIter = map.entrySet().iterator();
      while (mapIter.hasNext()) {
        Entry<String, String> entry = mapIter.next();
        SourceType sourceType = persistenceFactory.eINSTANCE.createSourceType();
        sourceType.setFilename(entry.getKey());
        sourceType.setContent(entry.getValue());
        documentRoot.getAlloy().getSource().add(sourceType);
      }

      AlloyUtilities.writeDocumentRootForMetamodel(documentRoot, filename);
      // AlloyUtilities.saveResource(AlloyUtilities.getResource(), documentRoot);

      // MessageDialog messageDialog =
      // new MessageDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
      // "Information", null, "Alloy file has been parsed succesfully",
      // MessageDialog.INFORMATION, new String[] {"OK"}, 0);
      // messageDialog.open();
    } catch (Err e) {
      MessageDialog dialog =
          new MessageDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
              "Alloy Error Information", null, e.getMessage(), MessageDialog.INFORMATION,
              new String[] {"OK"}, 0);
      dialog.open();
    }
  }

  private void setParentIdForSigTypes(EList<SigType> sigTypeList) {

    for (SigType sigType : sigTypeList) {
      String parentName = this.sigTypeParentMap.get(sigType);
      if (parentName != null) {
        int parentId = this.parentId(parentName, sigTypeList);
        sigType.setParentID(parentId);
      }
    }
  }


  private SigType getSigType(SubsetSig subsetSig, int idIndex, EList<SigType> sigTypeList) {
    String typeName = subsetSig.type().toString();
    typeName = typeName.substring(1, typeName.length() - 1);

    SigType sigType = persistenceFactory.eINSTANCE.createSigType();
    sigType.setID(idIndex);
    sigType.setLabel(subsetSig.label);

    for (SigType sigTypes : sigTypeList) {
      if (sigTypes.getLabel().equals(typeName)) {
        TypeType type = persistenceFactory.eINSTANCE.createTypeType();
        type.setID(sigTypes.getID());
        sigType.getType().add(type);
        break;
      }

    }

    setStatuofSig(subsetSig, sigType);

    return sigType;

  }

  private void setStatuofSig(Sig sig, SigType sigType) {
    if (sig.isAbstract != null)
      sigType.setAbstract("yes");
    if (sig.isEnum != null)
      sigType.setEnum("yes");
    if (sig.isLone != null)
      sigType.setLone("yes");
    if (sig.isMeta != null)
      sigType.setMeta("yes");
    if (sig.isOne != null)
      sigType.setOne("yes");
    if (sig.isPrivate != null)
      sigType.setPrivate("yes");
    if (sig.isSome != null)
      sigType.setSome("yes");
  }

}