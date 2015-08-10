/*Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
*/
    
    class MinStack {
    LinkedList<Integer> stack=new LinkedList<Integer>();
    LinkedList<Integer> minstack=new LinkedList<Integer>();
    int min=Integer.MAX_VALUE;
    public void push(int x) {
        stack.push(x);
        if(minstack.isEmpty()||x<minstack.peek())
        minstack.push(x); 
        else 
        minstack.push(minstack.peek());
        
    }

    public void pop() {
        stack.pop();
        minstack.pop();
        
    }

    public int top() {
       return stack.peek();
    }

    public int getMin() {
       return minstack.peek();
    }
}
