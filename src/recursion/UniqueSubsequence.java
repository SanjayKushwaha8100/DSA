package recursion;

import java.util.HashSet;

public class UniqueSubsequence {
	static void uniqSubseq(String inp,int indx,String out,HashSet<String> set) {
		if(indx==inp.length()){
			if(set.contains(out)) {
				return;
			}
			else {
				set.add(out);
				System.out.println(out);
				return;
				}
		}
		char curr=inp.charAt(indx);
		uniqSubseq(inp,indx+1,out+curr,set);
		uniqSubseq(inp,indx+1,out,set);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<>();
		uniqSubseq("aaa",0,"",set);
		

	}

}
