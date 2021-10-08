package String;

import java.util.Scanner;

public class Occanrance
{

		public static void main(String[] args)
		{
			Scanner sc= new Scanner(System.in);	
			
			System.out.println("Enter a string");
			String s=sc.nextLine();
			String t[] =s.split(" ");
			for(int i=0;i<t.length;i++)
			{
				int c=1;
				for(int j=i+1;j<t.length;j++)
				{
				if(t[i].equals(t[j]))
				{
					c++;
					t[j]="@";
					
				}
			}
				if(!t[i].equals("@"))
			System.out.println(t[i]+" = "+c);
		}

		}
	}

