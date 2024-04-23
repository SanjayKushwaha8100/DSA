package recursion;
import java.util.*;
public class RemovingDuplicateInString {
	static boolean array[]=new boolean[30];
	static void removing(String inp,int indx,String output) {
		if(indx==inp.length()) {
			// so this will return when indx will be 1 more than or = length
			// but we are just returning no accessing any
			// ele so no issues;
			System.out.println(output);
			return;
		}
		char temp=inp.charAt(indx);
		if(array[temp-'a']==false) {// not found
			array[temp-'a']=true;	// updated the array
			output+=(temp); // conveting char to string
			removing(inp,indx+1,output);
		}
		else {
			removing(inp,indx+1,output);
			
		}
	}
	


	public static void main(String[] args) {
		String str="abbcdaacegtuidxrgfhdtssezfw";
		removing(str,0,"");

		


	}

}
