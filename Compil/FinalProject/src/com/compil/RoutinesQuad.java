package com.compil;

import java.util.LinkedList;
import java.util.Vector;


public class RoutinesQuad extends TP2BaseListener {


        private LinkedList<String> stack = new LinkedList<>();
        private TabQuadruple quads = new TabQuadruple();
        private int cptTemps = 0;
        public static Vector<Integer> etiq = new Vector<>();

        public TabQuadruple getQuads() {
            return quads;
        }

    @Override public void exitInstAff(TP2Parser.InstAffContext ctx)
        {
            String SS = stack.removeLast();
            quads.addQuad("=",SS,"",ctx.identifier().getText());
            //System.out.println("exitAffect adding quad " + quads.getQuad(quads.size()-1));
        }



        @Override public void exitExpression(TP2Parser.ExpressionContext ctx)
        {
            if(ctx.expression() != null)
            {
                String SS = stack.removeLast();
                String SSS = stack.removeLast();
                String temp = "Temp"+(++cptTemps);
                quads.addQuad(ctx.pm().getText(),SSS,SS,temp);
                stack.add(temp);
                //System.out.println("exitExp adding quad " + quads.getQuad(quads.size()-1));
            }
            else
            {
                //System.out.println("exitExp head of stack is: " + stack.getLast()+ " stack size " + stack.size());
            }
        }




        @Override public void exitExpression1(TP2Parser.Expression1Context ctx)
        {
            if(ctx.expression1() != null)
            {
                String SS = stack.removeLast(),SSS = stack.removeLast();
                String temp = "Temp"+(++cptTemps);
                quads.addQuad(ctx.md().getText(),SSS,SS,temp);
                stack.add(temp);
                //System.out.println("exitT adding quad " + quads.getQuad(quads.size()-1));
            }
            else
            {
                //System.out.println("exitT head of stack is: " + stack.getLast() + " stack size " + stack.size());
            }
        }



        @Override public void exitExpression2(TP2Parser.Expression2Context ctx)
        {
            if(ctx.expression() == null) {
                stack.add(ctx.getText());
                //System.out.println("exitEndEx: case exp == null adding "+ ctx.getText());
            }
            else
            {
                //System.out.println("exitEndEx: case exp = null adding nothing "+ stack.getLast());
            }
        }



        int saveCondition , saveEND;
        @Override public void exitCondition(TP2Parser.ConditionContext ctx)
        {
            //System.out.println("exitComp start: " +" head of stack is " + stack.getLast());
            String SS = stack.removeLast();
            String SSS = stack.removeLast();
            saveCondition = quads.addQuad((ctx.si().getText().compareTo(">") == 0)?"BLE":"BGE",SSS,SS,"");
            //System.out.println("exitComp adding quad " + quads.getQuad(quads.size()-1));

        }




        @Override public void exitInstElse(TP2Parser.InstElseContext ctx)
        {
            quads.getQuad(saveCondition).set(3,""+(quads.size()+1));
            etiq.add(quads.size()+1);
            saveCondition = quads.addQuad("BR","","","");

        }



        @Override public void exitInstIf(TP2Parser.InstIfContext ctx)
        {
            quads.getQuad(saveCondition).set(1,""+quads.size());
            etiq.add(quads.size());

        }



}
