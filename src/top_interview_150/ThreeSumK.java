package top_interview_150;

import java.util.*;

public class ThreeSumK {
    public List<List<Integer>> threeSum2(int[] nums, int k) {
        Arrays.sort(nums);
        int size = nums.length;
        Set<List<Integer>> ans = new HashSet<>();
        
        for(int i = 0; i < size - 2; i++) {
            int left = i + 1;
            int right = size - 1;
            while(left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                if(currentSum == k) {
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if(currentSum < k) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return new ArrayList<>(ans);
    }

    public static void main(String[] args) {
        ThreeSumK solution = new ThreeSumK();
        
        // Test Case 1: Empty array
        int[] nums1 = {};
        int m1 = 0;
        System.out.println("Test Case 1: nums = [], m = 0");
        System.out.println("Output: " + solution.threeSum2(nums1, m1)); // Expected: []

        // Test Case 2: Less than 3 elements
        int[] nums2 = {1, 2};
        int m2 = 3;
        System.out.println("\nTest Case 2: nums = [1, 2], m = 3");
        System.out.println("Output: " + solution.threeSum2(nums2, m2));

        // Test Case 3: No triplets
        int[] nums3 = {1, 2, 3};
        int m3 = 12;
        System.out.println("\nTest Case 3: nums = [1, 2, 3], m = 12");
        System.out.println("Output: " + solution.threeSum2(nums3, m3));

        // Test Case 4: Single triplet
        int[] nums4 = {1, 2, 3, 4, 5, 6};
        int m4 = 12;
        System.out.println("\nTest Case 4: nums = [1, 2, 3, 4, 5, 6], m = 12");
        System.out.println("Output: " + solution.threeSum2(nums4, m4));// Expected: [[1, 5, 6], [2, 4, 6]]

        // Test Case 5: Duplicates
        int[] nums5 = {2, 2, 2, 2};
        int m5 = 6;
        System.out.println("\nTest Case 5: nums = [2, 2, 2, 2], m = 6"); 
        System.out.println("Output: " + solution.threeSum2(nums5, m5)); // Expected: [[2, 2, 2]]

        // Test Case 6: Negative numbers
        int[] nums6 = {-1, 0, 1, 2, -1, -4};
        int m6 = 0;
        System.out.println("\nTest Case 6: nums = [-1, 0, 1, 2, -1, -4], m = 0");
        System.out.println("Output: " + solution.threeSum2(nums6, m6)); // Expected: [[-1, -1, 2], [-1, 0, 1]]

        // Test Case 7: All zeros
        int[] nums7 = {0, 0, 0, 0};
        int m7 = 0;
        System.out.println("\nTest Case 7: nums = [0, 0, 0, 0], m = 0");
        System.out.println("Output: " + solution.threeSum2(nums7, m7)); // Expected: [[0, 0, 0]]

        // Test Case 8: Large numbers
        int[] nums8 = {1000000, 1000000, 1000000};
        int m8 = 3000000;
        System.out.println("\nTest Case 8: nums = [1000000, 1000000, 1000000], m = 3000000");
        System.out.println("Output: " + solution.threeSum2(nums8, m8)); // Expected: [[1000000, 1000000, 1000000]]
    }
}
