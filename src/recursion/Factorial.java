package recursion;

import java.util.Scanner;

public class Factorial {
	
	static long factorial(int a) {
		if(a==0)return 1;
		return a*factorial(a-1);
	}
	
	
	public static void main(String args[]) {
		System.out.println("Enter a number to find's it's Factorial");
		Scanner scanner=new Scanner(System.in);
		int input=scanner.nextInt();
		long ans=factorial(input);
		System.out.println("Factorial is: "+ans);
		// ok
		
	}

}
