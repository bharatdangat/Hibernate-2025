import java.sql.*;
public class Dao
{
  public String insertData(Teacher teacher)
  {
	  try
	  {
	  Connection con=DBConnection.dbConnection();
	  String query="insert into teacher values(?,?,?)";
	  PreparedStatement pst=con.prepareStatement(query);
	  pst.setInt(1,teacher.getTno());
	  pst.setString(2,teacher.getTname());
	  pst.setString(3,teacher.getSubject());
	  pst.executeUpdate();
	  }catch(Exception e)
	  {
		  System.out.println(e);
	  }
	  return "Insert Data Sucessfullly....";
  }
}
