package JavaProgram;

public class NumberofDigits {

	public static void main(String[] args) {
		
		long num = 9437097111l;
		int count = 0;
		while(num != 0) {
			 num=num/10;
			 ++count;
		}
		System.out.println("Number of Digitxs is = "+count);
		

	}

}
