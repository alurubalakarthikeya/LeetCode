class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length == 2) return true;
        int index = 0;
        while(index < nums.length - 1 && nums[index]==nums[index+1]){
            index += 1;
        }
        if(index == nums.length - 1) return true;
        if(nums[index]>nums[index+1]){
            for(int iter = index; iter < nums.length - 1; iter += 1){
                if(nums[iter]>=nums[iter+1]){
                    continue;
                } else {
                    return false;
                }
            }
        }else {
            for(int iter = index; iter < nums.length - 1; iter += 1){
                if(nums[iter]<=nums[iter+1]){
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}