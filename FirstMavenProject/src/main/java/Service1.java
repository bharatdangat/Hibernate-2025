import java.util.ArrayList;

public class Service1
{
	public ArrayList<Teacher> getInfo()
	{
	Dao1 d=new Dao1();
	ArrayList<Teacher> a1=d.getInfo();
	return a1;
	}
}
