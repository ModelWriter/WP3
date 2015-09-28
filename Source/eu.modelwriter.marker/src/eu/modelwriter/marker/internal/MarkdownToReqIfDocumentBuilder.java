package eu.modelwriter.marker.internal;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import javax.management.RuntimeErrorException;

import org.eclipse.mylyn.wikitext.core.parser.Attributes;
import org.eclipse.mylyn.wikitext.core.parser.DocumentBuilder;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;

public class MarkdownToReqIfDocumentBuilder extends DocumentBuilder {

  public StringWriter writer2 = new StringWriter();
  HashMap<SpecHierarchy, Integer> map = new HashMap<SpecHierarchy, Integer>();
  Stack<SpecHierarchy> stack = new Stack<SpecHierarchy>();
  int startLevel, beforeLevel;
  ArrayList<SpecHierarchy> rootSet = new ArrayList<SpecHierarchy>();

  String blockSpec;

  SpecHierarchy specHierarchy = null;
  SpecObject specObject = null;

  @Override
  public void acronym(String text, String definition) {}

  @Override
  public void beginBlock(BlockType type, Attributes attributes) {
    this.blockSpec = "";
  }

  @Override
  public void beginDocument() {}

  @Override
  public void beginHeading(int level, Attributes attributes) {
    this.specHierarchy = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
    this.specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
    this.specHierarchy.setObject(this.specObject);

    if (this.stack.isEmpty()) {// if the new coming is root push to stack
      this.startLevel = level;
      this.map.put(this.specHierarchy, level);
      this.stack.push(this.specHierarchy);
    } else if (this.beforeLevel == level) {// if the newcoming's level equals to before's , pop
      // before push new
      this.stack.pop();
      this.map.put(this.specHierarchy, level);
      this.stack.push(this.specHierarchy);
    } else if (level > this.beforeLevel) {// if the new coming is before's child , set before's
      // child , and push new
      this.stack.peek().getChildren().add(this.specHierarchy);
      this.map.put(this.specHierarchy, level);
      this.stack.push(this.specHierarchy);
    } else if ((level < this.beforeLevel) && (level >= this.startLevel)) {// if the new coming is
                                                                          // child of
      // before any element except of
      // before element
      for (;;) {
        if (this.map.get(this.stack.peek()) >= level) {
          this.stack.pop();
        } else {
          break;
        }
      }
      this.map.put(this.specHierarchy, level);
      this.stack.push(this.specHierarchy);
    } else if (level < this.startLevel) {// if the new coming's level bigger than root
      throw new RuntimeErrorException(null, "Root must be lowest level.");
    }
    this.beforeLevel = level;
  }

  @Override
  public void beginSpan(SpanType type, Attributes attributes) {

  }

  @Override
  public void characters(String text) {
    this.blockSpec += text;
    AttributeValueString attribute = ReqIF10Factory.eINSTANCE.createAttributeValueString();
    attribute.setTheValue(text);
    this.specObject.getValues().add(attribute);
    this.specObject.setIdentifier(ReqIF10Factory.eINSTANCE.createAlternativeID().toString());
  }

  @Override
  public void charactersUnescaped(String literal) {}

  @Override
  public void endBlock() {

    this.specHierarchy = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
    this.specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
    this.specHierarchy.setObject(this.specObject);
    AttributeValueString attribute = ReqIF10Factory.eINSTANCE.createAttributeValueString();
    attribute.setTheValue(this.blockSpec);
    this.specObject.getValues().add(attribute);
    this.specObject.setIdentifier(ReqIF10Factory.eINSTANCE.createAlternativeID().toString());
    this.stack.peek().getChildren().add(this.specHierarchy); // paragraph has been set its own
                                                             // heading's child.
  }

  @Override
  public void endDocument() {// TODO map ine g�re �ekelim
    for (Map.Entry<SpecHierarchy, Integer> entry : this.map.entrySet()) {
      if (entry.getValue() == this.startLevel) {
        this.rootSet.add(entry.getKey());
      }
    }
    // try {
    // while (!stack.isEmpty()) {
    // Iterator<AttributeValue> iter = stack.pop().getObject().getValues().iterator();
    // while (iter.hasNext()) {
    // AttributeValue attributeValue = (AttributeValue) iter.next();
    // if (attributeValue instanceof AttributeValueString) {
    // System.out.println(((AttributeValueString) attributeValue).getTheValue());
    // }
    // }
    // }
    // writer2.close();
    // } catch (IOException e) {
    // e.printStackTrace();
    // }
  }

  @Override
  public void endHeading() {}

  @Override
  public void endSpan() {

  }

  @Override
  public void entityReference(String entity) {}

  public ArrayList<SpecHierarchy> getRootSet() {
    return this.rootSet;
  }

  @Override
  public void image(Attributes attributes, String url) {}

  @Override
  public void imageLink(Attributes linkAttributes, Attributes imageAttributes, String href,
      String imageUrl) {}

  @Override
  public void lineBreak() {}

  @Override
  public void link(Attributes attributes, String hrefOrHashName, String text) {}
}
