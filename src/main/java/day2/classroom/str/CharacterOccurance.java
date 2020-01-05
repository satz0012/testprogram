package day2.classroom.str;

public class CharacterOccurance {


	public static void main(String[] args) {

		// Here is the input
		String test = "I am getting better with Java";

		// Here is what the count you need to find
		char ch = 'a';
		int totalCount = 0;
		
		System.out.println("The total length is " +test.length());
		char[] charArray = test.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i] == ch) {
				totalCount++;
			}
		}
		
		
		// Build the logic to find the count of each
		/* Pseudo Code:
			a) Convert the String to character array
			b) Traverse through each character (using loop)
			c) If the given character matches the expected character (ch),
			   Then, increment totalCount
		*/

		
		
		
		
		
		
		
		
		
		// Print the count here
		System.out.println("Total count of character("+ch+"): " + totalCount);
		
	}

}
