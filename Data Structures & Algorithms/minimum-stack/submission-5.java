// push: 2 * val - min
// pop: 2 * min - val
// pop: if peek < min: min else: peek
class MinStack {
    long min;
    Stack<Long> stack;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        long value = val;
        if (stack.isEmpty()) {
            stack.push(value);
            min = value;
        } else {
            if (value < min) {
                long encoded = 2 * value - min;
                stack.push(encoded);
                min = value;
            } else {
                stack.push(value);
            }
        }
    }
    
    public void pop() {
        if (stack.isEmpty()) {
            return;
        } 
        long pop = stack.pop();
        if (pop < min) {
            min = 2 * min - pop;
        } 
    }
    
    public int top() {
        long peek = stack.peek();
        if (peek < min) {
            return (int) min;
        } else {
            return (int) peek;
        }
    }
    
    public int getMin() {
        return (int) min;
    }
}
