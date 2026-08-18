class MinStack {
    Stack<Integer> st ;
    Stack<Integer> min ;

    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int value) {
        
        if(st.isEmpty()||min.peek()>=value){
            min.push(value);
        }
        st.push(value);
    }
    
    public void pop() {
        if(st.isEmpty()){
            return;
        }
        if(min.peek().equals(st.peek())){
            min.pop();
        }
        st.pop();
    }
    
    public int top() {
        if(st.isEmpty()){
            return -1;
        }
        return st.peek();
    }
    
    public int getMin() {
        if(min.isEmpty()){
            return -1;
        }
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */