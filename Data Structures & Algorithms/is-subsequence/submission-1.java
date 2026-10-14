class Solution {
    public boolean isSubsequence(String s, String t) {
        int s_counter = 0;
        int t_counter = 0;
        if (s.length() == 0) {
            return true;
        }
        while (t_counter != t.length()) {
            if (t.charAt(t_counter) != s.charAt(s_counter)) {
                t_counter++;
            } else if (t.charAt(t_counter) == s.charAt(s_counter)) {
                s_counter++;
                t_counter++;
                if (s_counter == s.length()) {
                    return true;
                }
            }
        }
        return false;
    }
}