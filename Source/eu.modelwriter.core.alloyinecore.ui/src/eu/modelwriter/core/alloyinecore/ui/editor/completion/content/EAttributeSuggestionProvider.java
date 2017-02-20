package eu.modelwriter.core.alloyinecore.ui.editor.completion.content;

import java.util.HashSet;
import java.util.Set;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreLexer;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.DerivationContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.EAnnotationContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.EAttributeContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.EGenericElementTypeContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.EMultiplicityContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.InitialContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.UnrestrictedNameContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.VisibilityKindContext;
import eu.modelwriter.core.alloyinecore.ui.editor.completion.util.AIESuggestionProviderSingletonFactory;
import eu.modelwriter.core.alloyinecore.ui.editor.completion.util.AbstractAIESuggestionProvider;
import eu.modelwriter.core.alloyinecore.ui.editor.completion.util.CompletionTokens;

public class EAttributeSuggestionProvider extends AbstractAIESuggestionProvider {

  public static final Set<String> startSuggestions = new HashSet<>();

  @Override
  protected void initStartSuggestions() {
    EAttributeSuggestionProvider.startSuggestions
    .addAll(VisibilityKindSuggestionProvider.startSuggestions);
    EAttributeSuggestionProvider.startSuggestions.add(CompletionTokens._static);
    EAttributeSuggestionProvider.startSuggestions.add(CompletionTokens._model);
    EAttributeSuggestionProvider.startSuggestions.add(CompletionTokens._ghost);
    EAttributeSuggestionProvider.startSuggestions.add(CompletionTokens._transient);
    EAttributeSuggestionProvider.startSuggestions.add(CompletionTokens._volatile);
    EAttributeSuggestionProvider.startSuggestions.add(CompletionTokens._readonly);
    EAttributeSuggestionProvider.startSuggestions.add(CompletionTokens._attribute);
  }

