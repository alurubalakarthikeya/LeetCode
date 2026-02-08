class Solution {
    public int findMin(int[] nums) {
        int min = nums[0];
        for(int iter = 0; iter < nums.length - 1; iter += 1){
            if(nums[iter]>nums[iter+1]){
                min = nums[iter+1];
            }
        }
        return min;
    }
}