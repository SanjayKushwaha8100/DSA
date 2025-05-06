package recursion;

public class InviteNtoParty {
	static int ways(int n) {
		
		// if n=2 then (n-2)it will be zero but 
		// that is also a way to call the guest
		if(n<=1)return 1;
		
		
		// OR
		
		// this will also work
		if(n==0)return 1;
		if(n<0)return 0;
		
		// single calling 
		int singleCalling=ways(n-1);
		
		//for pair calling= n-1 ways to pair it and make 
		//the call for remaining that is n-2
		int pairCalling=((n-1)*ways(n-2));
		
		return singleCalling+pairCalling;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=4;
		System.out.println("Total no of ways "+ N +" person can come to party:"+
		ways(N));

	}

}
