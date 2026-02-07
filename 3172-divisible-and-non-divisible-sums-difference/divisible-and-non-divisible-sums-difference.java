class Solution {
    public int differenceOfSums(int n, int m) {
        int num1 = 0;
        int num2 = 0;
        for(int iter = 1; iter <= n; iter += 1){
            if(iter%m==0){
                num2 += iter;
            } else {
                num1 += iter;
            }
        }
        return num1-num2;
    }
}