package week3class2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class maptest {
	public static void main(String[] args) {
	String name="SATISH";
	char[] charArray = name.toCharArray();
	
	Map <Character,Integer> mp = new LinkedHashMap<>();
	for (int i = 0; i <=charArray.length-1; i++) 
	{

		if(mp.containsKey(charArray[i]))
		{
			Integer value = mp.get(charArray[i])+1;
			mp.put(charArray[i], value);
		
			
	} 
		
		else
		{
			mp.put(charArray[i],1);
		}
		
	} 
		
	System.out.println(mp);	
	}
	
	
	
	

}

