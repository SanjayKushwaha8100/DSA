package recursion;

public class SumOfNnaturalNumbers {
	static int helper(int n) {
		if(n<=0)return n;
		return n+helper(n-1);
	}
	public static void main(String args[]) {
		int n = 10;
		System.out.println(helper(5));
	}

}
