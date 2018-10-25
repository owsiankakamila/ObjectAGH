package pkg1;

public class COOValue extends Value{
    int position;
    Value object;
    COOValue(int pos, Value obj){
        position = pos;
        object = obj;

    }

    public  String toString(){
        return Integer.toString(position) + object.toString();

    }

    public  Value add(Value x){
        return create("not implemented");
    }
    public  Value sub(Value x){
        return create("not implemented");
    }
    public  Value mul(Value x){
        return create("not implemented");
    }
    public  Value div(Value x){
        return create("not implemented");
    }
    public  Value pow(Value x){
        return create("not implemented");
    }

    public  boolean eq(Value x){
        return (this==x);
    }
    public  boolean lte(Value x){
        if( x instanceof COOValue) {
            return (this.position<=((COOValue) x).position);
        }
        return false;
    }
    public  boolean gte(Value x){
        if( x instanceof COOValue) {
            return (this.position>=((COOValue) x).position);
        }
        return false;
    }
    public  boolean neq(Value x){
        if (x instanceof COOValue){
            if (( ((COOValue) x).object.toString() == this.object.toString()) || (this.position==((COOValue) x).position)){
                return false;
            }
        }
        return true;
    }

    public  boolean equals(Object other){
        if (other instanceof COOValue){
            if ((((COOValue) other).object.toString() == this.object.toString()) || (this.position==((COOValue) other).position)){
                return true;
            }
        }
        return false;
    }
    public  int hashCode(){
        return position;
    }
    public  Value create (String s){
        // I SHOULD [ALSO] ERASE from s first "(" and last ")"
        String [] objects = s.split(",");
        int pos = Integer.parseInt(objects[0]);
        Value obj = new StringValue(objects[1]); // DOMYSLNIE STRING VALUE

        return new COOValue(pos,obj);
    }

}

