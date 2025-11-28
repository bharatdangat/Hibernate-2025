import java.util.ArrayList;

public class MainDisp
{
	public static void main(String[] args)
	{
	Controller1 c=new Controller1();
	ArrayList<Teacher> a=c.getInfo();
	for(Teacher t:a)
	{
		System.out.println("Teacher No-"+t.getTno());
		System.out.println("Teacher Name-"+t.getTname());
		System.out.println("Teacher Subject-"+t.getSubject());
		System.out.println("----------------------------------------------");
	}
	}

}
