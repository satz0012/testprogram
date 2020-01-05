package week3.classroom;

public class samsung extends Redmi {

	
	public void getdisplay()
	{
		System.out.println("Amoled display");
		
	}
	public void getcamera()
	{
		System.out.println("Triple camera resolution");
	
	}
	
	public void getcamera(String mob)  //Method overloading
	{
		
		System.out.println(mob);
	
	}
	
	public void getcamera(String mob,int a) //method overloading
	{
		
		System.out.println(mob);
		System.out.println(a);
	
	}
	public void screendisplay()
	{
		System.out.println("Screen Display is super amoled");       //method overriding i.e., the same method is used in super class mobile but it will print the base class method only
	
	}
	
}
