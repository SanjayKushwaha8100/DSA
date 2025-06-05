package ok;

class Solution {
    public String minWindow(String s, String t) {
        int m = s.length();
        int n = t.length();

        if (m < n) return ""; // If s is smaller than t, no valid window exists

        // Frequency array for characters in t
        int[] hashArr = new int[128]; // Use 128 since characters can be lowercase and uppercase
        for (int i = 0; i < n; i++) {
            hashArr[t.charAt(i)]++;
        }

        int l = 0, r = 0;
        int ct = 0; // Count of matching characters
        int minLen = Integer.MAX_VALUE; // Initialize minLen to a large value
        int sIndex = -1;

        while (r < m) {
            // Expand window by moving r
            char rightChar = s.charAt(r);
            if (hashArr[rightChar] > 0) {
                ct++;
            }
            hashArr[rightChar]--; // Decrease the count for the current character

            // When we have a valid window, try to minimize it
            while (ct == n) {
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    sIndex = l;
                }

                // Contract the window by moving l
                char leftChar = s.charAt(l);
                hashArr[leftChar]++; // Increase the count back when moving left
                if (hashArr[leftChar] > 0) {
                    ct--; // Decrease the match count if a necessary character is lost
                }
                l++;
            }

            r++;
        }

        // Return the smallest window or an empty string if no window was found
        return sIndex == -1 ? "" : s.substring(sIndex, sIndex + minLen);
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        String s1 = "ADOBECODEBANC";
        String t1 = "ABC";
        System.out.println("Test case 1: " + solution.minWindow(s1, t1)); // Expected: "BANC"

        String s2 = "a";
        String t2 = "a";
        System.out.println("Test case 2: " + solution.minWindow(s2, t2)); // Expected: "a"

        String s3 = "a";
        String t3 = "aa";
        System.out.println("Test case 3: " + solution.minWindow(s3, t3)); // Expected: ""
    }
}