package day2.classroom.str;

public class charocurr {
	
public static void main(String[] args)
	{
		String text="Sarath";
		char ch='a';
		int count=0;
		char[] charArray = text.toCharArray();
		for (int j = 0; j < charArray.length; j++) {
			
		
			if(charArray[j] == ch)
			{
				count++;
				
				
			}
			
			
		}
		System.out.println(count);
	}



}
