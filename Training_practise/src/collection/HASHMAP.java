package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HASHMAP {public class Q4 
{

	public static void main(String[] args)
	{
		HashMap<Integer,String> m= new HashMap<>();
		m.put(11,"Sham");
		m.put(12, "Ajay");
		m.put(13, "Suraj");
		m.put(14, "Ankush");
		m.put(15,"Prakash");
		Set<Map.Entry<Integer,String>> entryset= m.entrySet();
		Iterator<Map.Entry<Integer, String>> itr= entryset.iterator();
		while (itr.hasNext()) 
		{
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) itr.next();
			System.out.println(entry);
		}
	}

}

}
