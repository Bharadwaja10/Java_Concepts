package java_topics;
import java.io.*;

/*Checked Exception in an exception which is checked at compile time. Eg:-Filenotfound,ClassnotFound exception
 compiler will force you to handle the checked exception*/
public class CheckedEx {    
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("file.txt"); // may throw FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        }
    }
}  
/*Unchecked exception are runtime exception which are not checked at compile time
 The compiler doesnot force you to handle the exception.Eg:-ArrayIndexOutOfBoundsException,ArithmeticException
*/
