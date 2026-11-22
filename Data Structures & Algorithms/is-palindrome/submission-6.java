// Repetition 2
// StringBuilder
// Character.toLowerCase
// Character.isLetterOrDigit
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (Character.isLetterOrDigit(c)) {
                string.append(c);
            }
        }
        if (string.length() <= 1) {
            return true;
        }
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                return false;
            }
        }
        System.out.println(string);
        return true;
    }
}
