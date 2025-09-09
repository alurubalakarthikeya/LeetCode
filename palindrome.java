public class palindrome {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        int x1 = 121;
        int x2 = -121;
        int x3 = 10;

        System.out.println(x1 + " -> " + solution.isPalindrome(x1)); // true
        System.out.println(x2 + " -> " + solution.isPalindrome(x2)); // false
        System.out.println(x3 + " -> " + solution.isPalindrome(x3)); // false
    }
}

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            if (reversed > Integer.MAX_VALUE / 10) return false;

            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }
}
