package LogicalProgram;

public class Palindrome {
	public static void isPalindrome(int num) {
		int r=0;
		int sum=0;
		int t;
		t=num;
		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(t==sum) {
			System.out.println("This is palindrome");
		}
		else {
			System.out.println("This is not a palindrome");
		}
	}
	

	public static void main(String[] args) {
		isPalindrome(122);
		
		

	}

}
