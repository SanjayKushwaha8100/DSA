package recursion;
import java.util.*;
public class FibonacciSequence {

	
	static int fibSeq(int a) {
		if(a<=1)return a;
		int c=fibSeq(a-1)+fibSeq(a-2);
//		System.out.println(c);
		return c;
		

	}
	public static void main(String[] args) {
		System.out.println(fibSeq(4));
		

	}

}
