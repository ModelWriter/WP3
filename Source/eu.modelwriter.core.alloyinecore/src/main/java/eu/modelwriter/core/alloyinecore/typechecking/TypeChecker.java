package eu.modelwriter.core.alloyinecore.typechecking;

import eu.modelwriter.core.alloyinecore.structure.model.*;
import eu.modelwriter.core.alloyinecore.structure.model.Class;
import eu.modelwriter.core.alloyinecore.structure.model.Enum;
import eu.modelwriter.core.alloyinecore.structure.model.Package;
import eu.modelwriter.core.alloyinecore.visitor.BaseVisitorImpl;
import org.antlr.v4.runtime.Token;

import javax.tools.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class TypeChecker {

    private Set<TypeErrorListener> errorListeners;
    private JavaSourceGenerator generator;
    private String outDir;
    private boolean saveJavaFiles;

    public TypeChecker(String outDir, boolean saveJavaFiles) {
        this.saveJavaFiles = saveJavaFiles;
        try {
            Path path = Paths.get(outDir);
            if (!Files.exists(path))
                Files.createDirectories(path);
            this.outDir = outDir;
        } catch (IOException e) {
            outDir = "";
            e.printStackTrace();
        }
        errorListeners = new HashSet<>();
        generator = new JavaSourceGenerator(outDir, saveJavaFiles);
    }

    public void addErrorListener(TypeErrorListener listener) {
        errorListeners.add(listener);
    }

    public void removeErrorListener(TypeErrorListener listener) {
        errorListeners.remove(listener);
    }

    public void check(Model model) {
        ClassVisitor classVisitor = new ClassVisitor();
        classVisitor.visit(model);
        Set<JavaSourceFromString> generatedJavaFiles = generator.getGeneratedFiles();
        if (saveJavaFiles) saveGeneratedFiles(generatedJavaFiles);

        // Don't compile if there is no generated file, it will fail
        if (generatedJavaFiles.isEmpty()) return;

        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<>();
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(diagnostics, null, null);
        List<String> options = outDir.isEmpty() ? null : Arrays.asList("-d", outDir); // -d: output dir
        compiler.getTask(null, fileManager, diagnostics, options, null, generatedJavaFiles).call();
        for (Diagnostic<? extends JavaFileObject> diagnostic : diagnostics.getDiagnostics()) {
            Set<Token> elements = generator.findTokens(diagnostic);
            for (TypeErrorListener listener : errorListeners) {
                String message = diagnostic.getMessage(Locale.getDefault());
                message += System.getProperty("line.separator") + "(" + diagnostic.getCode() + ")";
                if (diagnostic.getKind() == Diagnostic.Kind.ERROR)
                    listener.onTypeError(message, elements);
                else if (diagnostic.getKind() == Diagnostic.Kind.WARNING || diagnostic.getKind() == Diagnostic.Kind.MANDATORY_WARNING)
                    listener.onTypeWarning(message, elements);
            }
            System.err.format("%s %nMapped to: %s %n%n", diagnostic.toString(), generator.getTokensAsString(diagnostic));
        }
        try {
            // Try to close fileManager
            fileManager.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveGeneratedFiles(final Set<JavaSourceFromString> generatedJavaFiles) {
        new Thread(() -> {
            for (JavaSourceFromString generatedJavaFile : generatedJavaFiles) {
                saveFile(generatedJavaFile);
            }
        }).start();
    }

    private void saveFile(JavaSourceFromString generated) {
        try {
            Path path = Paths.get(outDir + "/" + generated.getRawName() + ".java");
            if (!Files.exists(path.getParent()))
                Files.createDirectories(path.getParent());
            Files.write(path, generated.code.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private class ClassVisitor extends BaseVisitorImpl {

        @Override
        public Object visitClass(Class _class) {
            if (_class.getOwner() instanceof Package) {
                JavaSourceFromString javaSource = generator.generateInterface(_class);
                System.out.println(javaSource.code + "\n\n");
            }
            return null;
        }

        @Override
        public Object visitInterface(Interface _interface) {
            if (_interface.getOwner() instanceof Package) {
                JavaSourceFromString javaSource = generator.generateInterface(_interface);
                System.out.println(javaSource.code + "\n\n");
            }
            return null;
        }

        @Override
        public Object visitEnum(Enum _enum) {
            if (_enum.getOwner() instanceof Package) {
                JavaSourceFromString javaSource = generator.generateEnum(_enum);
                System.out.println(javaSource.code + "\n\n");
            }
            return null;
        }

        @Override
        public Object visitDataType(DataType dataType) {
            if (dataType.getOwner() instanceof Package) {
                JavaSourceFromString javaSource = generator.generateDataType(dataType);
                System.out.println(javaSource.code + "\n\n");
            }
            return super.visitDataType(dataType);
        }
    }
}
