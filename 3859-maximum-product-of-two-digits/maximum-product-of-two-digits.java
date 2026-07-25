class Solution {
    public int maxProduct(int n) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        while(n!=0){
            int temp = n%10;
            if(temp > first){
                second = first;
                first = temp;
            } else if(temp > second){
                second = temp;
            }
            n = n/10;
        }
        return first*second;
    }
}