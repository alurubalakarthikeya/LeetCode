class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len*2];
        for(int iter = 0; iter < len; iter += 1){
            ans[iter] = nums[iter];
            ans[iter+len] = nums[iter];
        }
        return ans;
    }
}