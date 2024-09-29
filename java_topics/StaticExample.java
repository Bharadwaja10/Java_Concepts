package java_topics;
//static keywowrd is used to make the members of the static independen to the object 
//static members are stored in the method area
//For inner class we will have a $ in a (.class)file

public class StaticExample {
    int a;
    //static varibles are independent of the object and it can be accessed anywhere inside the class 
    static int b;

    //Static blocks are executed once when the class is loaded.
    static{
        System.out.println("This is a static block");
    }

    //Static methods can't access instance variables and can't be overridden (but can be hidden).
    public static void SMethod(){
        System.out.println("The static variable is "+b);    
    }

    //Static inner classes can access static members of the outer class but not instance members.
    static class StaticClass{
        {
            System.out.println(b);
            System.out.println("The static method is called");
            StaticExample.SMethod();
        }
    }

    public static void main(String[] args){
        StaticExample obj=new StaticExample();
        StaticExample.b=30;//static varible

        System.out.println(obj.a);//instance variable

        StaticExample.SMethod();//static method
        
        //StaticExample.StaticClass obj1=new StaticExample.StaticClass();//static class
    }
}
