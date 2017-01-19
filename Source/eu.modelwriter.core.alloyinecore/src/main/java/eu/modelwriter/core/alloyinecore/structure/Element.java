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

package eu.modelwriter.core.alloyinecore.structure;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class Element<C extends ParserRuleContext>{

    private final C context;
    private Element owner;
    private final List<Element> ownedElements = new ArrayList<>();

    public Element(C context) { this.context = context; }

    public C getContext() { return this.context; }

    public Token getToken() { return this.context.start; }

    public List<Element> getOwnedElements() { return ownedElements; }

    public boolean hasOwnedElements(){ return !ownedElements.isEmpty(); }


    public <K extends Element> void addOwnedElement(K child) {
        ownedElements.add(child);
        child.setOwner(this);
    }

    public <K extends ModelElement> void addAllOwnedElement(Collection<K> children){  }

    public void setOwner(final Element owner) { this.owner = owner; }

    public Element getOwner() { return owner; }

    public abstract String getLabel();

    public void printTree(){
        StringBuilder tree = new StringBuilder();
        tree.append(this.getLabel());
        System.out.println("[OUTLINE]");
        traverse(this, 0);
    }

    private void traverse(Element<? extends ParserRuleContext> element, int tabCount){
        for (int i = 0; i < tabCount; i++) {
            System.out.print("\t");
        }
        if (element instanceof IVisibility)
            System.out.print(((IVisibility) element).getVisibility() + " ");
        else System.out.print("  ");
        System.out.println("[" + (element instanceof Class && ((Class)element).isAbstract() ? "abstract " : "") + element.getClass().getSimpleName() + "] " + element.getLabel());
        List<Element> elements = element.getOwnedElements();
        for(Element e: elements) {
            traverse(e, tabCount + 1);
        }
    }
}

