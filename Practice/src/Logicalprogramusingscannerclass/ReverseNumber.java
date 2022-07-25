package Logicalprogramusingscannerclass;

public class ReverseNumber {

	public static void main(String[] args) {

		int n=54321;
		int rev=0;
		int r;
		while(n!=0) {
			r=n%10;
			n=n/10;
			rev=(rev*10)+r;
		}
		System.out.println(rev);
	}

}
