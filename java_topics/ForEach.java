package java_topics;
import java.util.*;


public class ForEach {
    public static void main(String[] args){
        List<Integer> l=Arrays.asList(4,2,9,6,1,7);

        //foreach will takes Consumer Functional interface as an argument which has one method accept()

        /*Consumer n=new Consumer<Integer>() {
            public void accept(Integer i){
                System.out.println(i);
            }            
        };
        //Lambda expression becomes i->System.out.println(i);*/

        l.forEach(i->System.out.println(i));
        
    }
    
}
