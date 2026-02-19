class Solution {
    public int numIdenticalPairs(int[] nums) {
        int counter = 0;
        for(int i = 0; i < nums.length; i += 1){
            for(int j = i + 1; j < nums.length; j += 1){
                if(nums[i]==nums[j]){
                    counter += 1;
                }
            }   
        }
        return counter;
    }
}