  @Override
  protected void computeSuggestions(final ParserRuleContext context, final ParseTree lastToken) {
    if (lastToken instanceof ParserRuleContext) {
      if (lastToken instanceof VisibilityKindContext) {
        suggestions.add(CompletionTokens._static);
        suggestions.add(CompletionTokens._model);
        suggestions.add(CompletionTokens._ghost);
        suggestions.add(CompletionTokens._transient);
        suggestions.add(CompletionTokens._volatile);
        suggestions.add(CompletionTokens._readonly);
        suggestions.add(CompletionTokens._attribute);
      } else if (lastToken instanceof UnrestrictedNameContext) {
        suggestions.add(CompletionTokens._colon);
      } else if (lastToken instanceof EGenericElementTypeContext) {
        suggestions.addAll(MultiplicitySuggestionProvider.startSuggestions);
        suggestions.add(CompletionTokens._equals);
        suggestions.add(CompletionTokens._leftCurly);
        suggestions.add(CompletionTokens._semicolon);
      } else if (lastToken instanceof EMultiplicityContext) {
        suggestions.add(CompletionTokens._equals);
        suggestions.add(CompletionTokens._leftCurly);
        suggestions.add(CompletionTokens._semicolon);
      } else if (lastToken instanceof EAnnotationContext || lastToken instanceof DerivationContext
          || lastToken instanceof InitialContext) {
        suggestions.addAll(EAnnotationSuggestionProvider.startSuggestions);
        suggestions.addAll(DerivationSuggestionProvider.startSuggestions);
        suggestions.addAll(InitialSuggestionProvider.startSuggestions);
      }
    } else if (lastToken instanceof TerminalNode) {
      if (lastToken.getText().equals(CompletionTokens._static)) {
        suggestions.add(CompletionTokens._model);
        suggestions.add(CompletionTokens._ghost);
        suggestions.add(CompletionTokens._transient);
        suggestions.add(CompletionTokens._volatile);
        suggestions.add(CompletionTokens._readonly);
        suggestions.add(CompletionTokens._attribute);
      } else if (lastToken.getText().equals(CompletionTokens._model)
          || lastToken.getText().equals(CompletionTokens._ghost)) {
        suggestions.add(CompletionTokens._transient);
        suggestions.add(CompletionTokens._volatile);
        suggestions.add(CompletionTokens._readonly);
        suggestions.add(CompletionTokens._attribute);
      } else if (lastToken.getText().equals(CompletionTokens._transient)) {
        suggestions.add(CompletionTokens._volatile);
        suggestions.add(CompletionTokens._readonly);
        suggestions.add(CompletionTokens._attribute);
      } else if (lastToken.getText().equals(CompletionTokens._volatile)) {
        suggestions.add(CompletionTokens._readonly);
        suggestions.add(CompletionTokens._attribute);
      } else if (lastToken.getText().equals(CompletionTokens._readonly)) {
        suggestions.add(CompletionTokens._attribute);
      } else if (lastToken.getText().equals(CompletionTokens._attribute)) {
        // attribute name
      } else if (lastToken.getText().equals(CompletionTokens._colon)) {
        // TODO attribute type
      } else if (lastToken.getText().equals(CompletionTokens._equals)) {
        suggestions.add(CompletionTokens._singleQuote);
      } else if (((TerminalNode) lastToken).getSymbol()
          .getType() == AlloyInEcoreLexer.SINGLE_QUOTED_STRING) {
        suggestions.add(CompletionTokens._leftCurly);
        suggestions.add(CompletionTokens._semicolon);
      } else if (lastToken.getText().equals(CompletionTokens._leftCurly)) {
        suggestions.add(CompletionTokens._derived);
        suggestions.add(CompletionTokens._id);
        suggestions.add(CompletionTokens._ordered);
        suggestions.add(CompletionTokens._notOrdered);
        suggestions.add(CompletionTokens._unique);
        suggestions.add(CompletionTokens._notUnique);
        suggestions.add(CompletionTokens._unsettable);
        suggestions.add(CompletionTokens._notUnsettable);
        suggestions.addAll(EAnnotationSuggestionProvider.startSuggestions);
        suggestions.addAll(DerivationSuggestionProvider.startSuggestions);
        suggestions.addAll(InitialSuggestionProvider.startSuggestions);
      } else if (lastToken.getText().equals(CompletionTokens._comma)) {
        suggestions.add(CompletionTokens._derived);
        suggestions.add(CompletionTokens._id);
        suggestions.add(CompletionTokens._ordered);
        suggestions.add(CompletionTokens._notOrdered);
        suggestions.add(CompletionTokens._unique);
        suggestions.add(CompletionTokens._notUnique);
        suggestions.add(CompletionTokens._unsettable);
        suggestions.add(CompletionTokens._notUnsettable);
      } else if (lastToken.getText().equals(CompletionTokens._derived)
          || lastToken.getText().equals(CompletionTokens._id)
          || lastToken.getText().equals(CompletionTokens._ordered)
          || lastToken.getText().equals(CompletionTokens._notOrdered)
          || lastToken.getText().equals(CompletionTokens._unique)
          || lastToken.getText().equals(CompletionTokens._notUnique)
          || lastToken.getText().equals(CompletionTokens._unsettable)
          || lastToken.getText().equals(CompletionTokens._notUnsettable)) {
        suggestions.add(CompletionTokens._comma);
        suggestions.add(CompletionTokens._rightCurly);
      } else if (lastToken.getText().equals(CompletionTokens._rightCurly)
          || lastToken.getText().equals(CompletionTokens._semicolon)) {
        // end of context.
        suggestions.addAll(getParentProviderSuggestions(context, lastToken));
      } else if (lastToken instanceof ErrorNode) {
        suggestions.addAll(getChildProviderSuggestions(context, lastToken));
      }
    }
  }

  @Override
  protected boolean isCompatibleWithContext(final ParserRuleContext context) {
    return context instanceof EAttributeContext;
  }

  @Override
  protected Set<String> getStartSuggestions() {
    return EAttributeSuggestionProvider.startSuggestions;
  }

  @Override
  protected void initParentProviders() {
    addParent(AIESuggestionProviderSingletonFactory.instance().eStructuralFeatureSP());
  }

  @Override
  protected void initChildProviders() {
    addChild(AIESuggestionProviderSingletonFactory.instance().VisibilityKindSP());
    addChild(AIESuggestionProviderSingletonFactory.instance().UnrestrictedNameSP());
    // addChild(AIESuggestionProviderSingletonFactory.instance().eGenericElementTypeSP());
    addChild(AIESuggestionProviderSingletonFactory.instance().MultiplicitySP());
    addChild(AIESuggestionProviderSingletonFactory.instance().eAnnotationSP());
    addChild(AIESuggestionProviderSingletonFactory.instance().DerivationSP());
    addChild(AIESuggestionProviderSingletonFactory.instance().InitialSP());
  }

}
