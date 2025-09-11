import java.util.HashSet;
import java.util.Set;

public class lengthofsubstring {
        public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int i = 0, ans = 0;
        
        for (int j = 0; j < s.length(); j++) {
            while (set.contains(s.charAt(j))) {
                set.remove(s.charAt(i++));
            }
            set.add(s.charAt(j));
            ans = Math.max(ans, j - i + 1);
        }
        
        return ans;
    }
}
