import java.util.ArrayList;

public class Controller1
{
 public ArrayList<Teacher> getInfo()
 {
	 Service1 s=new Service1();
	 ArrayList<Teacher> a1=s.getInfo();
	 return a1;
 }
 
}
