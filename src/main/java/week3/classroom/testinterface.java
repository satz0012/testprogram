package week3.classroom;

public interface testinterface {
	
	public void getnumber();
	public void touchtype();
	public void display();
	

}

class touchphone extends keypadphone
{

	@Override
	public void touchtype() {
		// TODO Auto-generated method stub
		
	}
	/*
	 * public void display() {
	 * System.out.println("The display appears when a phone gets the incoming call"
	 * ); } public void getnumber() {
	 * System.out.println("Enter the number to dial"); } public void touchtype() {
	 * System.out.println("Swipe up and down to search for contacts"); }
	 */
}


abstract class keypadphone implements testinterface
{
	 
      public void display()
  {
			System.out.println("The display appears when a phone gets the incoming call");
		}
		public void getnumber()
		{
			System.out.println("Enter the number to dial");
		}

}

 

