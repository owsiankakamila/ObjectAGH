package pkg1;

import java.util.ArrayList;
import java.util.*;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.IOException;


public class DataFrame {

    String names[];
    String types[];

    ArrayList<Column> cols = new ArrayList<Column>();
    int howManyCols;
    int howManyRows;


    // CONSTRUCTOR
    DataFrame(){

    }

    public DataFrame(String namesArray[], String typesArray[]) {
        names = namesArray;
        types = typesArray;

        howManyCols = namesArray.length;
        howManyRows = 0;

        for (int i = 0; i < howManyCols; i++) {
            cols.add(new Column(namesArray[i], typesArray[i]));
        }
    }


    DataFrame(Column columns []){
        howManyCols = columns.length;
        howManyRows = columns[0].size;

        String helpNames[]= new String[howManyCols];
        String helpTypes[]= new String[howManyCols];

        int i=0;
        for (Column column : columns) {

            if(column.size!=howManyRows){
                //throw ColumnsAreNotEqual
                System.out.println("columns are not equal");
            }
            cols.add(column); //reference??
            helpNames[i]= column.name;
            helpTypes[i]= column.type;


        }

        names= helpNames;
        types= helpTypes;

    }

    DataFrame (String file, String typesArray[], boolean header){

        types=typesArray;
        howManyCols = typesArray.length;
        howManyRows =0;




        // Open the file

        FileInputStream fstream = null;
        BufferedReader br = null;

        try {
            fstream = new FileInputStream(file);
            br = new BufferedReader(new InputStreamReader(fstream));
        } catch (FileNotFoundException e) {
        }

        String strLine;

        //Read File Line By Line
        String colNames;
        try {

            //TAKE FIRST LINE AND CHECK IF HEADER

            if (!header){
                // WRITE ME NAMES OF COLUMNS

                Scanner sc = new Scanner(System.in);
                System.out.print("Write names of columns: ");
                colNames = sc.nextLine();
                // FORMAT colNames to String []
                names = colNames.split(",");




            }
            else{
                if((colNames = br.readLine()) != null){

                    // FORMAT colNames to String []
                    names = colNames.split(",");

                }


            }
            for (int i = 0; i < howManyCols; i++) {
                cols.add(new Column(names[i], typesArray[i]));
            }




            while ((strLine = br.readLine()) != null)   {
                // Take this line and FORMAT
                // CHANGE IT TO Object [] - here default String(?) or Int
                String [] objects = strLine.split(",");

                /*for ( String o : objects){
                    System.out.print("\n" + o.toString());
                }*/



                addRow(objects);
                //System.out.println(System.out.print(cols.get(0).returnElement(0)));


            }
        } catch (IOException f) {
            System.out.println("BŁĄD ODCZYTU!!!");
            System.exit(2);
        }

        //Close the input stream

        try {
            br.close();
        } catch (IOException g) {
            g.printStackTrace();
        }
    }

    void Print(){
        String strTyp = Arrays.toString(types);
        String strNam = Arrays.toString(names);
        System.out.println(strNam);
        System.out.println(strTyp);


        for (int j = 0; j < howManyRows; j++){// each row
            readRow(j);
            }
        }




    Column get(String colname) {
        for (Column s : cols)
            if (colname.equals(s.name)) {
                return s;

            }

        //throw new Exception("no such column");
        return new Column(); //handled by basic constructor
    }



    DataFrame get(String [] columns, boolean copy){
        Column toConstructor [] = new Column[columns.length];
        int i=0,j=0;
        for(String name : columns){
            int index=-1;
            for (Column col : cols) { //stupid loop really
                if (col.name == name){
                    index =j;
                }
                j++;
            }

            //now i have nr of column i have to copy

            // if -1 = name not found - do nothing, search for next name
            if(index != -1){ //name found
                if (copy){
                    try{

                        Column c=(Column)(cols.get(index)).clone();
                        toConstructor[i] = c;
                        i++;
                    }catch(CloneNotSupportedException c){}
                }

                else {
                    toConstructor[i] = cols.get(index);
                    i++;
                }
            }



        }
        //find columns

        return new DataFrame(toConstructor);

    }

    void readRow(int nr){
        for(Column x : cols){
            System.out.print(x.returnElement(nr+1) + " ");
        }
        System.out.println();
    }

    boolean addRow(Object objects []){
        //System.out.print(howManyRows + " ");
        if (objects.length != howManyCols){
            //System.out.println(howManyCols + " "+ objects.length);
            return false;
        }

        int i=0;
        for (Column col : cols) {

                col.addElement(objects[i]);
                i++;
            }



        howManyRows= howManyRows +1;
        //System.out.print(howManyRows +"e");
        return true;


    }

    int size(){
        return howManyRows;
    }

    void copyRowToNew(DataFrame df, int row){
        Object[] objectsOfSelected = new Object[howManyCols];
        int x=0;

        for (Column column: cols){
            objectsOfSelected[x]=column.returnElement(row);

        }

        //handle with if and throw
        df.addRow(objectsOfSelected);
    }


    DataFrame iloc(int from, int to) {
        // if i > howMany Rows
        // throw exception

        DataFrame df = new DataFrame(names, types);
        for (int i=from; i<=to; i++){
            copyRowToNew(df, i);
        }

        return df;

    }



    DataFrame iloc(int i) {
        // if i > howMany Rows
        // throw exception

        DataFrame df = new DataFrame(names, types);
        copyRowToNew(df, i);

        return df;


        // ###### MAKE BASIC DF #############

        /*String[] namesOfSelected = new String[howManyCols];
        String[] typesOfSelected = new String[howManyCols];
        int x=0;
        for (Column column: cols){
            namesOfSelected[x]=column.name;
            typesOfSelected[x]=column.type;
        }*/
    }






}




/*    ArrayList<String> names = new ArrayList<String>();
for (String s: namesArr)
        {
        names.add(s);
        }*/


