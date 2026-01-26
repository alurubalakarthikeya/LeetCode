class Solution {
    public int repeatedNTimes(int[] nums) {
        int[] freqArr = new int[10000];
        for(int i=0; i<nums.length; i++){
            freqArr[nums[i]]++;
        }
        int rep = 0;
        for(int j=0; j<freqArr.length; j++){
            if(freqArr[j]==nums.length/2){
                rep = j;
            }
        }
        return rep;
    }
}