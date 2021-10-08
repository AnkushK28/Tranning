package oops;

public class Rectangle 
{
		int length;
		int breadth;

		public void area() 
		{
			int area = length * breadth;
			System.out.println("area of rectangle " + area);
		}

		void perimeter() 
		{
			
			int p = 2 * (length + breadth);
			System.out.println("perimeter of rectangle " + p);
		}

		public Rectangle(int l, int b) 
		{
			length = l;
			breadth = b;
		}

		}

	class Square extends Rectangle
	{

		public Square() 
		{
			super(5, 10);
		}

	}


