class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length-1; i += 1){
            if(arr[i+1]-arr[i]<minDiff){
                minDiff = arr[i+1]-arr[i];
            }
        }
        for(int i = 0; i < arr.length-1; i += 1){
            if(arr[i+1]-arr[i]==minDiff){
                list.add(List.of(arr[i], arr[i+1]));
            }
        }
        return list;
    }
}