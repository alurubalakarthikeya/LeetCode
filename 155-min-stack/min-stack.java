class MinStack {
    int len = 100000;
    int[] newStack = new int[len];
    int top = -1;
    int minVal = Integer.MAX_VALUE;

    public void push(int val) {
        if (val <= minVal) {
            newStack[++top] = minVal; 
            minVal = val;
        }
        newStack[++top] = val;
    }

    public void pop() {
        int removed = newStack[top--];
        if (removed == minVal) {
            minVal = newStack[top--]; 
        }
    }
    
    public int top() {
        return newStack[top];
    }
    
    public int getMin() {
        return minVal;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */