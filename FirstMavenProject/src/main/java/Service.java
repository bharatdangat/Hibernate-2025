
public class Service 
{
 public String insertData(Teacher teacher)
 {
	 Dao d=new Dao();
	 String msg=d.insertData(teacher);
     return msg;
 }

}
