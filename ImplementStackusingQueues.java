/* 
Implement the following operations of a stack using queues.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
empty() -- Return whether the stack is empty. 
*/


class MyStack {
    Queue<Integer> queue1=new ArrayDeque<Integer>();
    Queue<Integer> queue2=new ArrayDeque<Integer>();

    // Push element x onto stack.
    public void push(int x) {
        queue1.offer(x);
        
    }

    // Removes the element on top of the stack.
    public void pop() {
        while(queue1.size()>1)
           queue2.offer(queue1.poll());
        queue1.poll();   
       while(queue2.size()>0)
           queue1.offer(queue2.poll()); 
    }

    // Get the top element.
    public int top() {
      while(queue1.size()>1)
           queue2.offer(queue1.poll());
       int result=queue1.poll();
       queue2.offer(result);
       while(queue2.size()>0)
           queue1.offer(queue2.poll()); 
        return result;  
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue1.isEmpty();
    }
}