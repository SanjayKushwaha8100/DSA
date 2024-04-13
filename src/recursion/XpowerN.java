package recursion;

public class XpowerN { // height of tree is N
	static int xPowerN(int x,int n) {
		if(n==1)return x;
		return x * xPowerN(x,n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(xPowerN(0,10));
		
		
		

	}

}
