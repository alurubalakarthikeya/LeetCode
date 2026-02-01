class Solution {
    public int removeDuplicates(int[] nums) {
        int one = 0;
        int two = 0;
        while( two < nums.length){
            if(nums[one] == nums[two]){
                two += 1;
            } else {
                nums[one + 1] = nums[two];
                one += 1;
            }
        }
        return one+1;
    }
}
