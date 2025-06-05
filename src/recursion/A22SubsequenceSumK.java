package recursion;

import java.util.*;

//Q - Print only first subsequence
public class A22SubsequenceSumK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = { 1, 2, 1 };
		int sum = 2;
		int currentSum = 0;
		List<List<Integer>> ans = new ArrayList<>();
		subsequenceSumK(input, new ArrayList<>(), 0, ans, sum, currentSum);
		System.out.println(ans);

	}

	private static boolean subsequenceSumK(int[] input, ArrayList arrayList, int i, List<List<Integer>> ans,
			int totalSum, int currSum) {
		if (i == input.length) {
			if (currSum == totalSum) {
				ans.add(new ArrayList<>(arrayList));
				return true;
			}
			return false;
		}
		// including
		arrayList.add(input[i]);
		// call
		if (subsequenceSumK(input, arrayList, i + 1, ans, totalSum, currSum + input[i]) == true)
			return true;	// return from here, no need to check further calls
		// removing the added element
		arrayList.remove(arrayList.size() - 1);
		if (subsequenceSumK(input, arrayList, i + 1, ans, totalSum, currSum) == true)
			return true; // return from here, no need to check further calls
		// if no one has return true then return false;
		return false;

	}

}
