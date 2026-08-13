/*
Repetition 1
Push:
encoded: val - min
encoded < 0: min = val
first value: encoded = 0 & min = val

Pop:
encoded < 0: min = min - encoded
encoded => 0: top = min 

Top:
encoded > 0: top = min + encoded
encoded <= : min = min
*/

class MinStack {
    long min;
    Stack<Long> stack;
    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(0L);
            min = val;
        } else {
            stack.push(val - min);
            if (val < min) {
                min = val;
            }
        }
    }
    
    public void pop() {
        if (stack.isEmpty()) {
            return;
        }
        long pop = stack.pop();
        if (pop < 0) {
            min = min - pop;
        }
    }
    
    public int top() {
        long top = stack.peek();
        if (top > 0) {
            return (int) (top + min);
        } else {
            return (int) min;
        }
    }
    
    public int getMin() {
        return (int) min;
    }
}
