
public class Teacher
{
  private int tno;
  private String tname;
  private String subject;

  public Teacher()
  {
	  
  }
  public Teacher(int tno, String tname, String subject) {
	super();
	this.tno = tno;
	this.tname = tname;
	this.subject = subject;
}

public int getTno() {
	return tno;
}

public void setTno(int tno) {
	this.tno = tno;
}

public String getTname() {
	return tname;
}

public void setTname(String tname) {
	this.tname = tname;
}

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}
  
}
