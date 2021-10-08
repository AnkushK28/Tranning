package collection;

import java.util.HashMap;
import java.util.Map;

public class Test 
{
	public static void main(String[] args) {

	String s="pizzpan";
	
	Map<Character, Integer> m= new HashMap<>();
	

	for (int i = 0; i < s.length(); i++) 
	{
		char temp = s.charAt(i);
		
		if(m.containsKey(temp))
		{
			int x = m.get(temp);
			
			m.put(temp, ++x);
		}
		else
		{
			m.put(temp, 1);
		}
		System.out.println(temp);
	}
	System.out.println("____________________");
	System.out.println(m);
	
	}
}
