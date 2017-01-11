/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2017, Ferhat Erata <ferhat@computer.org>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package eu.modelwriter.core.alloyinecore.recognizer;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.eclipse.emf.ecore.*;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.EAttributeContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Document {

    private final Map<String, Element> qNameStore = new HashMap<>();

    AlloyInEcoreParser parser = null;

    private static Document ourInstance = new Document();

    public static Document getInstance() {
        return ourInstance;
    }

    private Document() { }



    void addNamedElement(String qualifiedName, ENamedElement element, ParserRuleContext context, Token nameToken){
        Element<ENamedElement> e = new Element<>(qualifiedName, element, context, nameToken);
        qNameStore.put(qualifiedName, e);
    }

    void addModelElement(String qualifiedName, EModelElement element, ParserRuleContext context){
        Element<EModelElement> e = new Element<>(qualifiedName, element, context, context.start);
        qNameStore.put(qualifiedName, e);
    }

    private static String getQualifiedName(ENamedElement e){
        String qname = null;
        if (e instanceof EPackage)
            qname = Document.getQualifiedName((EPackage) e);
        else if (e instanceof EClassifier)
            qname = Document.getQualifiedName((EClassifier) e);
        else if (e instanceof EStructuralFeature)
            qname = Document.getQualifiedName((EStructuralFeature) e);
        else if (e instanceof EOperation)
            qname = Document.getQualifiedName((EOperation) e);
        else if (e instanceof EParameter)
            qname = Document.getQualifiedName((EParameter) e);
        else if (e instanceof EEnumLiteral)
            qname = Document.getQualifiedName((EEnumLiteral) e);
        return qname;
    }

    private static String getQualifiedName(EModelElement e) {
        String qname = null;
        if (e instanceof ENamedElement)
            qname = Document.getQualifiedName((ENamedElement) e);
        else if (e instanceof AlloyInEcoreParser.EAnnotationContext)
            qname = Document.getQualifiedName((EAnnotation) e);
        return qname;
    }

    private static String getQualifiedName(EPackage p) {
        return p.getESuperPackage() == null ? p.getName() : getQualifiedName(p.getESuperPackage()) + "." + p.getName();
    }

    private static String getQualifiedName(EClassifier c) {
        return getQualifiedName(c.getEPackage()) + "." + c.getName();
    }

    private static String getQualifiedName(EStructuralFeature f) {
        return getQualifiedName(f.getEContainingClass()) + "::" + f.getName();
    }

    private static String getQualifiedName(EOperation o) {
        return getQualifiedName(o.getEContainingClass()) + "->" + o.getName();
    }

    private static String getQualifiedName(EEnumLiteral l) {
        return getQualifiedName(l.getEEnum()) + "::" + l.getName();
    }

    private static String getQualifiedName(EParameter p) {
        return getQualifiedName(p.getEOperation()) + "::" + p.getName();
    }

    private static String getQualifiedName(EAnnotation a) {
        return getQualifiedName(a.getEModelElement()) + "@" + "annotation";
    }


    void signalParsingCompletion() {
        System.out.println("[NamedElement]");
        //qNameStore.values().stream().filter(element -> element.element instanceof EPackage || element.element instanceof EClass).forEach(element -> parser.notifyErrorListeners(element.token, element.qName, null));
        //qNameStore.values().forEach(element -> parser.notifyErrorListeners(element.token, element.qName, null));
        //generateReferences();
    }

    void setQualifiers(EReference reference, List<String> qualifiers){
        if (reference == null) return;
        for(String s: qualifiers){
            switch (s) {
                case "static":
                    createEAnnotation(reference, AnnotationSources.STATIC);
                    break;
                case "model":
                    createEAnnotation(reference, AnnotationSources.MODEL);
                    break;
                case "ghost":
                    createEAnnotation(reference, AnnotationSources.GHOST);
                    break;
                case "transient":
                    reference.setTransient(true);
                    break;
                case "volatile":
                    reference.setVolatile(true);
                    break;
                case "nullable":
                    createEAnnotation(reference, AnnotationSources.NULLABLE);
                    break;
                case "readonly":
                    reference.setChangeable(true);
                    break;
                case "derived":
                    reference.setDerived(true);
                    break;
                case "ordered":
                    reference.setOrdered(true);
                    break;
                case "!unique":
                    reference.setUnique(false);
                    break;
                case "composes":
                    reference.setContainment(true);
                    break;
                case "resolve":
                    reference.setResolveProxies(true);
                    break;
            }}
    }

    void setQualifiers(EAttribute attribute, List<String> qualifiers){
        if (attribute == null) return;
        for(String s: qualifiers){
            switch (s) {
                case "static":
                    createEAnnotation(attribute, AnnotationSources.STATIC);
                    break;
                case "model":
                    createEAnnotation(attribute, AnnotationSources.MODEL);
                    break;
                case "ghost":
                    createEAnnotation(attribute, AnnotationSources.GHOST);
                    break;
                case "transient":
                    attribute.setTransient(true);
                    break;
                case "volatile":
                    attribute.setVolatile(true);
                    break;
                case "nullable":
                    createEAnnotation(attribute, AnnotationSources.NULLABLE);
                    break;
                case "readonly":
                    attribute.setChangeable(true);
                    break;
                case "derived":
                    attribute.setDerived(true);
                    break;
                case "ordered":
                    attribute.setOrdered(true);
                    break;
                case "!unique":
                    attribute.setUnique(false);
                    break;
                case "unsettable":
                    attribute.setUnsettable(true);
                    break;
                case "id":
                    attribute.setID(true);
                    break;
            }}
    }

    void setQualifiers(EDataType eDataType, List<String> qualifiers){
        for(String s: qualifiers){
            switch (s) {
                case "primitive":
                    createEAnnotation(eDataType, AnnotationSources.DATATYPE_PRIMITIVE);
                    break;
                case "nullable":
                    createEAnnotation(eDataType, AnnotationSources.NULLABLE);
                    break;
                case "!serializable":
                    eDataType.setSerializable(false);
                    break;
            }}
    }

    void setQualifiers(EOperation eOperation, List<String> qualifiers){
        for(String s: qualifiers){
            switch (s) {
                case "static":
                    createEAnnotation(eOperation, AnnotationSources.STATIC);
                    break;
                case "nullable":
                    createEAnnotation(eOperation, AnnotationSources.NULLABLE);
                    break;
                case "ordered":
                    eOperation.setOrdered(true);
                    break;
                case "!unique":
                    eOperation.setUnique(false);
                    break;
            }}
    }

    void setQualifiers(EEnum eEnum, List<String> qualifiers){
        for(String s: qualifiers){
            switch (s) {
                case "!serializable":
                    eEnum.setSerializable(false);
                    break;
            }}
    }

    void setQualifiers(EParameter eParameter, List<String> qualifiers){
        for(String s: qualifiers){
            switch (s) {
                case "nullable":
                    createEAnnotation(eParameter, AnnotationSources.NULLABLE);
                    break;
                case "ordered":
                    eParameter.setOrdered(true);
                    break;
                case "!unique":
                    eParameter.setUnique(false);
                    break;
            }}
    }

    class Element<E extends EModelElement>
    {
        final E element;
        final ParserRuleContext context;
        final Token token;
        final String qName;

        Element(String qName, E element, ParserRuleContext context, Token nameToken) {
            this.element = element;
            this.context = context;
            this.token = nameToken;
            this.qName = qName;
        }
    }

    class AttributeType
    {
        EAttributeContext ownerContext;
        Token token;
        String targetQName = null;
    }

    class ReferenceType
    {
        EReference owner;
        EDataType targetElement;
        Token token;
        String targetQName = null;
    }

    class Opposite
    {
        EReference owner;
        EReference targetElement;
        Token token;
        String targetQName = null;
    }

    class SuperType
    {

    }

    EAnnotation createEAnnotation(EModelElement owner, final String source) {
        final EAnnotation eAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
        eAnnotation.setSource(source);
        owner.getEAnnotations().add(eAnnotation);
        return eAnnotation;
    }

    void createVisibilityEAnnotation(EModelElement owner, final String visibility) {
        if (visibility == null)
            return;
        final EAnnotation eAnnotation = createEAnnotation(owner, AnnotationSources.VISIBILITY);
        eAnnotation.getDetails().put("visibility", visibility);

    }


}
