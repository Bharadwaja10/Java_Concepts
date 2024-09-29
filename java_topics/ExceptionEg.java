package java_topics;

//Exception handling is used to handle the runtime exception we use try,catch and finally blocks to handle the errors
//whenever we find a critical statement in the try block the catch block would catch the error and handle it
//we can create our own exception by extending Exception class
class CheckingEr extends Exception{
    public CheckingEr(String str){
        super(str);
    }
}

public class ExceptionEg {
    public static void main(String[] args){
        int a=20;
        int b=0;
        int d[]=new int[3];

    /*try block is used to test the block of code if any error occurs it will stop the excution 
    at that line and go to catch block*/
        try{
            int c=40/a;

    /*Throw keyword is used to explicitly throw an exception*/
            if (b==0){
                // throw new ArithmeticException("check the code");
                // throw new CheckingEr("Check the code");
                throw new Exception("this is a exception ");
            }

            int e=40/b;//error
            System.out.println(d[3]);//error  
        }

    /*Catch block will catch the error that was raised in the try block*/  
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The runtime error is "+e);
        }
    //The default catch block should be placed always at the end of the catch blocks
        catch(Exception e){
            System.out.println("The Runtime error is "+e);
        }

        finally{
            System.out.println("I will be excecut even if the try block has an error or not");
        }
        
    }

    
}
