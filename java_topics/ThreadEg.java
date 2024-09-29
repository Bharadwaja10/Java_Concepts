package java_topics;


/*Threads are the smallest unit of the process */
class A extends Thread{
    //Every thread should have a run() method as the Thread class extends the runnable interface
    public void run(){
        for(int i=0;i<=100;i++){
            System.out.println("Hello");
        }
    }
}

class B extends Thread{
    //Every thread should have a run() method as the Thread class extends the runnable interface
    public void run(){
        for(int i=0;i<=100;i++){
            System.out.println("Bye...");
        }
    }
}

public class ThreadEg {
    public static void main(String[] args) {
        A obj1 =new A();
        B obj2=new B();

        obj1.start(); // start() is used to run the run() method
        obj2.start();
        System.out.println(obj1.getPriority());//Bydefault the priority is 5 and priority of thread is 1 to 10
        
    }
}

//Synchroniz make a thread to run total schedule and after that another threada is runned
