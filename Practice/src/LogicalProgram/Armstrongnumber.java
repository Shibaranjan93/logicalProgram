package LogicalProgram;

public class Armstrongnumber {
	public static void isArmstrongnumber(int num) {
		int cube=0;
		int r;
		int t;
		t=num;
		while(num>0) {
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r*r);
		}
		if(t==cube) {
			System.out.println("This is an ArmstrongNumber");
		}
		else {
			System.out.println("This is not an Armstrongnumber");
		}
	}

	public static void main(String[] args) {
		isArmstrongnumber(1634);
		
		

	}

}
