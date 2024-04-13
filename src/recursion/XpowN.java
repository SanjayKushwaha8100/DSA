package recursion;

public class XpowN { // height of tree is N
	static int count=0;
	static int xPowerN(int x,int n) {
		if(n==1)return x;
		if((n&1)==0) {// even
			int half=xPowerN(x,n/2);
			System.out.println("even:"+(++count));
			return half*half;
		}
		else {
			int half=xPowerN(x,n/2);
			System.out.println("odd:"+(++count));
			return half*half*x;
		}
//		return x * xPowerN(x,n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(xPowerN(2,10));
		
		
		

	}

}
