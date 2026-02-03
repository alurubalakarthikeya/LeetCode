class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if(n < 4) return false;
        int i = 0;
        while(i+1<n && nums[i]<nums[i+1]){
            i += 1;
        }
        if(i==0) return false;
        int down = i;
        while(i+1<n && nums[i]>nums[i+1]){
            i += 1;
        }
        if(i==down) return false;
        int up = i;
        while(i+1<n && nums[i]<nums[i+1]){
            i += 1;
        }
        if(i==up) return false;

        return i == n-1;
    }
}