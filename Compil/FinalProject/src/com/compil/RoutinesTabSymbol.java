package com.compil;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;

public class RoutinesTabSymbol extends TP2BaseListener {

    private static final int UNDECLARED = 0;
    private static final int DECLARED = 1;

    private static final int INTcompil = 1;
    private static final int FLOATcompil = 2;


    private TabSymbole table = new TabSymbole();
    private ArrayList<String> errors = new ArrayList<>();
    private HashMap<ParserRuleContext,Integer> types = new HashMap<>();

    public RoutinesTabSymbol(ArrayList<String> errors) {
        this.errors = errors;
    }

    public TabSymbole getTable() {
        return table;
    }

    /********************************************************************************************/

    @Override
    public void exitStart_rule(TP2Parser.Start_ruleContext ctx) {

    }


    @Override
    public void exitSuite(TP2Parser.SuiteContext ctx) {

        int type = (ctx.type().getText().equals("intCompil"))?INTcompil:FLOATcompil;

        TP2Parser.VariablesContext vars = ctx.variables();

        for (;;vars = vars.variables()) // loop over vars
        {
            String varName = vars.getChild(0).getText();
            if(table.containsLigne(varName)) {
                errors.add(lineColumnOf(vars.ID()) + "Double declaration of variable: " + varName);
            }
            else
                table.addLigne(new TabSymbole.Ligne(varName,DECLARED,type));
            if(vars.variables() == null)
                return;
        }

    }


    @Override
    public void exitValue(TP2Parser.ValueContext ctx) {
        addTypeToCtx(ctx,(ctx.INT()!=null)?INTcompil:FLOATcompil);
    }


    @Override
    public void exitInstAff(TP2Parser.InstAffContext ctx) {
        int typeExp = getCtxType(ctx.expression());
        int typeIdf = table.getLigne(ctx.identifier().getText()).type;
        if(!CompatibleTypes(typeExp, typeIdf))
            errors.add(lineColumnOf(ctx.identifier().ID()) + "incompatible types in affectation " + ctx.getText() + " : " + typeExp + " avec " + typeIdf);
        clearMap();
    }

    @Override
    public void exitIdentifier(TP2Parser.IdentifierContext ctx) {
        // check if ID has been declared
        if(!table.containsLigne(ctx.ID().getText()))
        {
            errors.add(lineColumnOf(ctx.ID()) + ctx.ID().getSymbol().getCharPositionInLine() + " variable : " + ctx.ID().getText() + " undeclared !!!");
            table.addLigne(new TabSymbole.Ligne(ctx.ID().getText(),UNDECLARED,INTcompil|FLOATcompil));
            // adding non declared variable in order to not generate same error again
        }
    }

    @Override public void exitExpression(TP2Parser.ExpressionContext ctx)
    {
        if(ctx.expression() == null)
            addTypeToCtx(ctx,getCtxType(ctx.expression1()));
        else
        {
            if(CompatibleTypes(getCtxType(ctx.expression1()),getCtxType(ctx.expression())))
                addTypeToCtx(ctx,getTypeOfResult(getCtxType(ctx.expression1()),getCtxType(ctx.expression())));
            else {
                addTypeToCtx(ctx, 0); // type 0 will always generate error
                System.out.println("ERROR : incompatible type between " + ctx.expression1().getText() + " and " + ctx.expression().getText());
                System.out.println("we have : " + ctx.expression1().getText() + " type: " + getCtxType(ctx.expression1()) + " and " + ctx.expression().getText() + " type: " + getCtxType(ctx.expression()));
            }

        }
    }

    @Override public void exitExpression1(TP2Parser.Expression1Context ctx)
    {
        if(ctx.expression1() == null)
            addTypeToCtx(ctx,getCtxType(ctx.expression2()));
        else
        {
            if(CompatibleTypes(getCtxType(ctx.expression2()),getCtxType(ctx.expression1())))
                addTypeToCtx(ctx,getTypeOfResult(getCtxType(ctx.expression1()),getCtxType(ctx.expression2())));
            else {
                addTypeToCtx(ctx, 0); // type 0 will always generate error
                System.out.println("ERROR : incompatible type between " + ctx.expression1().getText() + " and " + ctx.expression2().getText());
                System.out.println("We have : " + ctx.expression1().getText() + " type: " + getCtxType(ctx.expression1()) + " and " + ctx.expression2().getText() + " type: " + getCtxType(ctx.expression2()));
            }
        }
    }

    @Override public void exitExpression2(TP2Parser.Expression2Context ctx)
    {
        if(ctx.identifier() != null)
            addTypeToCtx(ctx,table.getLigne(ctx.identifier().getText()).type);
        else if(ctx.expression() != null)
            addTypeToCtx(ctx,getCtxType(ctx.expression()));
        else
            addTypeToCtx(ctx,getCtxType(ctx.value()));
    }

    @Override public void exitCondition(TP2Parser.ConditionContext ctx)
    {
        clearMap();
    }





    /*************************************************************************************/
    /****************** somme methods helping on creating routines ***********************/

    public static String lineColumnOf(TerminalNode terminalNode) {
        return "line " + terminalNode.getSymbol().getLine() + ":" + terminalNode.getSymbol().getCharPositionInLine() + " ";
    }

    public ArrayList<String> getErrors() {
        return errors;
    }

    private void addTypeToCtx(ParserRuleContext ctx, int type)
    {
        types.put(ctx,type);
    }

    private int getCtxType(ParserRuleContext ctx)
    {
        return types.get(ctx);
    }

    private void clearMap()
    {
        types.clear();
    }

    private static boolean CompatibleTypes(int t1,int t2)
    {
        return (t1 & t2) != 0;
    }

    private static int getTypeOfResult(int t1,int t2)
    {
        return ((t1 & t2 & FLOATcompil) != 0)?FLOATcompil:INTcompil;
    }

}
