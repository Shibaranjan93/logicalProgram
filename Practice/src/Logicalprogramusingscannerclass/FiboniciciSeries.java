package Logicalprogramusingscannerclass;

public class FiboniciciSeries {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		//System.out.println(a+" "+b);
		int c;
		for(int i=1;i<=10;i++){
			c=a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
		}
//		int c=0;
//		System.out.println("1");
//		while(c<=100) {
//			c=a+b;
//			if(c>=100)
//				break;
//			else
//				System.out.println("");
//			System.out.println(c);
//			a=b;
//			b=c;
//		
		
	}

}
