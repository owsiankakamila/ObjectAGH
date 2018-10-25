package pkg1;

import java.lang.*;
import java.lang.NumberFormatException;

public class IntValue extends Value {
    int val;


    IntValue(){
        val=0;
    }
    IntValue(int x){
        val=x;
    }

    public String toString(){
        return Integer.toString(val); // how it is stored in memory? reference??? how

    }

    public IntValue add(Value x){
        if( x instanceof IntValue) {
            // returnVal method??????
            int addIt =Integer.parseInt(x.toString()); // stupid and long but at least can work.. ?

            return new IntValue(val+addIt);
        }
        else{
            return new IntValue();
            // throw Exception
        }

    }

    public Value sub(Value x){

        if( x instanceof IntValue) {
            // returnVal method??????
            int subIt =Integer.parseInt(x.toString()); // stupid and long but at least can work.. ?

            return new IntValue(val-subIt);
        }
        else{
            return new IntValue();
            // throw Exception
        }

    }
    public Value mul(Value x){
        if( x instanceof IntValue) {
            // returnVal method??????
            int mulIt =Integer.parseInt(x.toString()); // stupid and long but at least can work.. ?

            return new IntValue(val*mulIt);
        }
        else{
            return new IntValue();
            // throw Exception
        }

    }


    public Value div(Value x){
        if( x instanceof IntValue) {
            // returnVal method??????

            int divIt =Integer.parseInt(x.toString()); // stupid and long but at least can work.. ?

            return new IntValue(val/divIt);
        }
        else{
            return new IntValue();
            // throw Exception
        }

    }
    public Value pow(Value x){
        if( x instanceof IntValue) {
            // returnVal method??????
            int powIt =Integer.parseInt(x.toString()); // stupid and long but at least can work.. ?

            return new IntValue((int)Math.pow(val,powIt));
        }
        else{
            return new IntValue();
            // throw Exception
        }
    }

    public boolean eq(Value x) { //place in memory
        return (this==x);

    }

    public boolean neq(Value x){
        int x_val;
        try{
            x_val = Integer.parseInt(x.toString());
        }
        catch(NumberFormatException e){
            return false;

        }
        return (this.val!=x_val);
    }

    public  boolean lte(Value x){
        int x_val;
        try{
            x_val = Integer.parseInt(x.toString());
        }
        catch(NumberFormatException e){
            return false;

        }
        return (this.val<=x_val);

    }
    public  boolean gte(Value x){
        int x_val;
        try{
            x_val = Integer.parseInt(x.toString());
        }
        catch(NumberFormatException e){
            return false;

        }
        return (this.val>=x_val);
    }
    public boolean equals(Object other){ // only value
        return other.toString().equals(this.toString());
    }

    public int hashCode(){ //something different connectd to equals?????
        return val;
    }
    public Value create(String s){

        return new IntValue(Integer.parseInt(s));

    }





    /*






    public  boolean lte(Value x);
    public  boolean gte(Value x);
    public  boolean neq(Value x);
    public boolean equals(Object other);
    public int hashCode();
    public Value create(String s);

    */

}
