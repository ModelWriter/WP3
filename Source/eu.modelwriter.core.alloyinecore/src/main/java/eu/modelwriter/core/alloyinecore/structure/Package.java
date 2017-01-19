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

import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.EPackageContext;
import org.antlr.v4.runtime.misc.Interval;
import org.eclipse.emf.ecore.EPackage;

public final class Package extends NamedElement<EPackage, EPackageContext> implements IVisibility{

    public Package(String qPath, EPackage ePackage, EPackageContext context) {
        super(qPath, ePackage, context);
    }

//    @Override
//    public String getLabel() {
//        return getEObject().getName() + " : '" + getEObject().getNsURI() + "'";
//    }

    @Override
    public String getLabel() {
        String name;
        String nsURI;
        if (getContext().name != null){
            name = getContext().name.getText();
        } else {
            name = "Package";
        }
        if (getContext().nsURI != null){
            nsURI = getContext().nsURI.getText();
        }else {
            nsURI = "";
        }
        return name + " : " + nsURI;
    }

    @Override
    public Visibility getVisibility() {
        Visibility visibility = Visibility.PACKAGE;
        if (getContext().visibility != null) {
            String text = getContext().visibility.getText();
            try {
                visibility = Visibility.valueOf(text.toUpperCase(java.util.Locale.ENGLISH));
            } catch (IllegalArgumentException e){visibility = Visibility.PACKAGE;}
        }
        return visibility;
    }
}
