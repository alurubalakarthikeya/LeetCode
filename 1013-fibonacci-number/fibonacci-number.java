class Solution {
    public static int recursiveSolution(int n){
        if(n<=1) return n;
        return recursiveSolution(n-1)+recursiveSolution(n-2);
    }
    public int fib(int n) {
        return recursiveSolution(n);
    }
}