import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        CharStream file = CharStreams.fromFileName("input.compil");
        TP2Lexer lexer = new TP2Lexer(file);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TP2Parser parser = new TP2Parser(tokens);
        parser.removeErrorListener(ConsoleErrorListener.INSTANCE);
        ArrayList<String> errors = new ArrayList<>();
        ErrorListener errorListener = new ErrorListener(errors);
        parser.addErrorListener(errorListener);
        RuleContext tree = parser.start_rule();
        Routines routines = new Routines(errors);
        RoutineQuad routineQuad = new RoutineQuad();

        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        parseTreeWalker.walk(routines, tree);
        parseTreeWalker.walk(routineQuad, tree);


        if (errors.isEmpty()) {
            System.out.println("No errors on our program!");
            routineQuad.getQuads().display();
            routines.getTable().display();
        } else {
            System.err.println("Ouuuppsss our program compiled with some errors; take a look :");
            for (String error : errors)
                System.err.println(error);
        }
    }
}
