class Solution {
    public int[] transformArray(int[] nums) {
        int[] res = new int[nums.length];
        int eve = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]%2==0){
                eve += 1;
            }
        }
        for(int i = 0; i < res.length; i++){
            if(eve > 0){
                res[i] = 0;
                eve -= 1;
            } else {
                res[i] = 1;
            }
        }
        return res;
    }
}