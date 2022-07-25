package LogicalProgram;

public class Factorialnumber {
	//without Recursive function
	public static int isFactorialnumber(int num) {
		int fact=1;
		if(num==0) {
			return 1;
		}
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}
	//with recursive function
	public static int fact(int num) {
		if(num==0)
			return 1;
		else
			return(num*fact(num-1));
	}
	public static void main(String[] args) {
		System.out.println(isFactorialnumber(4));
		System.out.println(fact(3));

	}

}
