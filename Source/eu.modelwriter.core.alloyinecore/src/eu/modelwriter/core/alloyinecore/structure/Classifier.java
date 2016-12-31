/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2016, Ferhat Erata <ferhat@computer.org>
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

public abstract class Classifier<T extends ParserRuleContext> extends NamedElement<T> {

    public Visibility visibility = Visibility.PACKAGE;
    public String instanceClassName;
    private Package owner = null;

    public Classifier(String name, Package owner, T context) {
        super(name, context);
        this.setOwner(owner);
        this.qualifiedName = Document.getQualifiedName(this);
    }

    public Classifier(String name) {
        super(name);
    }

    public void setOwner(Package owner) {
        this.owner = owner;
    }

    @Override
    public Package getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Classifier{" +
                "visibility=" + visibility +
                ", instanceClassName='" + instanceClassName + '\'' +
                ", owner=" + owner +
                "} " + super.toString();
    }
}