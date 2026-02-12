class Solution {
    public int minOperations(int[] nums, int k) {
        int operations = 0;
        int sum = 0;
        for(int iter = 0; iter < nums.length; iter += 1){
            sum += nums[iter];
        }
        int mod = sum % k;
        int newReq = sum - mod;
        operations = sum - newReq;
        return operations;
    }
}