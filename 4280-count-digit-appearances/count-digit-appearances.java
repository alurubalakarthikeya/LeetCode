class Solution {
    public static int countDigit(int num, int digit){
        int count = 0;
        while(num!=0){
            int temp = num%10;
            if(temp==digit){
                count++;
            }
            num /= 10;
        }
        return count;
    }
    public int countDigitOccurrences(int[] nums, int digit) {
        int counter = 0;
        for(int i = 0; i < nums.length; i++){
            counter += countDigit(nums[i], digit);
        }
        return counter;
    }
}