package general;

public class Swapping_value {

	public static void main(String[] args) {
		int a=5,b=10;
		System.out.println("First number= " +a);
		System.out.println("Second number= "+b);
		
		a=a-b;
		b=a+b;
		a=b-a;
		
		System.out.println("First number= " +a);
		System.out.println("Second number= "+b);
		
		

	}

}
