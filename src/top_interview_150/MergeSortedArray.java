package top_interview_150;

class Solution {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m - 1;
		int j = n - 1;
		int k = m + n - 1;
		if (n == 0)
			return;
		for (int I = k; I > 0 & j>=0; I--) {
			if (nums1[i] > nums2[j]) {
				nums1[I] = nums1[i--];
			} else if (nums1[i] < nums2[j]) {
				nums1[I] = nums2[j--];

			} else if (nums1[i] == nums2[j]) {
				nums1[I] = nums2[j--];
				nums1[I] = nums1[i--];

			}

		}
	}
}

public class MergeSortedArray {
    public static void main(String[] args) {
        // Example Input
        Solution solution = new Solution();
        int[] nums1 = {1, 2, 3, 0, 0, 0}; // m = 3 elements followed by 0s
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        solution.merge(nums1, m, nums2, n);

        // Output the merged array
        System.out.println("Merged Array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
