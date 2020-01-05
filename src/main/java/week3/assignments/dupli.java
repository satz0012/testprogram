package week3.assignments;

import java.util.ArrayList;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class dupli {
	public static void main(String[] args)
	{
	String s="PayPalIndia";
	System.out.println("The given String is:" +s);
	char[] charArray = s.toCharArray();
	Set<Character> se = new LinkedHashSet<>();
	List<Character> li = new ArrayList<>();
	
	for (int i = 0; i <charArray.length; i++) {
		if(li.contains(charArray[i]))
        {
		se.add(charArray[i]);
        }
		else		
			{
			li.add(charArray[i]);
			}
		
		}
	System.out.println("The given list is:" +li);
	System.out.println("The given set is:" +se);
	
	for (Character eachcharacter : se) {
		if(li.contains(eachcharacter))
		{
			li.remove(eachcharacter);
		}
		
	}	
		
	
	
	
	System.out.println("Removing duplicate characters:" +li);		
	

}
}
