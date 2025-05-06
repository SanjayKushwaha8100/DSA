package recursion;

public class KeypadCombination {
	static String keypad[]= {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	static void printComb(String inp,int indx,String comb) {
		if(indx==inp.length()) {
			System.out.println(comb);
			return;
		}
		String mapping=keypad[inp.charAt(indx)-'0'];
		for(int i=0;i<mapping.length();i++) {
//			comb+=mapping.charAt(i); // if you uncomment this link and pass comb then u will get 6 char
			printComb(inp,indx+1,comb+mapping.charAt(i));
		}
	}

	public static void main(String[] args) {
		printComb("23",0,"");

	}

}
