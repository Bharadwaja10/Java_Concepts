package java_topics;
import java.sql.*;
import java.util.Scanner;


public class JDBC {
    //Method for Knowing Gender at a particular id
    public void Gender() throws ClassNotFoundException, SQLException{
        String url="jdbc:mysql://localhost:3306/demo1";//URL
        String user="root";//User
        String password="967679";//password
        String sql="select * from demo1.esd where EEID='E00034'";//SQL Query

        //Load driver (This step is to load the driver we need not write it in my IDE automatically loads it)
        Class.forName("com.mysql.cj.jdbc.Driver");

        //To establish a connection to the MySQL database using the JDBC driver
        Connection con=DriverManager.getConnection(url, user, password);

        //To create a statement 
        Statement st= con.createStatement();

        //To excecute a query
        //ResultSet is a class which stores the retrived data from query
        ResultSet set=st.executeQuery(sql);

        //The while (set.next()) loop goes through each row in the ResultSet, one by one. 
        while (set.next()) {
            System.out.println(set.getString("Gender"));
        }
        
        //closses the connection with the driver
        //JDBC.java
        con.close();
       
      // Display message for successful execution of program
      System.out.println("End of the Method Gender");

    }

    //To select names employess at a particular countryof age<=23
    public void Names() throws ClassNotFoundException, SQLException{
        String url="jdbc:mysql://localhost:3306/demo1";//URL
        String user="root";//User
        String password="967679";//password

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the country name ('Brazil','United States','China')");
        String Country=sc.nextLine();//Reads the string of the country

        String sql="select * from demo1.esd where Country='"+Country+"' and Age<=25";//SQL Query
        
        sc.close();//closing the Scanner

        //Load driver (This step is to load the driver we need not write it in my IDE automatically loads it)
        // Class.forName("com.mysql.cj.jdbc.Driver");

        //To establish a connection to the MySQL database using the JDBC driver
        Connection con=DriverManager.getConnection(url, user, password);

        //To create a statement 
        Statement st= con.createStatement();

        //To excecute a query
        //ResultSet is a class which stores the retrived data from query
        ResultSet set=st.executeQuery(sql);

        //The while (set.next()) loop goes through each row in the ResultSet, one by one. 
        while (set.next()) {
            System.out.println(set.getString("Full Name"));
        }
        
        //closses the connection with the driver
        con.close();
       
      // Display message for successful execution of program
      System.out.println("End of the Names Method");

    }
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        JDBC obj=new JDBC();
        obj.Gender();
        // obj.Names();

        
    }
    
}
