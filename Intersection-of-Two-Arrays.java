1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        List<Integer> num1 = new ArrayList<>();
4        List<Integer> num2 = new ArrayList<>();
5        for(int num: nums1){
6            num1.add(num);
7        }
8        for(int num: nums2){
9            num2.add(num);
10        }
11        List<Integer> res = new ArrayList<>();
12        for(int num: num1){
13            if(num2.contains(num) && !res.contains(num)){
14                res.add(num);
15            }
16        }
17        int[] ans = new int[res.size()];
18        for(int iter = 0; iter < res.size(); iter += 1){
19            ans[iter] = res.get(iter);
20        }
21        return ans;
22    }
23}