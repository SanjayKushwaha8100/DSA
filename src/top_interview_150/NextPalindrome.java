package top_interview_150;

import java.math.BigInteger;
// issue in solution
public class NextPalindrome {
    public String solve(String A) {
        int n = A.length();
        
        if (n == 1) {
            BigInteger num = new BigInteger(A);
            if (num.compareTo(BigInteger.valueOf(9)) < 0 ) {
                return num.add(BigInteger.ONE).toString(); // next number
            }
            return "11";
        }

        int mid = (n + 1) / 2;
        String leftHalf = A.substring(0, mid);
        String palindrome = createPalindrome(leftHalf, n);

        if (new BigInteger(palindrome).compareTo(new BigInteger(A)) <= 0) {
            // Increase the mid
            int carry = 1;
            char leftHalfArray[] = leftHalf.toCharArray();
            for (int i = leftHalf.length() - 1; i > 0 && carry > 0; i--) {
                int digit = (leftHalfArray[i] - '0') + carry;
                leftHalfArray[i] = (char) (digit % 10 + '0');
                carry = digit / 10;  
            }
            if (carry > 0) { // Case for numbers like 999...
                if (n % 2 == 1) { // Odd length, no increase in length
                    leftHalf = "1" + new String(leftHalfArray);
                    palindrome = createPalindrome(leftHalf, n + 1);
                    System.out.println(leftHalf);
                } else { // Even length, length increases
                    leftHalf = "1" + new String(new char[n / 2]).replace('\0', '0');
                    palindrome = createPalindrome(leftHalf, n + 1);
                    System.out.println(leftHalf);
                }
            } else {
                leftHalf = new String(leftHalfArray);
                palindrome = createPalindrome(leftHalf, n);
            }
        }
        return palindrome;
    }

    String createPalindrome(String leftHalf, int totalLength) {
        int start = totalLength % 2 == 0 ? leftHalf.length() - 1 : leftHalf.length() - 2;
        StringBuilder palindrome = new StringBuilder(leftHalf);
        char leftHalfArray[] = leftHalf.toCharArray();
        for (int i = start; i >= 0; i--) {
            palindrome.append(leftHalfArray[i]);
        }
        return palindrome.toString();
    }

    public static void main(String[] args) {
        NextPalindrome solution = new NextPalindrome();
        
        // Test case 1: Input "99"
        String input1 = "99";
        String result1 = solution.solve(input1);
        System.out.println("Test case 1: Input = " + input1 + ", Output = " + result1);
        System.out.println("Expected: 101, Actual: " + result1 + ", Pass: " + result1.equals("101"));
        
        // Test case 2: Input "999"
        String input2 = "999";
        String result2 = solution.solve(input2);
        System.out.println("Test case 2: Input = " + input2 + ", Output = " + result2);
        System.out.println("Expected: 1001, Actual: " + result2 + ", Pass: " + result2.equals("1001"));
    }
}