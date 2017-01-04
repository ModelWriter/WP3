package eu.modelwriter.core.alloyinecore.ui.cs2as.mapping;

import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.ModuleContext;

public class CS2ASInitializer {
  public static final CS2ASInitializer instance = new CS2ASInitializer();

  public void initialize(final ModuleContext ctx) {
    ImportInitializer.instance.visit(ctx);
    PackageInitializer.instance.visit(ctx);
    ClassifierInitializer.instance.visit(ctx);
    ReferenceInitializer.instance.visit(ctx);
  }

  public void clearInitializer() {
    PackageInitializer.instance.clear();
    ClassifierInitializer.instance.clear();
    ReferenceInitializer.instance.clear();
  }
}
