package recursion;


public class TowerOfHanoi {
	static void tower(int n,String src,String helper,String desc) {
//		System.out.println("Current disk "+n);
		if(n==1) {
			System.out.println("Transfer disk "+ n+ " from "+src+" to "+desc);
			return;
		}
		tower(n-1,src,desc,helper);
		System.out.println("Transfer disk "+ n+ " from "+src+" to "+desc);
		tower(n-1,helper,src,desc);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tower(3,"S","H","D");

	}

}
