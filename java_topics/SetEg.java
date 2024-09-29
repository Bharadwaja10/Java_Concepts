package java_topics;
import java.util.*;

/*•	Set is a collection which is used to group the elements it cannot contain the duplicate values and it doesnot have index.
 To work with sets we use Hashset(It won’t give sorted value), TreeSet(It will give sorted values). */
public class SetEg {
     public static void main(String[] args){
        Set<Integer> s=new HashSet<Integer>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(10);

        
        s.remove(20); //removes the given value 
      
        System.out.println(s.size());//gives the length of the list

        //Here you can't see duplicate values
        System.out.println(s); 

        for(int n:s){
            System.out.println(n);
        }
    }
    
}
