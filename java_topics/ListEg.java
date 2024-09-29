package java_topics;
import java.util.*;

/*collection is an interface which is used to store multiple values. collection interface is extended by the
 multiple interfaces like List,Set,Queue,Map and it is implemented by multiple classes like Arraylist,HashSet*/
public class ListEg {
    public static void main(String[] args){
        //Collection<Integer> l=new ArrayList<Integer>();  
        /*collection interface can only add values it has limited properties we cannot have index for the collection
         so we use List interface additional properties */
        
        /*List is used to store multiple values and it can contain duplicate values */
        List<Integer> l=new ArrayList<Integer>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(10);

        System.out.println(l.get(2));//gives the value at the given index
        System.out.println(l.indexOf(20));//gives index of the given value
        l.remove(0); //removes the value at that index
        l.set(0, 10);//sets value 10 at the index 0 means remove 20 and add 10
        l.add(1,20);    
        Collections.sort(l);//Here collections is a class not the interface   
        
        //Collection=interface, Collections=Class 
        System.out.println(l.size());//gives the length of the list

        //In the array if we try to print the entire array it gives us the hashcode but in list it gives entire list
        System.out.println(l); 

        for(int n:l){
            System.out.println(n);
        }
    }
}
