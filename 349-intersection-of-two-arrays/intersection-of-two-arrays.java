class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for(int iter = 0;  iter < nums1.length; iter += 1){
            for(int check = 0; check < nums2.length; check += 1){
                if(nums1[iter]==nums2[check]&&!list.contains(nums2[check])){
                    list.add(nums1[iter]);
                }
            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}