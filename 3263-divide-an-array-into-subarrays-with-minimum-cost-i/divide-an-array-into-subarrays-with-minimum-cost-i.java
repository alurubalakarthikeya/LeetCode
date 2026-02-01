class Solution {
    public int minimumCost(int[] nums) {
        int costOne = nums[0];
        int minOne = Integer.MAX_VALUE;
        int minTwo = Integer.MAX_VALUE;
        for(int i = 1; i < nums.length; i += 1){
            if(nums[i]<minOne){
                minTwo = minOne;
                minOne = nums[i];
            } else if(nums[i]<minTwo){
                minTwo = nums[i];
            }
        }
        return costOne+minOne+minTwo;
    }
}