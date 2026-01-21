class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> num1 = new ArrayList<>();
        List<Integer> num2 = new ArrayList<>();
        for(int num: nums1){
            num1.add(num);
        }
        for(int num: nums2){
            num2.add(num);
        }
        List<Integer> res = new ArrayList<>();
        for(int num: num1){
            if(num2.contains(num) && !res.contains(num)){
                res.add(num);
            }
        }
        int[] ans = new int[res.size()];
        for(int iter = 0; iter < res.size(); iter += 1){
            ans[iter] = res.get(iter);
        }
        return ans;
    }
}