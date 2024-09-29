package java_topics;
import java.util.*;
import java.util.stream.Stream;

//Stream is an interface which can be used only once it contains various methods which we can work.
public class StreamEg {
    public static void main(String[] args){
        List<Integer> l=Arrays.asList(4,2,9,6,1,7,8);

        //Stream interface
        Stream<Integer> s1=l.stream();
        // s1.forEach(n->System.out.println(n));

        /*we are commenting the excecution because the stream can be used only once */

        //Filter
        Stream<Integer> s2=s1.filter(n->n%2==0);
        // System.out.println("The filter method is used");
        // s2.forEach(n->System.out.println(n));

        //Map
        Stream<Integer> s3=s2.map(n->n*2);
        // System.out.println("The map method is used");
        // s3.forEach(n->System.out.println(n));
        
        //Reduce
        int s4=s3.reduce(0,(c,e)-> c+e);
        System.out.println("The reduce method is used output is "+s4);

        //or we can use stream this way 
        int s5= l.stream().filter(n -> n % 2 == 0).map(n -> n * 2).reduce(0, (c, e) -> c + e);
        System.out.println("The reduce method is used, output is " + s5);

    }
    
}
