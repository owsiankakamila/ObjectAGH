package pkg1;


import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String file ="C:\\Users\\earzl\\Desktop\\Obiektowe\\ObjectAGH\\lab1DataFrame\\src\\pkg1\\data.csv";
        DataFrame df = new DataFrame(file, new String[]{"int","int","int"}, true);
        df.Print();


       // test of Value:
/*
        IntValue x= new IntValue(5);
        IntValue y = new IntValue(20);
        System.out.println (x.toString() + "  "+ y.toString());

        System.out.println (x.lte(y));
        System.out.println (x.gte(y));


*/


    }
}

/* FileInputStream fstream = null;
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


            String [] objects;
            while ((strLine = br.readLine()) != null)   {
                System.out.println (strLine);

                objects = strLine.split("\\s+");

                System.out.println (objects);

                objects = strLine.split("\\s+");
                for (String o : objects){
                    System.out.print (o + " ");
                }
                System.out.println();


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
        } */
