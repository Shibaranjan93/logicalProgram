package general;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=1,b=1,c=0;
		System.out.println("1");
		while(c<=100) {
			c=a+b;
			if(c>=100)
				break;
			else
				System.out.println("");
			System.out.println(c);
			a=b;
			b=c;
			
		}

	}

}
