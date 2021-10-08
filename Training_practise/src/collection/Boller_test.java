package collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class Boller_test 
{
	
	
	
		public static void main(String[] args) 
		{
			Boller b1= new Boller(1, "ank");
			Boller b2= new Boller(2, "pra");
			Boller b3= new Boller(4, "mmm");
			Boller b4= new Boller(3, "gfh");
			
			Batsman a1= new Batsman(5, "add");
			Batsman a2= new Batsman(7, "man");
			Batsman a3= new Batsman(8, "pk");
			Batsman a4= new Batsman(6, "gh");
			
			ArrayList a = new ArrayList();
			a.add(b1);//0
			a.add(a1);//1
			a.add(b2);//2
			a.add(a2);//3
			a.add(b3);//4
			a.add(a3);//5
			a.add(b4);//6
			a.add(a4);//7
			

			Set s1 = new HashSet<>();

			Set s2 = new HashSet<>();

			for (int i = 0; i < a.size(); i++) 
			{
				if (i % 2 == 0) 
				{
					s1.add(a.get(i));
				} 
				else
				{
					s2.add(a.get(i));
				}

			}

			System.out.println(s1);
			System.out.println(s2);

		}

	}


