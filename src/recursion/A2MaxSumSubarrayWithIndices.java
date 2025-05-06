//		Output: 7
//		Explanation: Subarray with maximum sum is [3, 4].
//		Example 1:
//		int[] Input = { 2, 1, 5, 1, 3, 2 };
//		int k = 3;
//		Output: 9
//		Explanation: Subarray with maximum sum is [5, 1, 3].
//		Example 2:
package recursion;

import java.util.*;

public class A2MaxSumSubarrayWithIndices {
	public static int[] maxSumSubarrayWithIndices(int[] arr, int k) {
        if (arr == null || arr.length < k || k <= 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        int maxSum = 0, windowSum = 0, start = 0;
        for (int i = 0; i < k; i++) {
            maxSum += arr[i];
        }

        windowSum = maxSum;
        for (int i = k; i < arr.length; i++) {
            windowSum = windowSum + arr[i] - arr[i - k];
            if (windowSum > maxSum) {
                maxSum = windowSum;
                start = i - k + 1;
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = arr[start + i];
        }
        return result;
    }

	public static void main(String[] args) {
        int[] input = {2, 3, 4, 1, 5};
        int k = 2;

        // Optionally print subarray
        int[] maxSubarray = maxSumSubarrayWithIndices(input, k);
        System.out.println("Subarray with max sum: " + java.util.Arrays.toString(maxSubarray));
    }

}
