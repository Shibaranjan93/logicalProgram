package JavaProgram;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 12345;
		int rev = 0;
		int r;
		while(num !=0) {
			r=num%10;
			num=num/10;
			rev=(rev*10)+r;
		}
		System.out.println(rev);

	}

}
