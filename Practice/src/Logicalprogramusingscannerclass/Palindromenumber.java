package Logicalprogramusingscannerclass;

import java.util.Scanner;

public class Palindromenumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number");
		int no=sc.nextInt();
		int n=no;
		int temp=n;
		int s=0;
		int r;
		while(n>0) {
			r=n%10;
			n=n/10;
			s=(s*10)+r;
			
		}
		if(temp==s) {
			System.out.println("This is Palindrome");
		}
		else {
			System.out.println("This is not Palindrome");
		}
		
	}

}

