package recursion;

import java.util.*;

//Q - Print total number of subsequence having sum k
// when ever these is a question for count then use return (left + right)
public class A23SubsequenceSumK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = { 1, 2, 1 };
		int sum = 2;
		int currentSum = 0;
		int totalSubsequence = subsequenceSumK(input, new ArrayList<>(), 0, sum, currentSum);
		System.out.println(totalSubsequence);
	}

	private static int subsequenceSumK(int[] input, ArrayList arrayList, int i, int totalSum, int currSum) {
		if (i == input.length) {
			if (currSum == totalSum) {
				return 1;
			}
			return 0;
		}
		// including
		arrayList.add(input[i]);

		return (subsequenceSumK(input, arrayList, i + 1, totalSum, currSum + input[i]))
				+ (subsequenceSumK(input, arrayList, i + 1, totalSum, currSum));

	}

}
