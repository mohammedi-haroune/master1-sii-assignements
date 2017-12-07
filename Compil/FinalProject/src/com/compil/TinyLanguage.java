package com.compil;

import java.util.ArrayList;

public class TinyLanguage {
    public static void main(String[] args) throws Exception {
        /*
        CharStream file = CharStreams.fromFileName("/home/mohammedi/OpenSourceProjects/master1-sii-assignements/Compil/FinalProject/input.compil");
        TP2Lexer lexer = new TP2Lexer(file);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TP2Parser parser = new TP2Parser(tokens);
        parser.removeErrorListener(ConsoleErrorListener.INSTANCE);
        ArrayList<String> errors = new ArrayList<>();
        ErrorListener errorListener = new ErrorListener(errors);
        parser.addErrorListener(errorListener);
        RuleContext tree = parser.start_rule();
        RoutinesTabSymbol routinesTabSymbol = new RoutinesTabSymbol(errors);
        RoutinesQuad routineQuad = new RoutinesQuad();

        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        parseTreeWalker.walk(routinesTabSymbol, tree);
        parseTreeWalker.walk(routineQuad, tree);
        */

        if (args.length == 0) {
            printUsage();
        }

        TestConfig config = new TestConfig(args);
        ArrayList<String> errors = new ArrayList<>();
        RoutinesTabSymbol routinesTabSymbol = new RoutinesTabSymbol(errors);
        RoutinesQuad routinesQuad = new RoutinesQuad();
        ArrayList<TP2BaseListener> routines = new ArrayList<>();
        routines.add(routinesQuad);
        routines.add(routinesTabSymbol);
        ErrorListener errorListener = new ErrorListener(errors);


        ConstumTestRig.process(config, routines, errorListener);

        if (errors.isEmpty()) {
            System.out.println("No errors on our program!");
            routinesQuad.getQuads().display();
            routinesTabSymbol.getTable().display();
        } else {
            System.err.println("Ouuuppsss our program compiled with some errors; take a look :");
            for (String error : errors)
                System.err.println(error);
        }
    }

    private static void printUsage() {
        System.err.println("TinyLanguage\n  [-tokens] [-tree] [-gui] [-ps file.ps] [-encoding encodingname]\n  [-trace] [-diagnostics] [-SLL]\n  [input-filename(s)]");
        System.err.println("Use startRuleName='tokens' if GrammarName is a lexer grammar.");
        System.err.println("Omitting input-filename makes rig read from stdin.");
        System.exit(0);
    }
}
