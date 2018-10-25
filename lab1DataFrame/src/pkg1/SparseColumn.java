package pkg1;


import java.util.ArrayList;

public class SparseColumn extends Column {
    Value hidden;
    ArrayList<COOValue> elements = new ArrayList<COOValue>();


    SparseColumn (String itsName, String itsType, Value hide){
        super(itsName,itsType);
        hidden = hide;

    }

    Value returnElement(int index){
        //if Array elements contains COOValue

        for (COOValue coo: elements){
            if (coo.position == index){
                return coo.object;
            }

        }

        // not found = it is hidden value

        return hidden; // to dla copyRowToNew ALE CZY NIE BEDZIE PROBLEMU Z RZUTEM (upcasting)

    }


    void addElement (Value obj){
        size++;
        int newPosition= elements.size();

        if (obj != hidden){
            elements.add(new COOValue(newPosition,obj));
        }
    }

}
