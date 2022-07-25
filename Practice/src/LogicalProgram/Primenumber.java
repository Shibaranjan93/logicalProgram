package LogicalProgram;

public class Primenumber {
	public static boolean isPrimnumber(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void getPrimenumber(int num) {
		for(int i=2;i<=num;i++) {
			if(isPrimnumber(i))
				System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {
		System.out.println(isPrimnumber(4));
		getPrimenumber(15);		

	}

}
