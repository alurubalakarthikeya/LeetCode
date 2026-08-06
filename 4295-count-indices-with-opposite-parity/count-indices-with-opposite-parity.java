class Solution {
    public int[] countOppositeParity(int[] nums) {
        int even = 0, odd = 0;
        for (int num : nums) {
            if (num % 2 == 0)
                even++;
            else
                odd++;
        }
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0)
                even--;
            else
                odd--;

            if (nums[i] % 2 == 0)
                ans[i] = odd;
            else
                ans[i] = even;
        }
        return ans;
    }
}