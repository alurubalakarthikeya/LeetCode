1class Solution {
2    public static void swap(int[] nums, int moveRight, int moveLeft){            
3        int temp = nums[moveRight];
4        nums[moveRight] = nums[moveLeft];
5        nums[moveLeft] = temp;
6    }
7    public void sortColors(int[] nums) {
8        int low = 0, mid = 0, high = nums.length - 1;
9        while (mid <= high) {
10            if (nums[mid] == 0) {
11                swap(nums, low, mid);
12                low++;
13                mid++;
14            } 
15            else if (nums[mid] == 1) {
16                mid++;
17            } 
18            else {
19                swap(nums, mid, high);
20                high--;
21            }
22        }
23    }
24}