package pkg1;

public class DoubleValue extends Value{

    double val;

    DoubleValue(){ val=0;}
    DoubleValue(double x) {val=x;}

    public String toString(){
        return Double.toString(val); // how it is stored in memory? reference??? how

    }

    public DoubleValue add(Value x){
        if( x instanceof DoubleValue) {
            // returnVal method??????
            double addIt =Double.parseDouble(x.toString()); // stupid and long but at least can work.. ?

            return new DoubleValue(val+addIt);
        }
        else{
            return new DoubleValue();
            // throw Exception
        }

    }

    public Value sub(Value x){

        if( x instanceof DoubleValue) {
            // returnVal method??????
            double subIt =Double.parseDouble(x.toString()); // stupid and long but at least can work.. ?

            return new DoubleValue(val-subIt);
        }
        else{
            return new DoubleValue();
            // throw Exception
        }

    }
    public Value mul(Value x){
        if( x instanceof DoubleValue) {
            // returnVal method??????
            double mulIt =Double.parseDouble(x.toString()); // stupid and long but at least can work.. ?

            return new DoubleValue(val*mulIt);
        }
        else{
            return new DoubleValue();
            // throw Exception
        }

    }


    public Value div(Value x){
        if( x instanceof DoubleValue) {
            // returnVal method??????

            double divIt =Double.parseDouble(x.toString()); // stupid and long but at least can work.. ?

            return new DoubleValue(val/divIt);
        }
        else{
            return new DoubleValue();
            // throw Exception
        }

    }
    public Value pow(Value x){
        if( x instanceof DoubleValue) {
            // returnVal method??????
            double powIt =Double.parseDouble(x.toString()); // stupid and long but at least can work.. ?

            return new DoubleValue(Math.pow(val,powIt));
        }
        else{
            return new DoubleValue();
            // throw Exception
        }
    }

    public boolean eq(Value x) { //place in memory
        return (this==x);

    }

    public boolean neq(Value x){
        double x_val;
        try{
            x_val = Double.parseDouble(x.toString());
        }
        catch(NumberFormatException e){
            return false;

        }
        return (this.val!=x_val);
    }

    public  boolean lte(Value x){
        double x_val;
        try{
            x_val = Double.parseDouble(x.toString());
        }
        catch(NumberFormatException e){
            return false;

        }
        return (this.val<=x_val);

    }
    public  boolean gte(Value x){
        double x_val;
        try{
            x_val = Double.parseDouble(x.toString());
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
        return (int)val;
    }
    public Value create(String s){

        return new DoubleValue(Double.parseDouble(s));

    }

}
