class Solution {
    public boolean isHappy(int n) {
        int counter = 0;
        while(n!=1){
            if(counter>n) return false;
            int sum = 0;
            while(n!=0){
                int num = n%10;
                n = n / 10;
                sum += num*num;
            }
            n = sum;
            counter += 1;
        }
        return true;
    }
}