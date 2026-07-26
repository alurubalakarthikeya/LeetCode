class Solution {
    public static int GCD(int odd, int eve){
        if(eve==0){
            return odd;
        }
        return GCD(eve, odd%eve);
    }
    public int gcdOfOddEvenSums(int n) {
        int oddSum = n*n;
        int evenSum = n*(n+1);
        return GCD(oddSum, evenSum);
    }
}