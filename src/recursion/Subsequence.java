package recursion;

import java.util.*;

public class Subsequence {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = { 1, 2, 3 };
		List<List<Integer>> ans = new ArrayList<>();
		subsuquence(input, ans, 0, new ArrayList<>());
		System.out.println(ans);
	}
	private static void subsuquence(int[] input, List<List<Integer>> ans, int index, List<Integer> subset) {
		if (index == input.length) {
			ans.add(new ArrayList<Integer>(subset));
//			System.out.println(subset);
			
			return;
		}
		// including the element
		subset.add(input[index]);
		subsuquence(input, ans, index + 1, subset);
		// removing the ele
		subset.remove(subset.size()-1);
		subsuquence(input, ans, index + 1, subset);
	}

}
