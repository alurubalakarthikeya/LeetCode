class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        if(nums.length<2){
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0, j = k - 1; i < nums.length && j < nums.length; i++, j++){
            if(nums[j]-nums[i]<min){
                min = nums[j]-nums[i];
            }
        }
        return min;
    }
}