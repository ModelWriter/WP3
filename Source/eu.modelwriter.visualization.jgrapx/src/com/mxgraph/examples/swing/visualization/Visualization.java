package com.mxgraph.examples.swing.visualization;

import java.io.File;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.mxgraph.model.mxCell;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxDomUtils;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxMultiplicity;

public class Visualization extends JFrame {
  private static final long serialVersionUID = 1L;

  public static void main(final String[] args) {
    final Visualization frame = new Visualization();
    JFrame.setDefaultLookAndFeelDecorated(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(870, 640);
    frame.setVisible(true);
  }

  public Visualization() {
    super("Visualization");

    final VisualizationGraphEditor vge = new VisualizationGraphEditor();
    final mxGraph graph = vge.getGraph();
    final mxGraphComponent graphComponent = vge.getGraphComponent();

    graph.setMultiplicities(this.createMultiplicities());
    this.createSample(graph);

    // Initial validation
    graphComponent.validateGraph();

    this.getContentPane().add(graphComponent);
  }

  private mxMultiplicity[] createMultiplicities() {
    final mxMultiplicity[] multiplicities = new mxMultiplicity[3];

    multiplicities[0] =
        new mxMultiplicity(true, "Alias", null, null, 0, String.valueOf(Integer.MAX_VALUE),
            Arrays.asList(new String[] {"Word"}), null, "Alias Must Connect to Word", true);

    multiplicities[1] =
        new mxMultiplicity(true, "Directory", null, null, 0, String.valueOf(Integer.MAX_VALUE),
            Arrays.asList(new String[] {"Word", "Alias", "Directory", "Root"}), null,
            "Directory Must Connect to Object", true);

    multiplicities[2] =
        new mxMultiplicity(true, "Root", null, null, 0, String.valueOf(Integer.MAX_VALUE),
            Arrays.asList(new String[] {"Word", "Alias", "Directory", "Root"}), null,
            "final Directory Must Connect final to Object", true);

    multiplicities[2] = new mxMultiplicity(true, "Word", null, null, 0, "0", null,
        "Word can not connect to any other", null, true);
    return multiplicities;
  }

  @SuppressWarnings("unused")
  private void createSample(final mxGraph graph) {
    final Document xmlDocument = mxDomUtils.createDocument();

    final Element Relation = xmlDocument.createElement("Relation");
    xmlDocument.appendChild(Relation);

    final Element Root$0 = xmlDocument.createElement("Root");
    Relation.appendChild(Root$0);
    Root$0.setAttribute("label", "Root$0");
    final Element Directory$0 = xmlDocument.createElement("Directory");
    Relation.appendChild(Directory$0);
    Directory$0.setAttribute("label", "Directory$0");
    final Element Directory$1 = xmlDocument.createElement("Directory");
    Relation.appendChild(Directory$1);
    Directory$1.setAttribute("label", "Directory$1");
    final Element Alias$0 = xmlDocument.createElement("Alias");
    Relation.appendChild(Alias$0);
    Alias$0.setAttribute("label", "Alias$0");
    final Element Alias$1 = xmlDocument.createElement("Alias");
    Relation.appendChild(Alias$1);
    Alias$1.setAttribute("label", "Alias$1");
    final Element Alias$2 = xmlDocument.createElement("Alias");
    Relation.appendChild(Alias$2);
    Alias$2.setAttribute("label", "Alias$2");
    final Element Word$0 = xmlDocument.createElement("Word");
    Relation.appendChild(Word$0);
    Word$0.setAttribute("label", "Word$0");
    final Element Word$1 = xmlDocument.createElement("Word");
    Relation.appendChild(Word$1);
    Word$1.setAttribute("label", "Word$1");
    final Element Word$2 = xmlDocument.createElement("Word");
    Relation.appendChild(Word$2);
    Word$2.setAttribute("label", "Word$2");
    final Element Word$3 = xmlDocument.createElement("Word");
    Relation.appendChild(Word$3);
    Word$3.setAttribute("label", "Word$3");

    Transformer transformer;
    try {
      transformer = TransformerFactory.newInstance().newTransformer();
      transformer.setOutputProperty(OutputKeys.INDENT, "yes");
      transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "3");
      final DOMSource source = new DOMSource(xmlDocument);
      final StreamResult console =
          new StreamResult(new File("C:/Users/emre.kirmizi/Desktop/out.xml"));
      // final StreamResult console =
      // new StreamResult(new File("C:/Users/anil.ozturk/Desktop/out.xml"));
      transformer.transform(source, console);
    } catch (TransformerFactoryConfigurationError | TransformerException e) {
      e.printStackTrace();
    }

    final Object parent = graph.getDefaultParent();

    graph.getModel().beginUpdate();
    try {
      final mxCell vertexR0 = (mxCell) graph.insertVertex(parent, null, Root$0, 0, 0, 80, 30);
      final mxCell vertexD0 = (mxCell) graph.insertVertex(parent, null, Directory$0, 0, 0, 80, 30);
      final mxCell vertexD1 = (mxCell) graph.insertVertex(parent, null, Directory$1, 0, 0, 80, 30);
      final mxCell vertexA0 = (mxCell) graph.insertVertex(parent, null, Alias$0, 0, 0, 80, 30);
      final mxCell vertexA1 = (mxCell) graph.insertVertex(parent, null, Alias$1, 0, 0, 80, 30);
      final mxCell vertexA2 = (mxCell) graph.insertVertex(parent, null, Alias$2, 0, 0, 80, 30);
      final mxCell vertexW0 = (mxCell) graph.insertVertex(parent, null, Word$0, 0, 0, 80, 30);
      final mxCell vertexW1 = (mxCell) graph.insertVertex(parent, null, Word$1, 0, 0, 80, 30);
      final mxCell vertexW2 = (mxCell) graph.insertVertex(parent, null, Word$2, 0, 0, 80, 30);
      final mxCell vertexW3 = (mxCell) graph.insertVertex(parent, null, Word$3, 0, 0, 80, 30);
      final mxCell edgeC0 = (mxCell) graph.insertEdge(parent, null, "contents", vertexR0, vertexA0);
      final mxCell edgeC1 = (mxCell) graph.insertEdge(parent, null, "contents", vertexR0, vertexA1);
      final mxCell edgeC2 = (mxCell) graph.insertEdge(parent, null, "contents", vertexR0, vertexD0);
      final mxCell edgeC3 = (mxCell) graph.insertEdge(parent, null, "contents", vertexD0, vertexD1);
      final mxCell edgeC4 = (mxCell) graph.insertEdge(parent, null, "contents", vertexD0, vertexW0);
      final mxCell edgeC5 = (mxCell) graph.insertEdge(parent, null, "contents", vertexD1, vertexW1);
      final mxCell edgeC6 = (mxCell) graph.insertEdge(parent, null, "contents", vertexD1, vertexW2);
      final mxCell edgeC7 = (mxCell) graph.insertEdge(parent, null, "contents", vertexD1, vertexA2);
      final mxCell edgeR0 = (mxCell) graph.insertEdge(parent, null, "refs", vertexA2, vertexW0);
      final mxCell edgeR1 = (mxCell) graph.insertEdge(parent, null, "refs", vertexA2, vertexW1);
      final mxCell edgeR2 = (mxCell) graph.insertEdge(parent, null, "refs", vertexA2, vertexW2);
      final mxCell edgeR3 = (mxCell) graph.insertEdge(parent, null, "refs", vertexA2, vertexW3);
    } finally {
      graph.getModel().endUpdate();
    }
  }
}