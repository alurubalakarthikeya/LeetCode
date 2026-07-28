class Solution {
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i+=2){
            swap(nums, i , i+1);
        }
        return nums;
    }
}