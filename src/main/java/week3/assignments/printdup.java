package week3.assignments;
import java.util.ArrayList;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
public class printdup {
	

	public static void main(String[] args)
	{
		String com="Infosys Limited";
				 char[] charArray = com.toCharArray();
				 Set<Character> name = new LinkedHashSet<>();
				 List<Character> name1 = new ArrayList<>();
				 for (int i = 0; i < charArray.length; i++) {
					 name.add(charArray[i]);
					 name1.add(charArray[i]);	
				}
				 System.out.println("The given list is:" +name1);
				 System.out.println("The given set is:" +name);
				 
				 
				for (Character eachcharacter : name) {
					if(name1.contains(eachcharacter))
					{
						name1.remove(eachcharacter);
					}
					
					
				}
				
				System.out.println("Print duplicates:" +name1);
				
				
		
	}

}
