package recursion;

public class FirstAndLastOccuranceOfAnEle {
	static int first=-1;
	static int last=-1;
	static void occurance(String inp,char inpChar,int indx) {
		if(indx==inp.length()) {
//			System.out.println(indx);
			System.out.println("First:"+first);
			System.out.println("Last:"+last);
			return;
		}
		char currChar=inp.charAt(indx);
		if(currChar==inpChar) {
			if(first==-1) {
				first=indx;
			}
			else {
				last=indx;
			}
		}
		occurance(inp,inpChar,(++indx));
		
	}

	public static void main(String[] args) {
		occurance("abaaca",'a',0);
//		System.out.println(first+last);
		
		

	}

}
