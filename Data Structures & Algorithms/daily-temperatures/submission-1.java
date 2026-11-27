class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            if (stack.isEmpty()) {
                stack.push(i);
            } else if (temperatures[i] > temperatures[stack.peek()]) {
                while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                    int index = stack.pop();
                    result[index] = i - index;
                }
                stack.push(i);
            } else {
                stack.push(i);
            }
        }
        return result;
    }
}
