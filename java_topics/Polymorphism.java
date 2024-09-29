package java_topics;

//polymorphism means exhibiting different dehaviour for the same action
//polymorphism are two types in java (Runtime & Compiletime polymorphism)
//Compiletime polymorphism=method overriding,compiletime polymorphism= method overloading
//we also cover the Upcasting and Downcasting in this program
//To do upcasting and downcasting we need to have relationship between two classes parent and child
public class Polymorphism {
//''''''''''''''''''''Method Overloading(compiletime polymorphism)''''''''''''''''''''''''''''''''
//method overloading means same method name but different number of parameters
    public void add(int a,int b){
        System.out.println(a+b);
    }

    public void add(int a,int b,int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args){
        Polymorphism obj=new Polymorphism();
        obj.add(4,10);
        obj.add(10,12,13);
    }    
}

//''''''''''''''''''''Method Overriding(Runtime polymorphism)''''''''''''''''''''''''''''''''
//Method Overriding means the same method name in both the base and derived class
class A{
    public void display(){
        System.out.println("This is class A");
    }
}

class B extends A{
    public void display(){
        System.out.println("This is class B");
    }

    public void check(){
        System.out.println("Another method of the class B");
    }
    
    public static void main(String []args){
        A obj=new A();
        obj.display();//return the method display of the class A

        //this is also example of "upcasting" which is the parent type reference variable has the child class object
        obj=new B();//Type of obj is A but object created is B
        obj.display();//calls the method display of the class B

        //obj.check(); It will gives error as the type of obj is A
        
        //To run the check() method we need to "downcast" the reference variable(This is the exmaple of downcasting)
        ((B)obj).check();//we have downcasted the obj variable type 

    }
}
