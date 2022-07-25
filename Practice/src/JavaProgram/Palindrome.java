package JavaProgram;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int temp=n;
		int s=0;
		int r;
		while(n>0) {
			r=n%10;
			n=n/10;
			s=(s*10)+r;	
		}
		if(temp==s) {
			System.out.println("This is palindrome");
		}
		else {
			System.out.println("This is Not palindrome");
		}
	}

}
