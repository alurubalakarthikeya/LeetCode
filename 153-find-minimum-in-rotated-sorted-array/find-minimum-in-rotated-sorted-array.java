class Solution {
    public int findMin(int[] nums) {
        /*int min = nums[0];
        for(int iter = 0; iter < nums.length - 1; iter += 1){
            if(nums[iter]>nums[iter+1]){
                min = nums[iter+1];
            }
        } //brute force
        return min;*/
        int low = 0;
        int high = nums.length -1;
        while (low < high){
            int mid = low + (high - low) / 2;
            if(nums[mid]>nums[high]){
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }
}