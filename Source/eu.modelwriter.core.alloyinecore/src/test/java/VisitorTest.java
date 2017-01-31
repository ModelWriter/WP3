import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreLexer;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser;
import eu.modelwriter.core.alloyinecore.recognizer.UnderlineErrorListener;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class VisitorTest {

    public static void main(final String[] args) {
        visit();
    }

    @Test
    public void testVisit() {
        visit();
    }

    private static void visit() {
        ANTLRInputStream input = null;
        final File file = new File("./src/test/resources/AlloyInECore/Generics1.recore");
        try {
            input = new ANTLRFileStream(file.getAbsolutePath());
        } catch (final IOException e) {
            e.printStackTrace();
        }
        final AlloyInEcoreLexer lexer = new AlloyInEcoreLexer(input);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final AlloyInEcoreParser parser = new AlloyInEcoreParser(tokens, file.getName().substring(0, file.getName().indexOf(".")), "./src/test/resources/out/");
        parser.removeErrorListeners();
        parser.addErrorListener(new UnderlineErrorListener());
        parser.module();

        DummyVisitor visitor = new DummyVisitor();
        visitor.visit(parser.module);
    }

}
