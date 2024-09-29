package java_topics;
//Inheritance in one class inherits properties of the another class.every class by default inherits the object class
//we have this and super methods in this files scroll down to access it
public class Inheritance {
    public void parent1(){
        System.out.println("this is a parent class method");        
    }    
}

class Inheritance1 extends Inheritance{
    //overriding method
    public void parent1(){
        System.out.println("This is a child class method which overrides the parent method");
    }

    public static void main(String []args){
        Inheritance obj=new Inheritance1();
        obj.parent1();
    }    
}

//by default every constructor has a super() which is used to call the parent class constructor
//We use this() method to call the constructor of the same class
class A{
    public A(){
        super();//By default every constructor has this super method
        System.out.println("This is a A class constructor");
    } 

    public A(int a){
        super();
        System.out.println("This is a A class paramertized construtor "+a);
    }
}

class B extends A{
    public B(){
        this(200);
        System.out.println("This is a B class constructor");
    } 

    public B(int a){
        
        System.out.println("This is a B class parameterized construtor "+a);
    }

    public static void main(String[] args){
        A obj=new B();
    }

}