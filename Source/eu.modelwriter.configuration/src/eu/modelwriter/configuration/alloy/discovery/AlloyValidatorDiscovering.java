package eu.modelwriter.configuration.alloy.discovery;

import java.util.Map;

import edu.mit.csail.sdg.alloy4.A4Reporter;
import edu.mit.csail.sdg.alloy4.Err;
import edu.mit.csail.sdg.alloy4.ErrorWarning;
import edu.mit.csail.sdg.alloy4compiler.ast.Command;
import edu.mit.csail.sdg.alloy4compiler.ast.Module;
import edu.mit.csail.sdg.alloy4compiler.parser.CompUtil;
import edu.mit.csail.sdg.alloy4compiler.translator.A4Options;
import edu.mit.csail.sdg.alloy4compiler.translator.A4Solution;
import edu.mit.csail.sdg.alloy4compiler.translator.TranslateAlloyToKodkod;

public class AlloyValidatorDiscovering {
  public static Map<String, Integer> discoverSigs;

  public static boolean validate() {
    final InstanceTranslatorDiscovering instanceTranslator = new InstanceTranslatorDiscovering();
    instanceTranslator.translate();
    AlloyValidatorDiscovering.discoverSigs = instanceTranslator.getDiscoverSig2ExpectValue();

    final String filename = instanceTranslator.getBaseFileDirectory() + "discovering.als";

    try {
      final A4Reporter rep = new A4Reporter() {
        @Override
        public void warning(final ErrorWarning msg) {
          System.out.print("Relevance Warning:\n" + msg.toString().trim() + "\n\n");
          System.out.flush();
        }
      };
      Module world = null;

      world = CompUtil.parseEverything_fromFile(rep, null, filename);

      final A4Options options = new A4Options();
      options.solver = A4Options.SatSolver.SAT4J;

      for (final Command command : world.getAllCommands()) {
        A4Solution ans = null;
        ans = TranslateAlloyToKodkod.execute_command(rep, world.getAllReachableSigs(), command,
            options);

        if (ans.satisfiable()) {
          return true;
        }
      }

    } catch (final Err e) {
      e.printStackTrace();
    }

    return false;
  }

}
