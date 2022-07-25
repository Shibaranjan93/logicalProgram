package general;

import java.util.Scanner;

public class Reverse_Name {

	public static void main(String[] args) {
		String Welcome, reverse="";
		Scanner scn=new Scanner(System.in);
		System.out.println("Shibu");
		Welcome=scn.nextLine();
		int Length=Welcome.length();
		for(int i=Length-1;i>=0;i--)
			reverse=reverse+Welcome.charAt(i);
		System.out.println("Reverse Sring: "+reverse);
		
		
		
		
		
		

	}

}
