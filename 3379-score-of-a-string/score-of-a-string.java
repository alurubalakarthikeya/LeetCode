class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        for(int iter = 0; iter < s.length()-1; iter += 1){
            sum += Math.abs(s.charAt(iter)-s.charAt(iter+1));
        }
        return sum;
    }
}