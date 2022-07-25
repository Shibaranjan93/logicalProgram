package general;

public class Missing_number {

	public static void main(String[] args) {
		int [] arra= {1,2,3,4,6,7};
		System.out.println("Missing number of array is :"+ Missingnumber(arra));

	}
	private static int Missingnumber(int[] arra) {
	int	n=arra.length+1;
	int	sum= n*(n+1)/2;
	int	restsum=0;
	for(int i=0;i<arra.length;i++) {
	restsum+=arra[i];
	}
	int Missingnumber= sum-restsum;
	return Missingnumber;
}
}