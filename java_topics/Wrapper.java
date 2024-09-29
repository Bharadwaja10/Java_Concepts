package java_topics;

//wrapper class is used to represent primitive datatype(int,flaot and char etc) as object
//wrapper classes has some properties like boxing, unboxing, autoboxing and autounboxing
public class Wrapper {
    public static void main(String[] args){
        int num1=20;
        System.out.println("primitive type "+num1);

        //boxing is manually converting the primitive datatype to non primitive type
        Integer num2=Integer.valueOf(num1);//Boxing
        System.out.println("non primitive type "+num2);

        //Unboxing is manually converting the non primitive to primitive type
        int num3=num2.intValue();//unboxing
        System.out.println("primitive type "+num3);

        //Autoboxing is to convert primitive to non primtive type automatically
        Integer num4=num1;//autoboxing
        System.out.println("non primitive type "+num4);

        //Autounboxing is to convert the non primitive type to primitive type automatically
        int num5=num4;//Autounboxing
        System.out.println("primitive type "+num1);
        
        //converting string to integer with the wrapper class
        String str="123";
        int num6=Integer.parseInt(str); 
        System.out.println("The str value is "+str);
    }
    
}
