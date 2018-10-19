package pkg2;

import java.lang.*;

public class IntValue extends Value {
    int val;


    IntValue(){
        val=0;
    }
    IntValue(int x){
        val=x;
    }

    public String toString(){
        return Integer.toString(val);

    }

    public Value add(Value x){
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
/*
    public boolean eq(Value x) {
        if (x.val instanceof Integer) {
            if (val == (int) x.val) { // this probably will not work
                return true;
            }

        }
        return false;
    }

    public  boolean lte(Value x){
        if (x.val instanceof Integer) {
            if(val <= (int)x.val){ // this probably will not work
                return true;
            }
        }
        return false;

    }
    public  boolean gte(Value x){
        if (x.val instanceof Integer) {
            if(val >= (int)x.val){ // this probably will not work
                return true;
            }
        }
        return false;
    }
    public  boolean neq(Value x){
        if (x.val instanceof Integer) {
            if(val != (int)x.val){ // this probably will not work
                return true;
            }
        }
        return false;
    }
    public boolean equals(Object other){
        if (this==other){
            return true;
        }
        else{
            return false;
        }
    }
    */
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
