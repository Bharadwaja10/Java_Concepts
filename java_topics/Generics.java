package java_topics;
//We use generics to make the class,method and interfaces that run on any type.The type is placed in angular brackets<>

//Generic class
class Generic1<T>{
    int val1;
    T val2;

    public Generic1(int val1){
        this.val1=val1;
    }

    public T getVal2() {
        return val2;
    }

    public void setVal2(T val2) {
        this.val2 = val2;
    }

    public void values(){
        System.out.println("The value of val1 is "+val1);
        System.out.println("The value of val2 is "+val2);
    }

}
public class Generics {
    public static void main(String []args){
        //class of type Integer
        Generic1<Integer> obj=new Generic1<Integer>(10);
        obj.setVal2(30);
        System.out.println(obj.getVal2());
        obj.values();

        //class of type String
        Generic1<String> obj1=new Generic1<String>(10);
        obj1.setVal2("Hello");
        System.out.println(obj1.getVal2());
        obj1.values();

    }
    
}
