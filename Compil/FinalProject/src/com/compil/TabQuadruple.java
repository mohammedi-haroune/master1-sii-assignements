package com.compil;

import java.util.LinkedList;

public class TabQuadruple
{
    LinkedList<Quadruple> quads = new LinkedList<>();
    public int addQuad(String op,String op1,String op2,String result)
    {
        return addQuad(new Quadruple(op,op1,op2,result));
    }

    public int addQuad(Quadruple quad)
    {
        quads.add(quad);
        return quads.size()-1;
    }

    public Quadruple getQuad(int index)
    {
        return quads.get(index);
    }

    public int size()
    {
        return quads.size();
    }

    public void display()
    {
        addQuad("END","","","");
        System.out.println("Our Quadruples : ");
        System.out.println("**************************************************************");
        for (int i = 0; i < size(); i++) {
            System.out.println(i + ": " + getQuad(i).toString());
        }
        System.out.println("**************************************************************");
    }

}
