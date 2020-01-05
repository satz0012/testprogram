package week3.classroom;
class motorcycle
{
	public void ride()
	{
	System.out.println("Riding a motorcycle");
	}
}


class ninja extends motorcycle
{
	public void bikecc()
	{
		System.out.println("Engine comes with segment 650cc");
	}
	public void enginetype()
	{
		System.out.println("liqued cooled engine");
	}
}

class pulsar extends motorcycle
{
	public void cc()
	{
		System.out.println("Engine comes with segment 220cc");
	
	}
	public void engine()
	{
		System.out.println("Air cooled engine");
	}
}
	


public class mymotor {
	public static void main(String[] args) {
		pulsar p=new pulsar();
		p.cc();
		p.engine();
		p.ride();

}
}
