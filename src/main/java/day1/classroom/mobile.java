package day1.classroom;

public class mobile
{	
	public void make(long number)
	{
		System.out.println("Make a call to " +number);
	}
	
public String sendsms() 
{
	String sms="Busy";
	System.out.println(sms);
	return sms;
}	
public boolean shutdown() {
	System.out.println("Shutdown");
	return true;
	
}
public static void main(String[] args) {
	mobile mb =new mobile();
	mb.make(7708551463l);
	mb.sendsms();
	mb.shutdown();
	
}
}
      