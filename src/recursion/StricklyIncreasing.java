package recursion;
import java.util.*;

public class StricklyIncreasing {
	
	static boolean increasing(int arr[],int indx) {
		if(indx==arr.length-1) {
			return true;
		}
		if(arr[indx]>=arr[indx+1]) {
			return false;
		}
		return increasing(arr,(indx+1)); // return as it is 
		
	}

	public static void main(String[] args) {
		int a[]= {2,4,6,8,9};
		System.out.println(increasing(a,0)==true?"Strickly Increasing":"Not");
		
		

	}

}
