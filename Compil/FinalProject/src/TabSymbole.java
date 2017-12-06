import java.util.ArrayList;

public class TabSymbole
{
    //structure of one ligne in the symbloe table
    static public class Ligne {

        String name;
        int declared; // 0:undeclared 1:declared
        int type; // 1:intcompil 2:floatcompil

        public Ligne(String name, int declared, int type) {
            this.name = name;
            this.declared = declared;
            this.type = type;
        }


        //display one ligne of the TS
        @Override
        public String toString()
        {
            String dec = (declared == 1)? "declared":"undeclared";
            return " | " + name + " | "
                    + ((type==1)?"intcompil":"floatcompil")
                    + " | " + dec;
        }
    }//end of Ligne


    //declaring the TS as an array of Ligne
    public ArrayList<Ligne> L = new ArrayList<Ligne>();


    //get a ligne with the name of the variable
    public Ligne getLigne(String name)
    {
        for (int i = 0; i < L.size(); i++) {
            if(L.get(i).name.compareTo(name)==0)
                return L.get(i);
        }
        return null;
    }

    //test if the variable exist in the TS
    public boolean containsLigne(String name)
    {
        return getLigne(name) != null;
    }

    //inserting a ligne in the TS
    public void addLigne(Ligne e)
    {
        L.add(e);
    }

    //deleting a ligne from the TS with it name
    public void deleteLigne(String name)
    {
        for (int i = 0; i < L.size(); i++) {
            if(L.get(i).name.compareTo(name)==0)
            {
                L.remove(L.get(i));
                return;
            }
        }
    }

    //deleting a ligne directely
    public void deleteLigne(Ligne e)
    {
        L.remove(e);
    }


    //get the size of the TS (number of ligne in )
    public int getSize()
    {
        return L.size();
    }

    //recuperer une ligne de la TS a par
    public Ligne getLigne(int i)
    {
        return L.get(i);
    }

    //display all lignes of the TS
    @Override
    public String toString()
    {
        StringBuilder TS = new StringBuilder("   VAR    |   TYPE    |   DEC  \n");

        for (Ligne l : L)
        {
            TS.append(l.toString()).append("\n");
        }
        return TS.toString();
    }

    public void display() {
        System.out.println("Our symbols table : ");
        System.out.println("\n********************************************************");
        for (Ligne l: L) {
            System.out.println(l.toString());
        }
        System.out.println("\n********************************************************");
    }


}
