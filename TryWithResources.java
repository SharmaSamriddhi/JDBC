import java.sql.*;  //Used to import all the java sql packages.

class TryWithResources
{
public static void main(String[] args)
{
String User = "root";
String Mydb = "Amity";
String pass = "Sam@12345";

//Checking the connection by passing the resources in the 'try' block.

try(Connection conn = DriverManager.getConnection("jdbc:mysql//localhost:3306/Mydb",User,pass))
{
if(conn!=null){
System.out.println("connection established with "+ Mydb);
}
else{
System.out.println("Failed to establish connection");
}

}
catch(Exception e)
{
e.printStackTrace();  // Used to print the exact information about the Exception caught in the block.

}
}
}