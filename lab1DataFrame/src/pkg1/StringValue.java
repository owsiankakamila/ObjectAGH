package pkg1;

public class StringValue extends Value {
    String val;
    StringValue(){ val="";}
    StringValue(String x) {val=x;}

    public String toString(){
        return val; // how it is stored in memory? reference??? how

    }

    public StringValue add(Value x){
        if( x instanceof StringValue) {
            // returnVal method??????
            String addIt =x.toString(); // stupid and long but at least can work.. ?

            return new StringValue(val+addIt);
        }
        else{
            return new StringValue();
            // throw Exception
        }

    }

    public Value sub(Value x){
        return create("not implemented");


    }
    public Value mul(Value x){
        return create("not implemented");

    }


    public Value div(Value x){
        return create("not implemented");


    }
    public Value pow(Value x){
        return create("not implemented");
    }

    public boolean eq(Value x) { //place in memory
        return (this==x);

    }

    public boolean neq(Value x){
        String x_val;
        try{
            x_val = x.toString();
        }
        catch(NumberFormatException e){
            return false;

        }
        return (!this.val.equals(x_val));
    }

    public  boolean lte(Value x){
        String x_val;
        try{
            x_val = x.toString();
        }
        catch(NumberFormatException e){
            return false;

        }
        return /*(val<x_val)*/ false;

    }
    public  boolean gte(Value x){
        String x_val;
        try{
            x_val = x.toString();
        }
        catch(NumberFormatException e){
            return false;

        }
        return /*(this.val>=x_val)*/ false;
    }
    public boolean equals(Object other){ // only value
        return other.toString().equals(this.toString());
    }

    public int hashCode(){ //something different connectd to equals?????
        return Integer.parseInt(val);
    }
    public StringValue create(String s){

        return new StringValue(s);

    }


}
