package day1.assignments;

public class FibonacciSeries {
	
	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8
	 * output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */
	
	public static void main(String[] args) {
		int range=8;
		int firsNum=0;
		int secNum=1;
		
		// initialize 3 int variables (Tip: range & firstNum, secNum in the series)
		for (int i = 1; i <=range; i++) {
			System.out.print(firsNum+" ");
			int sum=firsNum+secNum;
			firsNum=secNum;
			secNum=sum;
			
		}
		// Iterate from 1 to the range
		
			// Print first number 
			
			// add first and second number
			
			// Assign second number to the first number
			
			// Assign sum to the second number
			
		

	}

}
