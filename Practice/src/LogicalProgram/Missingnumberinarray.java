package LogicalProgram;

public class Missingnumberinarray {

	public static void main(String[] args) {
		int[] a= {1,3,4,5};
		int sum=0;
		for (int i=0;i<a.length;i++) {//actual
			sum=sum+a[i];
			
		}
		System.out.println(sum);
		
		int restsum=0;
		for(int j=1;j<=5;j++) {//expected
			restsum=restsum+j;
		}
		{
			System.out.println(restsum);
			System.out.println("missing number is :"+(restsum-sum));
		}

	}

}