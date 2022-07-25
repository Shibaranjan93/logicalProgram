package JavaProgram;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		boolean isPrime = true;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				isPrime=false;
				break;
				
			}
		}
		if(isPrime) {
			System.out.println("This is PrimeNumber");
		}
		else {
			System.out.println("This is not PrimeNumber");
		}

	}

}
