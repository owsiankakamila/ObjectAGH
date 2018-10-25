package pkg1;

public class FloatValue extends Value {
    float val;

    FloatValue(){ val=0;}
    FloatValue(float x) {val=x;}

    public String toString(){
        return Float.toString(val); // how it is stored in memory? reference??? how

    }

    public FloatValue add(Value x){
        if( x instanceof FloatValue) {
            // returnVal method??????
            float addIt =Float.parseFloat(x.toString()); // stupid and long but at least can work.. ?

            return new FloatValue(val+addIt);
        }
        else{
            return new FloatValue();
            // throw Exception
        }

    }

    public Value sub(Value x){

        if( x instanceof FloatValue) {
            // returnVal method??????
            float subIt =Float.parseFloat(x.toString()); // stupid and long but at least can work.. ?

            return new FloatValue(val-subIt);
        }
        else{
            return new FloatValue();
            // throw Exception
        }

    }
    public Value mul(Value x){
        if( x instanceof FloatValue) {
            // returnVal method??????
            float mulIt =Float.parseFloat(x.toString()); // stupid and long but at least can work.. ?

            return new FloatValue(val*mulIt);
        }
        else{
            return new FloatValue();
            // throw Exception
        }

    }


    public Value div(Value x){
        if( x instanceof FloatValue) {
            // returnVal method??????

            float divIt =Float.parseFloat(x.toString()); // stupid and long but at least can work.. ?

            return new FloatValue(val/divIt);
        }
        else{
            return new FloatValue();
            // throw Exception
        }

    }
    public Value pow(Value x){
        if( x instanceof FloatValue) {
            // returnVal method??????
            float powIt =Float.parseFloat(x.toString()); // stupid and long but at least can work.. ?

            return new FloatValue(Math.pow(val,powIt));
        }
        else{
            return new FloatValue();
            // throw Exception
        }
    }

    public boolean eq(Value x) { //place in memory
        return (this==x);

    }

    public boolean neq(Value x){
        float x_val;
        try{
            x_val = Float.parseFloat(x.toString());
        }
        catch(NumberFormatException e){
            return false;

        }
        return (this.val!=x_val);
    }

    public  boolean lte(Value x){
        float x_val;
        try{
            x_val = Float.parseFloat(x.toString());
        }
        catch(NumberFormatException e){
            return false;

        }
        return (this.val<=x_val);

    }
    public  boolean gte(Value x){
        float x_val;
        try{
            x_val = Float.parseFloat(x.toString());
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

        return new FloatValue(Float.parseFloat(s));

    }

}
