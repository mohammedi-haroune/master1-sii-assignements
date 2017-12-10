package com.compil;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
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

    public ArrayList<String> toAssembly() {
        ArrayList<String> assembly = new ArrayList<>();
        for (Quadruple q:quads) assembly.addAll(q.toAssembler());
        return assembly;
    }

    public void saveAssembly(String filename) throws IOException {
        Files.write(Paths.get(filename), toAssembly());
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
