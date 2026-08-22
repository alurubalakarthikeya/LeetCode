class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int prod = 1;
        int tem = n;
        while(n!=0){
            int temp = n%10;
            sum += temp;
            prod *= temp;
            n /= 10;
        }
        if(tem % (sum+prod)==0){
            return true;
        }
        return false;
    }
}