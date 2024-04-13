package recursion;

public class SimpleRecursionCall {
	
	static void print(int a) {
		if(a==0) {
			return;
		}
		System.out.println(a);
		print(a-1);

		
	}
	public static void main(String args[]) {
		print(5);
	}

}
