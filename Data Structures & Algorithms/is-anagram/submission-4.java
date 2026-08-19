// Repetition 3
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        for (int j = 0; j < t.length(); j++) {
            if (map.containsKey(t.charAt(j))) {
                int count = map.get(t.charAt(j)) - 1;
                map.put(t.charAt(j), count);
                if (count == -1) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
