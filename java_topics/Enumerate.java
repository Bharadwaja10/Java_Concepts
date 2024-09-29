package java_topics;

//Enmerate is used to group named constants. we use enum keyword to create a enumerate class
enum day{
    sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday;
}

public class Enumerate {
    public static void main(String[] args){
        day s=day.Friday;
        System.out.println(s);
        
        //ordinal() function is used to get the index of the s named constant
        System.out.println(s.ordinal());
    }
    
}
