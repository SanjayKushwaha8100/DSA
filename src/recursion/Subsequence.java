package recursion;

public class Subsequence {
	static void subseq(String inp,int indx,String out) {
		if(indx==inp.length()) {
			// here indx will be out of bound which is equal to length
			System.out.println(out);
			return;
		}
		char curr=inp.charAt(indx);
		
		// including curr char 
		subseq(inp,indx+1,out+curr);
		// not including curr char 
		subseq(inp,indx+1,out);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subseq("abc",0,"");

	}

}
