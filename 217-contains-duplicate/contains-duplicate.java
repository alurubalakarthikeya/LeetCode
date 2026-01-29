class Solution {
    public boolean containsDuplicate(int[] nums) {
       /* Arrays.sort(nums);
        for(int iter = 0; iter < nums.length-1; iter += 1){
            if(nums[iter]==nums[iter+1]){
                return true;
            }
        } //Bad complexity
        return false;
        Set<Integer> seen = new HashSet<>();
        for(int iter = 0; iter < nums.length; iter += 1){
            if(!seen.contains(nums[iter])){
                seen.add(nums[iter]);
            }else{
                return true;
            }
        }
        return false;
        Set<Integer> seen = new HashSet<>();
        int left = 0, right = nums.length-1;
        while(left<right){
            if(!seen.contains(nums[left])){
                seen.add(nums[left]);
            }else {
                return true;
            }
            if(!seen.contains(nums[right])){
                seen.add(nums[right]);
            }else {
                return true;
            }
            left += 1;
            right -= 1;
        }
        if(nums.length%2!=0){
            if(seen.contains(nums[left])){
                return true;
            }
        }
        return false;
           */
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) return true;
        }
        return false;
    }
}