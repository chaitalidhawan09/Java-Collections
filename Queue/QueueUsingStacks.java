package Queue;
import java.util.Stack;
public class QueueUsingStacks 
{

	public QueueUsingStacks()
	{


	}
	
	 static class MyQueue {
	        Stack<Integer> stack1 = new Stack<>();
	        Stack<Integer> stack2 = new Stack<>();

	        public void enqueue(int x) {
	            while (!stack1.isEmpty()) {
	                stack2.push(stack1.pop());
	            }
	            stack1.push(x);
	            while (!stack2.isEmpty()) {
	                stack1.push(stack2.pop());
	            }
	        }

	        public int dequeue() {
	            if (stack1.isEmpty()) {
	                throw new IllegalStateException("Queue is empty");
	            }
	            return stack1.pop();
	        }

	        public int peek() {
	            if (stack1.isEmpty()) {
	                throw new IllegalStateException("Queue is empty");
	            }
	            return stack1.peek();
	        }

	        public boolean isEmpty() {
	            return stack1.isEmpty();
	        }
	    }

	public static void main(String[] args) 
	{
		MyQueue queue = new MyQueue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Peek: " + queue.peek());

	}

}
