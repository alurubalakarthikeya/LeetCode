class Solution {
    public int maxProfit(int[] prices) {
        int low = Integer.MAX_VALUE;
        int high = 0;
        for(int i = 0; i < prices.length; i += 1){
            if(prices[i]<low){
                low = prices[i];
            } else{
                if(high<prices[i]-low){
                    high = prices[i]-low;
                }
            }
        }
        return high;
    }
}