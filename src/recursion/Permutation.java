package recursion;

public class Permutation {
	static void print(String inp,String permutation) {
		if(inp.length()==0) {
			System.out.println(permutation);
			return;
		}
		// for first time for loop will go for a,b,c 
		// then if a is selected then bc will be pass
		// if b is selected ac will be pass
		// if c is selected then ab will be pass
		
		// then for second lvl in recursion tree
		// let take a is selected and bc is passed 
		// then again b is selected c will be pass 
		// or c is selected b will be pass
		
		// for 3rd lvl in recursion tree 
		// single single ele will be pass 
		
		// and in 4th lvl length==0 so return 
		for(int i=0;i<inp.length();i++) {
			char currChar=inp.charAt(i);
			String left=inp.substring(0,i)+inp.substring(i+1);
			print(left,permutation+currChar);

		}
	}
	public static void main(String[] args) {
		String a="abc";
		print(a,"");
		

	}

}
