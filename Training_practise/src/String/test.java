package String;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);	
		System.out.println("Enter a string");
		String s=sc.nextLine();
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);

	}

}
