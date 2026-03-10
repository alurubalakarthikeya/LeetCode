class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n = piles.length;
        int left = 0;
        int right = n - 1;
        int coins = 0;
        while (left < right) {
            right--;               
            coins += piles[right]; 
            right--;
            left++;                 
        }
        return coins;
    }
}