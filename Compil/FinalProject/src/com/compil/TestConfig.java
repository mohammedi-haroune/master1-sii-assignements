package com.compil;

import java.util.ArrayList;
import java.util.List;

public class TestConfig {
    public static final String LEXER_START_RULE_NAME = "tokens";
    public final List<String> inputFiles = new ArrayList();
    public boolean printTree = false;
    public boolean gui = false;
    public String psFile = null;
    public boolean showTokens = false;
    public boolean trace = false;
    public boolean diagnostics = false;
    public String encoding = null;
    public boolean SLL = false;

    public TestConfig(String[] args) throws Exception {
        int i = 0;
        while (i < args.length) {
            String arg = args[i];
            ++i;
            if (arg.charAt(0) != '-') {
                this.inputFiles.add(arg);
            } else {
                if (arg.equals("-tree")) {
                    this.printTree = true;
                }

                if (arg.equals("-gui")) {
                    this.gui = true;
                }

                if (arg.equals("-tokens")) {
                    this.showTokens = true;
                } else if (arg.equals("-trace")) {
                    this.trace = true;
                } else if (arg.equals("-SLL")) {
                    this.SLL = true;
                } else if (arg.equals("-diagnostics")) {
                    this.diagnostics = true;
                } else if (arg.equals("-encoding")) {
                    if (i >= args.length) {
                        System.err.println("missing encoding on -encoding");
                        return;
                    }

                    this.encoding = args[i];
                    ++i;
                } else if (arg.equals("-ps")) {
                    if (i >= args.length) {
                        System.err.println("missing filename on -ps");
                        return;
                    }

                    this.psFile = args[i];
                    ++i;
                }
            }
        }

    }

    @Override
    public String toString() {
        return "TestConfig{" +
                "inputFiles=" + inputFiles +
                ", printTree=" + printTree +
                ", gui=" + gui +
                ", psFile='" + psFile + '\'' +
                ", showTokens=" + showTokens +
                ", trace=" + trace +
                ", diagnostics=" + diagnostics +
                ", encoding='" + encoding + '\'' +
                ", SLL=" + SLL +
                '}';
    }
}
