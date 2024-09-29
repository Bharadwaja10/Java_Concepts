package java_topics;

//constructor which is used to initialize the values.It is automatically called whenever we create a object
//syntax is Access_specifier class_name(){} 
//There is default constructor which gives default values for the instance variables.
//the JDK creates a constructor even if the user doesn't create it
public class ConstructorEg {
    int a;
    String str;
    
    //Inside the constructor the values are initialized for the instatnce variables
    public ConstructorEg(){
        a=10;
        str="Hello";
    }

    public static void main(String[] args){
        ConstructorEg obj=new ConstructorEg();
        System.out.println(obj.a);
        System.out.println(obj.str);
    }
    
}
//parameterized constructor
class Parameterized{
    int a;
    String str;

    //This keyword is used inside the constructor for avoid the name conflict 
    public Parameterized(int a,String str){
        this.a=a;
        this.str=str;
    }

    public static void main(String[] args) {
        Parameterized obj=new Parameterized(10, "Diamond");
        System.out.println("the construtor has the values "+obj.a+","+obj.str);
    }
}
