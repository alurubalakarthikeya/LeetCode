class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        int n1 = 0, n2 = 1;
        for(int iter = 2; iter <= n; iter += 1){
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
        return n2;
    }
}