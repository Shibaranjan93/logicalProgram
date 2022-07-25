package LogicalProgram;

public class Swappingintegers {

	public static void main(String[] args) {
		//1st process
		int a=10;
		int b=20;
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("the value of a:" +a);
		System.out.println("the value of b:" +b);
		System.out.println("***********");
		
		//2nd process
        int x=50;
        int y=100; 
        x=x+y;
        y=x-y;
        x=x-y;
		System.out.println("the value of x:" +x);
		System.out.println("the value of y:" +y);
		System.out.println("*******");
		//3rd process
		int p=30;
		int q=40;
		p=p^q;
		q=p^q;
		p=p^q;
		
		System.out.println("the value of p:"+p);
		System.out.println("the value of q:"+q);

		
	}
	

}
