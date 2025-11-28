
public class Controller
{
 public String isertData(Teacher teacher)
 {
	 Service s=new Service();
	 String msg=s.insertData(teacher);
	 return msg;
 }
}
