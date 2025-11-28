import java.sql.*;
public class DBConnection
{
	private static final String url="jdbc:mysql://localhost:3306/bharat";
	private static final String user="root";
	private static final String password="root";
 public static Connection  dbConnection()
 {
	Connection con=null;
 try
 {
  	 Class.forName("com.mysql.cj.jdbc.Driver");
  	 con=DriverManager.getConnection(url,user,password);
 }catch(Exception e)
 {
	 System.out.println(e);
 }
 return con;
 }
}
