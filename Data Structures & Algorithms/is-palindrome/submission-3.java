class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder string = new StringBuilder();
        for (int x = 0; x < s.length(); x++) {
            char c = Character.toLowerCase(s.charAt(x));
            if (Character.isLetterOrDigit(c)) {
                string.append(c);
            }
        }
        if (string.length() <= 1) {
                return true;
            }
        for (int i = 0; i < (string.length() / 2); i++) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}