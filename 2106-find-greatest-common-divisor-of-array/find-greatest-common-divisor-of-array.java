class Solution {
    public static int GCD(int a, int b){
        if(b==0){
            return a;
        }
        return GCD(b, a%b);
    }
    public int findGCD(int[] nums) {
        int least = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            } 
            if(nums[i] < least){
                least = nums[i];
            }
        }
        return GCD(least, max);
    }
}