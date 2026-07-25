class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        int len1 = s.length();
        int len2 = t.length();
        if(len1==len2){
            for(int i = 0; i < len1; i++){
                if(map.containsKey(s.charAt(i))){
                    if(map.get(s.charAt(i))!=t.charAt(i)){
                        return false;
                    }
                } else {
                    if (map.containsValue(t.charAt(i))) {
                        return false;
                    }
                    map.put(s.charAt(i), t.charAt(i));
                }
            }
        }
        return true;
    }
}