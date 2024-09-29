package java_topics;
import java.io.*;
import java.util.*;

public class FileEg {
    public static void main(String[] args){
        /*
        //program to create a new file
        File myFile=new File("java_topics/file1.txt");

        //we need to surround it with tryCatch block or should use throws to handle exception
        //if we don't find the file it will throws IOException
        
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("The program is ended");
        

        //program to write in a file
        
        try {
            FileWriter myFile=new FileWriter("java_topics/file1.txt");
            myFile.write("This is a sample for the filehandling in the java.\nThis is the secondline in the file1.txt");
            myFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("The program is ended");
        */

        //program to read from a file
        File myFile=new File("java_topics/file1.txt");
        try {
            Scanner obj=new Scanner(myFile);
            while(obj.hasNextLine()){
                String str=obj.nextLine();
                System.out.println(str);
            }
            obj.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        

    }
    
}
