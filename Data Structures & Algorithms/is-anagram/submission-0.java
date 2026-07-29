class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i),map.get(s.charAt(i)) + 1);
                } else {
                    map.put(s.charAt(i), 1);
                }
            }
        for (int k = 0; k < t.length(); k++) {
            if (map.containsKey(t.charAt(k))) {
                int newCount = map.get(t.charAt(k)) - 1;
                map.put(t.charAt(k),newCount);
                if (newCount == -1) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
