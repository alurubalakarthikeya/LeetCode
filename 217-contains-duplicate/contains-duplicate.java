class Solution {
    public boolean containsDuplicate(int[] nums) {
       /* Arrays.sort(nums);
        for(int iter = 0; iter < nums.length-1; iter += 1){
            if(nums[iter]==nums[iter+1]){
                return true;
            }
        } //Bad complexity
        return false;
        */
        Set<Integer> seen = new HashSet<>();
        for(int iter = 0; iter < nums.length; iter += 1){
            if(!seen.contains(nums[iter])){
                seen.add(nums[iter]);
            }else{
                return true;
            }
        }
        return false;
    }
}