class Solution {
    public static int reverse(int n){
        int rev = 0;
        int temp = n;
        while(temp!=0){
            int digit = temp%10;
            rev = rev*10+digit;
            temp /= 10;
        }
        return rev;
    }
    public int mirrorDistance(int n) {
        int rev = reverse(n);
        return Math.abs(n-rev);
    }
}