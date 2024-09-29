package java_topics;

//Abstraction is hiding the inner working and showing necessary details 
//Abstract class is a class with the keyword abstract
//Annonymous class is nameless class it is created when we create the object of a class
abstract class Car{
    public abstract void brake();//Abstract method

    //concrete method(speed)
    public void speed(){
        System.out.println("the maximum speed is 120kmph");
    }
}

class Maruti extends Car{
    //we need to definitly write the brake() method 
    public void brake(){
        System.out.println("This car has Disc brakes");
    }
}

public class Abstraction {
    public static void main(String[] args){
        //Car obj=new car();->you cannot create object of the Abstract class
        Car obj=new Maruti();
        obj.brake();

        //we can create the object of the abstarct class but we need to include the annonymous inner class
        Car obj1=new Car(){
            public void brake(){
                System.out.println("This car has Drum brakes");
            }

            public void sunroof(){
                System.out.println("There is a sunroof");
            }
        };
        
        obj1.speed();
        //obj1.sunroof();->we need to declare in the abstract method to access this or work with the sunroof method

    }
    
}
