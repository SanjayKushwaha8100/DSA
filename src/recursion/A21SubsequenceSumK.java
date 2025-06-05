package recursion;
import java.util.*;
public class A21SubsequenceSumK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {1,2,1};
		int sum = 2;
		int currentSum = 0;
		List<List<Integer>>ans = new ArrayList<>();
		subsequenceSumK(input,new ArrayList<>(),0, ans,sum,currentSum);
		System.out.println(ans);
		

	}

	private static void subsequenceSumK(int[] input, ArrayList arrayList, int i,List<List<Integer>>ans,int totalSum,int currSum) {
		if (i == input.length) {
            if (currSum == totalSum) {
                ans.add(new ArrayList<>(arrayList));
            }
            return;
        }
		// including 
		arrayList.add(input[i]);
		// call
		subsequenceSumK(input,arrayList,i+1,ans,totalSum,currSum+input[i]);
		// removing the added element
		arrayList.remove(arrayList.size()-1);
		subsequenceSumK(input,arrayList,i+1,ans,totalSum,currSum);
		
	}

}
