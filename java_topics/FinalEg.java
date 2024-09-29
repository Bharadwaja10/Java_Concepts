package java_topics;

//Final keyword is used in method,classes and variables to add a special property to them
//final variable is a constant variable it cannot be modified 
//final method cannot be overrided
//final class cannot be inherited(but it can inherit the other class)
public class FinalEg {
    final int a=20;//Final variable 
    
    public final void fmethod(){//final method
        System.out.println("This is a final method");
    }

    public static void main(String[] args){
        FinalEg obj=new FinalEg();
        System.out.println(obj.a);
        obj.fmethod();            
    }
    
}

//final class(Fclass) it is inherting the FinalEg class
final class Fclass extends FinalEg{
    //This will give the error as the final method cannot be overrided
    /*public final void fmethod(){//final method
        System.out.println("This is a final method");
    }*/

    public static void main(String []args){
        Fclass obj=new Fclass();
        System.out.println(obj.a);
        obj.fmethod(); 
    }
}
