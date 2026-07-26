class Solution {
    public int[] concatWithReverse(int[] nums) {
        int size = nums.length;
        int[] newarr = new int[2*size];
        for(int i = 0; i < size; i++){
            newarr[i] = nums[i];
        }
        int ind = size-1;
        for(int i = size; i < 2*size; i++){
            newarr[i] = nums[ind];
            ind--;
        }
        return newarr;
    }
}