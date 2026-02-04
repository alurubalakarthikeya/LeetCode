class Solution {
    public int climbStairs(int n) {
        int f = (int)(Math.round(
    (Math.pow((1 + Math.sqrt(5)) / 2, n + 1)
   - Math.pow((1 - Math.sqrt(5)) / 2, n + 1))
   / Math.sqrt(5)
));
     return f;
    }
}