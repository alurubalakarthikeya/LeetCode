class Solution {
    public int[] runningSum(int[] nums) {
        int size = nums.length;
        int[] runningSum = new int[size];
        int sum = 0;
        for(int i = 0; i < size; i++){
            sum += nums[i];
            runningSum[i] = sum;
        }
        return runningSum;
    }
}