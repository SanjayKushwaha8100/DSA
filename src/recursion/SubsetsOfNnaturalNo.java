package recursion;

import java.util.ArrayList;
import java.util.Collections;

public class SubsetsOfNnaturalNo {
	
	static void printSubset1(String inp,int indx,String out) {
		if(indx==inp.length()) {
			System.out.println(out);
			return;
		}
		printSubset1(inp,indx+1,out);
		printSubset1(inp,indx+1,out+inp.charAt(indx));
	}
	
	static void printSubset2(int n,ArrayList<Integer>subset) {
		if(n==0) {
			System.out.println(subset);
			return;
		}
		subset.add(n);
		// after adding making a call
		printSubset2(n-1,subset);
		// without adding. we have to remove the ele which we have added
		subset.remove(subset.size()-1);
		printSubset2(n-1,subset);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>subset=new ArrayList<>();
		printSubset1("321",0,"");
		System.out.println("\n");
		printSubset2(3,subset);

		

	}

}
