class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] pair = new int[2];
        int[] freq = new int[101];
        int ind = 0;
        for(int i = 0; i < nums.length; i++){
            freq[nums[i]]++;
            if (freq[nums[i]] == 2) {
                pair[ind++] = nums[i];
            }
        }
        return pair;
    }
}