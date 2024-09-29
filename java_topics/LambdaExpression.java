package java_topics;

//Funcitonal interface means a class which has only one abstract method and no concrete methods
//Lambda expression is a consise way to implement a functional interface
@FunctionalInterface
interface A{
    void call();
}

public class LambdaExpression {
    public static void main(String[] args) {
        A obj=new A() {
            public void call(){
                System.out.println("Hello");
            }
        };
        obj.call();

        //by using lambda expression
        A obj1=()->{
            System.out.println("Excuse Me");
        };
        obj1.call();

        //As we have only one statement in the method we can instantiate this way
        A obj2=()->System.out.println("Hi...");
        obj2.call();

    }
    
}
