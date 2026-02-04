class Solution {
    public int climbStairs(int n) {
        long f = Math.round(
    (Math.pow((1 + Math.sqrt(5)) / 2, n + 1)
   - Math.pow((1 - Math.sqrt(5)) / 2, n + 1))
   / Math.sqrt(5)
);
     return (int)f;
    }
}