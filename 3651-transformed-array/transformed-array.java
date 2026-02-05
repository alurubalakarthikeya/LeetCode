class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int size = nums.length;
        int[] res = new int[size];
        for (int iter = 0; iter < size; iter++) {
            int num = nums[iter];
            int idx = iter;  
            if (num > 0) {
                while (num != 0) {
                    idx++;
                    if (idx >= size) {
                        idx = 0;
                    }
                    num--;
            }
            } else {
                while (num != 0) {
                    idx--;
                    if (idx < 0) {
                        idx = size - 1;
                    }
                    num++;
                }
            }
            res[iter] = nums[idx]; 
        }
        return res;
    }
}
