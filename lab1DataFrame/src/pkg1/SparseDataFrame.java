package pkg1;

import java.util.ArrayList;

public class SparseDataFrame extends DataFrame {

    Object hidden;
    ArrayList<SparseColumn> cols = new ArrayList<SparseColumn>();

    public SparseDataFrame(String namesArray [], String typesArray [], Value hide){
        super(namesArray,typesArray);
        cols.clear();
        hidden = hide; //rzutowanie

        for (int i = 0; i < howManyCols; i++) {
            cols.add(new SparseColumn(namesArray[i], typesArray[i], hide));
        }
    }

    SparseDataFrame(DataFrame df, Value hide){ //why was asking for default constr in DF??)
        hidden = hide;
        howManyCols = df.howManyCols;
        howManyRows = df.howManyRows;
        names = df.names;
        types = df.types;

        for(int i =0; i< howManyCols;i++) { //each column
            cols.add(new SparseColumn(df.names[i], df.types[i], hide)); //create column
            for (int j = 0; j < howManyRows; j++){ // each row
                cols.get(i).addElement(df.cols.get(i).returnElement(j+1)); //add Element
            }
        }

    }

    DataFrame ToDense(){
        DataFrame newDF = new DataFrame(names, types);
        for(int i =0; i< this.howManyCols;i++) { //each column
            for (int j = 0; j < this.howManyRows; j++){ // each row
                newDF.cols.get(i).addElement(this.cols.get(i).returnElement(j)); //(newDF.cols[i].addElement)
            }
        }
        return newDF;

    }


}


//iloc prawdopodobnie zadziala zupelnie inaczzej -inaczej pamięią
//- return Elemnent mozna by poprawic

