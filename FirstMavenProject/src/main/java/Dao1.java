import java.sql.*;
import java.util.ArrayList;
public class Dao1 
{
  public ArrayList<Teacher> getInfo()
  {
	  ArrayList<Teacher> a1=new ArrayList<>();
	  try
	  {
	  Connection con=DBConnection.dbConnection();
	  String query="select * from teacher";
	  PreparedStatement pst=con.prepareStatement(query);
	  ResultSet rs=pst.executeQuery();
	  while(rs.next())
	  {
		  int tno=rs.getInt(1);
		  String tname=rs.getString(2);
		  String subject=rs.getString(3);
		  Teacher t=new Teacher(tno, tname, subject);
		  a1.add(t);
	  }
	  }catch(Exception e)
	  {
		  System.out.println(e);
	  }
	  return a1;
  }
}
