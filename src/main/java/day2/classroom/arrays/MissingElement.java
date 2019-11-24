package day2.classroom.arrays;

import java.util.Arrays;

public class MissingElement {

	
	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,4,6,7,8};
		Arrays.sort(data);
		int samp;
        for (int j = 0; j < data.length; j++) {
        	
    
        	samp=data[j]+1;
        	if(data[j]<data.length-1) {
        	if(samp!=data[j+1]) {
        		System.out.println(samp);
        		
        	}
        	}
        	}
        }
        	
        }

			
		
   
        /*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Traverse through each array item
		 3) Compare consecutive items -> 
		 		the next one should be = previous one + 1
		 4) If the following one is not +1 -> Print as missing
		 */
		
		
		
		
		
		
		
		// Print the second largest number	
		
		
	
