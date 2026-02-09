class Solution {
    public int findNumbers(int[] nums) {
        int evenCounter = 0;
        for(int iter = 0; iter < nums.length; iter += 1){
            int num = nums[iter];
            int counter = 0;
            while(num!=0){
                num = num / 10;
                counter += 1;
            }
            if(counter%2==0){
                evenCounter += 1;
            }
        }
        return evenCounter;
    }
}