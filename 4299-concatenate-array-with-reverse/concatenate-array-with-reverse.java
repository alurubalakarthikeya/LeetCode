class Solution {
    public int[] concatWithReverse(int[] nums) {
        int size = nums.length;
        int[] num = new int[2*size];
        for(int i = 0; i < size; i++){
            num[i] = nums[i];
            num[num.length-i-1] = nums[i];
        }
        return num;
    }
}