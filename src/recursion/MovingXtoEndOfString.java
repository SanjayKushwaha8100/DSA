package recursion;

public class MovingXtoEndOfString {
	static int count=0;
	static String moving(String inp,int indx) {
		String a="";
		if(indx==inp.length()) {
//			System.out.println(indx+"\t"+inp.length());
			String b="";
			while(count>0) {
				b+="x";
				count--;
			}
			return b;
		}
		if(inp.charAt(indx)=='x') {
			count++;
			return a+=moving(inp,indx+1);
		}
		else {
			a=inp.substring(indx,indx+1);// taking a char
			return a+=moving(inp,indx+1);
		}
	}

	public static void main(String[] args) {
		System.out.println(moving("xxbx",0));
		

	}

}
