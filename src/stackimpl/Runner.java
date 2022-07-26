package stackimpl;

public class Runner {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>(Integer.class, 4);
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		System.out.println("Empty? " + stack.isEmpty());
		System.out.println("Full? " + stack.isFull());
		
		System.out.println("peek: " + stack.peek());
		System.out.println("Size: " + stack.size());
		while(!stack.isEmpty()) {
			System.out.println("Element: " + stack.pop());
		}
		
		stack.deleteStack();
		System.out.println("Size: " + stack.size());
	}

	
}
