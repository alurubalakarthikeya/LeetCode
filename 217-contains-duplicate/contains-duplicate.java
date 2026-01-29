class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int iter = 0; iter < nums.length-1; iter += 1){
            if(nums[iter]==nums[iter+1]){
                return true;
            }
        }
        return false;
    }
}