package general;

public class pallindrome1 {

	public static void main(String[] args) {
		int a;
		int b=0;
		int n=565;
		int x;
		x=n;
		while(n>0){
			a=n%10;
			b=(b*10)+a;
			n=n/10;
		}
if(x==b)
	System.out.println("This is Palindrome");
else
	System.out.println("This is not palindrome");
	   }
	
		

	}

