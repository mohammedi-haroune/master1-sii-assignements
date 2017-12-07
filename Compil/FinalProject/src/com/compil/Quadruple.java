package com.compil;

public class Quadruple
{
    String Quad[];

    public Quadruple(String[] Quad) {
        this.Quad = Quad;
    }

    public Quadruple(String op,String op1,String op2,String result)
    {
        Quad = new String[4];
        Quad[0] = op;
        Quad[1] = op1;
        Quad[2] = op2;
        Quad[3] = result;
    }

    public String get(int index)
    {
        return Quad[index];
    }

    public void set(int index, String s)
    {
        Quad[index] = s;
    }

    @Override
    public String toString()
    {
        return "("+Quad[0]+","+Quad[1]+","+Quad[2]+","+ Quad[3]+")";
    }
}
