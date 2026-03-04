class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] ans = new int[friends.length];
        int ctr = 0;
        for(int iter = 0; iter < order.length; iter += 1){
            for(int check = 0; check < friends.length; check += 1){
                if(order[iter] == friends[check]){
                    ans[ctr] = friends[check];
                    ctr += 1;
                }
            }
        }
        return ans;
    }
}