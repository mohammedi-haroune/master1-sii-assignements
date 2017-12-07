package com.compil;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.ArrayList;

public class ErrorListener extends BaseErrorListener {
    private ArrayList<String> errors = new ArrayList<>();

    public ArrayList<String> getErrors() {
        return errors;
    }

    public ErrorListener(ArrayList<String> errors) {
        this.errors = errors;
    }

    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        errors.add("line " + line + ":" + charPositionInLine + " " + msg);
    }
}
