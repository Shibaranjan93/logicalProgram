package LogicalProgram;

import java.util.Scanner;

public class PrintDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int s=0,c;
		
		for(c=1;c<=n;c++) {
			s=(s*10)+c;
			System.out.println(s+" ");
		}
		
		

	}

}
