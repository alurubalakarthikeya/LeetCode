class Solution {
    public int findKthLargest(int[] nums, int k) {
        /*int[] large = new int[nums.length];
        int ans = k;
        int prevMax = Integer.MAX_VALUE;
        int i = 0;
        while(k!=0){
            int largeElement = Integer.MIN_VALUE;
            for(int iter = 0; iter < nums.length; iter += 1){
                if(prevMax>nums[iter]&&nums[iter]>largeElement){
                    largeElement = nums[iter];
                }
            }
            int rep = 0;
            for (int iter = 0; iter < nums.length; iter += 1) {
                if (nums[iter] == largeElement) {
                    large[i] = largeElement;
                    rep += 1;
                    i += 1;
                }
            }
            prevMax = largeElement;
            k -= rep;
        }
        return large[ans-1];*/
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}