package java_topics;
import java.util.Arrays;

//Array is a collection of homogenous elements.The default value of the array is "0".
//java.util.Arrays is imported to access the methods of this Array
//It is a mutable datatype and a non primiotive datatype

public class ArraysExample {
    public void array(){
        /*int arr[]=new int[5];
        arr[0]=5;
        arr[1]=6;*/
        int a[]={1,2,7,9,0,3,4,5,5,6};

        for(int n:a){
            System.out.println(n);
        }   

        System.out.println("a[]="+Arrays.toString(a));
        //Methods of arrays
        System.out.println("the length of the array");
        System.out.println(a.length);

        Arrays.sort(a);
        System.out.println("the index is ");
        System.out.println(Arrays.binarySearch(a,4));

        System.out.println("copying the array a");
        int []arr=Arrays.copyOf(a, a.length);
        a[3]=100;

        System.out.println("a[]="+Arrays.toString(a));
        System.out.println("the array is "+Arrays.toString(arr));      
        
    }

    //Jagged array is a multidimensional array in has different columns for each array
    public void jagged(){
        int a[][]={{1,2,3,4},{0,7,8},{2,5,1,8}};
        System.out.println(a[1][3]);//exception arrayindexoutofbound
        
    }

    public static void main(String[] args){
        ArraysExample obj=new ArraysExample();
        
        obj.array();
        obj.jagged();

    }


    
}
