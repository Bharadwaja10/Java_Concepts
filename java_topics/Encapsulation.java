package java_topics;
//Encapsulation is binding of data and method together to make it secure.we use access modifiers for the encapsulation
//getters and setters are used to set and get the values
public class Encapsulation {
    private int a;
    
    //getter method
    public void get(){
        System.out.println(a);
    }

    //setter method
    public void set(int a){
        this.a=a;        
    }
    
    public static void main(String []args){
        Encapsulation obj=new Encapsulation();
        obj.get();
        obj.set(100);
        obj.get();
    }
    
}
