class Solution {
    public int maxProduct(int n) {
        int prod = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while(n!=0){
            int temp = n%10;
            arr.add(temp);
            n = n/10;
        }
        for(int i = 0; i < arr.size(); i++){
            for(int j = i+1; j < arr.size(); j++){
                prod = Math.max(prod, arr.get(i) * arr.get(j));
            }
        }
        return prod;
    }
}