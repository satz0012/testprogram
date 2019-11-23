package day1.classroom;

public class SwitchOperator {

	/*
	 * Goal: Perform calculation based on the user input operations
	 * 
	 * inputs: 2,3 and "add"
	 * output: added value: 5
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a Switch case: type 'switch', followed by: ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */	
	
	public static void main(String[] args) {
		
		// Declare 2 integer numbers
		int a=2;
        int b=3;
        
        int sub=a-b;
        int mul=a*b;
		// Declare a String variable with input as operations (Tip:
		String input="add";

		// Initiate switch case for operations
		
		
			// Within switch, include as case for add operation
		switch (input)
		{
		case "add":
			System.out.println("The sum is " +(a+b));
			break;
		case "sub":
			System.out.println("The sub is" +sub);
			break;
		case "mul":
			System.out.println("The mul is" +mul);
			break;
			default:
				System.out.println("No operations supported");
			
		}
		
			// Within switch, include as case for sub operation
		
		
			// Within switch, include as case for mul operation
		
		
			// Within switch, include as case for div operation
		
		
			// Within switch, include 'default' to handle other operations
		
		
		//end of switch case
		
	}

}
