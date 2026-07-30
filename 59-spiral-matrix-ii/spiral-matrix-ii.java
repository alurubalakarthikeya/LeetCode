class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int num = 1;
        int left = 0, right = n - 1;
        int top = 0, bottom = n - 1;
        while(left <= right){
            //adding in top row
            for(int c = left; c < right + 1; c++){
                res[top][c] = num;
                num += 1;
            }
            top += 1;
            //adding in right col
            for(int r = top; r < bottom + 1; r++){
                res[r][right] = num;
                num += 1;
            }
            right -= 1;
            //adding in bottom row
            for(int c = right; c > left - 1; c--){
                res[bottom][c] = num;
                num += 1;
            }
            bottom -= 1;
            //adding in left col
            for(int r = bottom; r > top - 1; r--){
                res[r][left] = num;
                num += 1;
            }
            left += 1;
        }
        return res;
    }
}