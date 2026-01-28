class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        for (int iter = 0; iter < s.length(); iter++) {
            Set<Character> seen = new HashSet<>();
            int wordIter = iter;
            while (wordIter < s.length() && !seen.contains(s.charAt(wordIter))) {
                seen.add(s.charAt(wordIter));
                wordIter++;
            }
            max = Math.max(max, seen.size());
        }
        return max;
    }
}
