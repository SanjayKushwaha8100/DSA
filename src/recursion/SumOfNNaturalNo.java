package recursion;

public class SumOfNNaturalNo {
	static int printSumNaturalNo(int a) {
		if(a==0)return a;
		return a+printSumNaturalNo(a-1);
		
		
	}
	
	public static void main(String args[]) {
			// print sum of first 10 natural no 
		int ans=printSumNaturalNo(10);
		System.out.println(ans);
	}

}
