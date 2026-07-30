class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder string = new StringBuilder();
        for (int x = 0; x < s.length(); x++) {
            char c = Character.toLowerCase(s.charAt(x));
            if (Character.isLetterOrDigit(c)) {
                string.append(c);
            }
        }
        if (string.length() == 0 || string.length() == 1) {
                return true;
            }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < (string.length() / 2); i ++) {
            stack.push(string.charAt(i));
        }
        if ((string.length() % 2) == 0) {
            for (int k = (string.length() / 2); k < string.length(); k++) {
                if (stack.peek() == string.charAt(k)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        } else {
            for (int j = (string.length() / 2) + 1; j < string.length(); j++) {
                if (stack.peek() == string.charAt(j)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return true;
    } 
}