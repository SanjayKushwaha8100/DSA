package recursion;

public class ReverseString {
	static String reverse(String a) {
		int count=0;
		if(a.length()==1) {
			return a;
		}
		else {
			String curr=a.substring((count),1);
			count++;
			String temp=reverse(a.substring(count));
			return temp+curr;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse("ac d"));
//		System.out.println("abc".substring(1));
		
		

	}

}
