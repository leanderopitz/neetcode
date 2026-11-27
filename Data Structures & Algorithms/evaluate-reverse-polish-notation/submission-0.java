class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String s = tokens[i];
            int a = 0;
            int b = 0;
            if (s.equals("+")) {
                a = stack.pop();
                b = stack.pop();
                int r = b + a;
                stack.push(r);
            } else if (s.equals("-")) {
                a = stack.pop();
                b = stack.pop();
                int r = b - a;
                stack.push(r);
            } else if (s.equals("*")) {
                a = stack.pop();
                b = stack.pop();
                int r = b * a;
                stack.push(r);
            } else if (s.equals("/")) {
                a = stack.pop();
                b = stack.pop();
                int r = b / a;
                stack.push(r);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}
