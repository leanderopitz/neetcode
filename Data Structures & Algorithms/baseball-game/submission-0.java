class Solution {
    public int calPoints(String[] operations) {
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("+")) {
                int a = stack.pop();
                int b = stack.pop();
                int r = a + b;
                stack.push(b);
                stack.push(a);
                stack.push(r);
            }
            else if (operations[i].equals("C")) {
                stack.pop();
            }
            else if (operations[i].equals("D")) {
                int a = stack.pop();
                int r = a * 2;
                stack.push(a);
                stack.push(r);

            } else {
                stack.push(Integer.parseInt(operations[i]));
            }
            if (i == operations.length - 1) {
                while (!stack.isEmpty())
                    result += stack.pop();
                }
            }
        return result;
    }
}