package java_topics;

/*we use throws keyword for ducking Exception */
//throws keyword is used with methods which handles the exception raised in the method
public class DuckingException {
    public void error1() throws Exception{
        int a=20;
        int b=0;
        int c=40/b;
    }

    public void error2() throws ArrayIndexOutOfBoundsException{
        int d[]=new int[3];
        System.out.println(d[3]);//error  
    }
    
    public static void main(String[] args){
        DuckingException obj=new DuckingException();
        try {
            // obj.error1();
            obj.error2();
        } 
        catch (Exception e) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
            System.out.println("The error is "+e);
        }
        
        System.out.println("The end of program");
    }
}
