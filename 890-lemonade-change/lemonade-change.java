class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveCount = 0;
        int tenCount = 0;
        int twentyCount = 0;
        for(int i = 0; i < bills.length; i++){
            if(bills[i] == 5){
                fiveCount += 1;
            } else if(bills[i] == 10){
                tenCount += 1;
                if(fiveCount > 0){
                    fiveCount -= 1;
                } else {
                    return false;
                }
            } else {
                twentyCount += 1;
                if (tenCount > 0 && fiveCount > 0) {
                    tenCount--;
                    fiveCount--;
                } else if (fiveCount >= 3) {
                    fiveCount -= 3;
                } else {
                        return false;
                }
            }
        }
        return true;
    }
}