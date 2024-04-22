package recursion;

public class PlaceTiles {
	static int totalWays(int n,int m) {
		// or we can give the base cases as 
		if(n==m)return 2;
		if(n<m)return 1;
		
//		OR
		
//		if(n==0 ) {
//			return 1;
//		}
//		if(n<0)return 0;
		// for vertical         // for horiz
		return (totalWays(n-m,m)+totalWays(n-1,m));
		//
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(totalWays(4,2));
	}

}
