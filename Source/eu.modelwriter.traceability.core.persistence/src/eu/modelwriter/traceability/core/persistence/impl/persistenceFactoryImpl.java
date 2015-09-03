/**
 */
package eu.modelwriter.traceability.core.persistence.impl;

import eu.modelwriter.traceability.core.persistence.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class persistenceFactoryImpl extends EFactoryImpl implements persistenceFactory {
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static persistenceFactory init() {
    try {
      persistenceFactory thepersistenceFactory = (persistenceFactory)EPackage.Registry.INSTANCE.getEFactory(persistencePackage.eNS_URI);
      if (thepersistenceFactory != null) {
        return thepersistenceFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new persistenceFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public persistenceFactoryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case persistencePackage.ALLOY_TYPE: return createAlloyType();
      case persistencePackage.ATOM_TYPE: return createAtomType();
      case persistencePackage.DOCUMENT_ROOT: return createDocumentRoot();
      case persistencePackage.FIELD_TYPE: return createFieldType();
      case persistencePackage.INSTANCE_TYPE: return createInstanceType();
      case persistencePackage.MARKER_TYPE: return createMarkerType();
      case persistencePackage.PROPERTIES_TYPE: return createPropertiesType();
      case persistencePackage.REPOSITORY_TYPE: return createRepositoryType();
      case persistencePackage.SIG_TYPE: return createSigType();
      case persistencePackage.SOURCE_TYPE: return createSourceType();
      case persistencePackage.TUPLE_TYPE: return createTupleType();
      case persistencePackage.TYPES_TYPE: return createTypesType();
      case persistencePackage.TYPE_TYPE: return createTypeType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlloyType createAlloyType() {
    AlloyTypeImpl alloyType = new AlloyTypeImpl();
    return alloyType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtomType createAtomType() {
    AtomTypeImpl atomType = new AtomTypeImpl();
    return atomType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DocumentRoot createDocumentRoot() {
    DocumentRootImpl documentRoot = new DocumentRootImpl();
    return documentRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldType createFieldType() {
    FieldTypeImpl fieldType = new FieldTypeImpl();
    return fieldType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceType createInstanceType() {
    InstanceTypeImpl instanceType = new InstanceTypeImpl();
    return instanceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MarkerType createMarkerType() {
    MarkerTypeImpl markerType = new MarkerTypeImpl();
    return markerType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertiesType createPropertiesType() {
    PropertiesTypeImpl propertiesType = new PropertiesTypeImpl();
    return propertiesType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RepositoryType createRepositoryType() {
    RepositoryTypeImpl repositoryType = new RepositoryTypeImpl();
    return repositoryType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SigType createSigType() {
    SigTypeImpl sigType = new SigTypeImpl();
    return sigType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SourceType createSourceType() {
    SourceTypeImpl sourceType = new SourceTypeImpl();
    return sourceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TupleType createTupleType() {
    TupleTypeImpl tupleType = new TupleTypeImpl();
    return tupleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypesType createTypesType() {
    TypesTypeImpl typesType = new TypesTypeImpl();
    return typesType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeType createTypeType() {
    TypeTypeImpl typeType = new TypeTypeImpl();
    return typeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public persistencePackage getpersistencePackage() {
    return (persistencePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static persistencePackage getPackage() {
    return persistencePackage.eINSTANCE;
  }

} //persistenceFactoryImpl