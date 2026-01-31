class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < letters.length; i += 1){
            int diff = letters[i]-target;
            if(diff<min && diff > 0){
                return (char)(diff+target);
            }
        }
        return letters[0];
    }
}