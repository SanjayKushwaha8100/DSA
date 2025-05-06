package recursion;

public class A1PalindromeCheck {
	static boolean help(String a,int left,int mid,int size) {

		if(left>mid)return true;
		if(a.charAt(left)!=a.charAt(size-1-left))return false;
		return help(a,left+1,mid,size);
	}
	public static void main(String args[]) {
		String a = "madam";
		int mid = a.length()/2;
		int size = a.length();
		if(help(a,0,mid,size)==true) {
			System.out.println("Is Palindrome");
		}else {
			System.out.println("not a Palindrome");
		}
		
	}

}
