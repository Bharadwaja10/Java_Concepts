package java_topics;

//Annotation is used to provide information about the program to the compiler and JVM
//Annotation starts with the @ symbol.Eg: @FunctionalInterface,@Override 
class A{
    public void call(){
        System.out.println("Hello");
    }
}

class B extends A{
    /*@Override
    public void cal(){
        System.out.println("Excuse me");
    } 
    It will give error as we included the Annotation @Override and the method name is different from the parent class*/
    
    @Override
    public void call(){
        System.out.println("Excuse me");
    } 
}

public class Annotation {
    public static void main(String[] args){
        A obj=new B();//upcasting
        obj.call();
    }
    

    
}
