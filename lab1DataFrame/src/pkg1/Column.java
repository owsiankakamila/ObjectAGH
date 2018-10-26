package pkg1;
import java.util.ArrayList;

public class Column implements Cloneable {
    String name;
    String type;
    int size;
    ArrayList<Value> elements = new ArrayList<Value>();
    //albo object

    Column(){
        System.out.println("no column like this");
    }

    Column (String itsName, String itsType){
        name= itsName;
        type= itsType;
        size=0;
        /*try {
            Class T   = Class.forName(itsType);
        } catch (ClassNotFoundException e) {
        }*/

        //nazwa typu jako typ kolumny
    }

    int [] findSame (){
        int x;
        for (x=0, x <elements.size(), x++){

        }
    }


    void addElement (Value obj){
        elements.add(obj);
        size++;
    }

    Value returnElement(int index){
        //if Array elements contains COOValue
        //
        // if index not found it means it is hidden value

        return elements.get(index-1);
    }

    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

}

