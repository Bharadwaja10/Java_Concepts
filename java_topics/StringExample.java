package java_topics;

public class StringExample {

    // Demonstrating various String methods
    public void stringExample() {
        String str = "Hello ";

        // String methods
        System.out.println(str.trim());              // Removes leading and trailing spaces
        System.out.println(str.toUpperCase());       // Converts the string to uppercase
        System.out.println(str.toLowerCase());       // Converts the string to lowercase
        System.out.println("Length: " + str.length());// Gives the length of the string
        System.out.println(str.substring(2));        // Returns substring from index 2 to the end
        System.out.println("Character at index 3: " + str.charAt(3));  // Character at index 3
        System.out.println("Index of 'e': " + str.indexOf("e"));       // Index of the first occurrence of 'e'
        System.out.println(str.replace("el", "o"));  // Replaces "el" with "o"
    }

    // Demonstrating various StringBuffer methods
    public void stringBufferEg() {
        StringBuffer strb = new StringBuffer("Alex");

        // StringBuffer methods
        strb.append(" is a good boy");               // Appends to the end of the string
        System.out.println("Appended StringBuffer: " + strb);
        
        System.out.println("Capacity: " + strb.capacity());   // Default capacity is 16 + string length
        System.out.println("After Insert: " + strb.insert(2, "ab"));  // Inserts "ab" at index 2
        System.out.println("After Deleting Char at index 3: " + strb.deleteCharAt(3));  // Deletes char at index 3
        System.out.println("Final StringBuffer: " + strb.toString()); // Converts to String
    }

    public static void main(String[] args) {
        StringExample obj = new StringExample();
        // obj.stringExample();
        obj.stringBufferEg();
    }
}

