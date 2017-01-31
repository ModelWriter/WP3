import eu.modelwriter.core.alloyinecore.structure.*;
import eu.modelwriter.core.alloyinecore.structure.Class;
import eu.modelwriter.core.alloyinecore.visitor.BaseModuleVisitor;

public class DummyVisitor extends BaseModuleVisitor {

    @Override
    public Element visitImport(Import _import) {
        System.out.println(_import.getLabel());
        return super.visitImport(_import);
    }

    @Override
    public Element visitEcoreImport(EcoreImport ecoreImport) {
        System.out.println(ecoreImport.getLabel());
        return super.visitEcoreImport(ecoreImport);
    }

    @Override
    public Element visitClass(Class _class) {
        System.out.println(_class.getLabel());
        return super.visitClass(_class);
    }

    @Override
    public Element visitAttribute(Attribute attribute) {
        System.out.println(attribute.getLabel());
        return super.visitAttribute(attribute);
    }

    @Override
    public Element visitTranspose(Expression.Transpose transpose) {
        System.out.println(transpose.getLabel());
        return super.visitTranspose(transpose);
    }
}
