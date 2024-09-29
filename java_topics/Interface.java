package java_topics;

//interface is used when we want to create a class which has only abastract methods no concrete methods
//In Interface every method is public and abstract by default and vaiables are final and static by default
//we use implements keyword 
//Interface is not a class like the abstract class
interface Food{
    int a=30;
    void samosa();
    void beverage();
}

//we can extend interfaces
interface Food1 extends Food{
    int a=30;
    void samosa();
    void ballons();
}

class Bakery implements Food{
    public void samosa(){
        System.out.println("we have only aloo samosa");
    }

    public void beverage(){
        System.out.println("we have coffee and cold drinks for the beverage");
        
    }
}
class Bakery1 implements Food1{
    public void samosa(){
        System.out.println("we have only aloo samosa");
    }

    //we need to write the beverage() method too as the Food1 extends the interface Food
    public void beverage(){
        System.out.println("we don't have coffee, we have cold drinks for the beverage");
        System.out.println(Food1.a);
    }

    public void ballons(){
        System.out.println("we have heart ballons");
       
    }
}

class Bakery2 implements Food1,Food{
    public void samosa(){
        System.out.println("we have only aloo samosa and onion samosa");
    }

    public void beverage(){
        System.out.println("we have Tea");
        System.out.println(Food.a);
    }

    public void ballons(){
        System.out.println("we don't have heart ballons");
        
    }
}
public class Interface {
    public static void main(String[] args){
        Food obj=new Bakery();//upcasting 
        obj.beverage();

        obj=new Bakery1();
        obj.samosa();
        obj.beverage();
        //obj.ballons();->this method cannot be called as the type of obj is Food and it doesnot have the method ballons declared in the interface
        
        ((Food1)obj).ballons();//downcasting
        System.out.println("The instance variable of the Food interface is "+Food.a);
    }
    
}
