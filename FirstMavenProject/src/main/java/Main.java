public class Main 
{
	public static void main(String[] args)
	{
	Controller c=new Controller();
	Teacher t=new Teacher();
	t.setTno(105);
	t.setTname("mr.shinde");
	t.setSubject("MEARN");
	String msg=c.isertData(t);
	System.out.println(msg);
	}

}
