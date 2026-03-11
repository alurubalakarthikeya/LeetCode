class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int iter = 0; iter < nums.length; iter += 1){
            ans[iter] = nums[nums[iter]];
        }
        return ans;
    }
}