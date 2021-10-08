package collection;

import java.util.ArrayList;

public class Arraylist 
{
	public static void main(String[] args) 
	{
		ArrayList arr= new ArrayList<>();
		arr.add(11);
		arr.add("Ankush");
		arr.add(12);
		arr.add("prakash");
		arr.add(13);
		arr.add("sham");
		arr.add(14);
		arr.add("arjun");
		arr.add(15.5f);
		arr.add(true);
		{
			for(int i=0;i<arr.size();i++)
			{
				Object data= arr.get(i);
				System.out.println(data);			
			}
		}
		System.out.println("-----------");
		for(Object x:arr)
		{
			System.out.println(x);
		}
	}

}
