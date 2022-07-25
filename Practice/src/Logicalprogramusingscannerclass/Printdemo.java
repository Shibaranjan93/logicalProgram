package Logicalprogramusingscannerclass;

import java.util.Scanner;

public class Printdemo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number");
		int no=sc.nextInt();
		int n=no;
		int s=0,c;
		for(c=1;c<=n;c++) {
			s=(s*10)+c;
			System.out.println(s+" ");
			
		}	
	}

}
