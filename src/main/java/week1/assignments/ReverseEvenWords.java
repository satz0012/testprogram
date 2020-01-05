package week1.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// Here is the input
		String test="I am a software tester";
		String [] array=test.split(" ");
		
	for (int i = 0; i < array.length; i++) {
	String sample;
		if (i%2!=0)
		{
		
			sample=array[i];
			char[] chararray=sample.toCharArray();
			int centre=chararray.length/2;
			for(int j=0;j<centre;j++) {
				char temp=chararray[j];
				chararray[j]=chararray[chararray.length-j-1];
				chararray[chararray.length-j-1]=temp;
			}
			System.out.print(" ");
				for(int k=0;k<chararray.length;k++) {
					System.out.print(chararray[k]);
					
				}
				
			
			
		
		}
		else {
			System.out.print(" ");
			System.out.print(array[i]);
		}
		}
		
		//Build a logic to reverse the even position words (output: I ma a erawtfos tester)
		
		/* Pseudo Code:
		a) split the words and have it in an array
		b) Traverse through each word (using loop)
		c) find the odd index within the loop (use mod operator)
		d) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
		e) print the even position words in reverse order using another loop (nested loop)
		 
	*/
		
		

	}

}
