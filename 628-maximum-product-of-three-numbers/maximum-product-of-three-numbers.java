class Solution {
    public int maximumProduct(int[] nums) {
        int one = Integer.MIN_VALUE;
        int two = Integer.MIN_VALUE;
        int three = Integer.MIN_VALUE;
        int neg1 = Integer.MAX_VALUE;
        int neg2 = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > one){
                three = two;
                two = one;
                one = nums[i];
            } else if(nums[i] > two){
                three = two;
                two = nums[i];
            } else if(nums[i] > three){
                three = nums[i];
            }
            if(nums[i] < neg1){
                neg2 = neg1;
                neg1 = nums[i];
            } else if(nums[i] < neg2){
                neg2 = nums[i];
            }

        }
        return Math.max(one*two*three, one*neg1*neg2);
    }
}