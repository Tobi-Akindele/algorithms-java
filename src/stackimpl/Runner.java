package stackimpl;

public class Runner {

	public static void main(String[] args) {
//		StackWithArray<Integer> stack = new StackWithArray<>(Integer.class, 4);
//		
//		stack.push(1);
//		stack.push(2);
//		stack.push(3);
//		stack.push(4);
//		
//		System.out.println("Empty? " + stack.isEmpty());
//		System.out.println("Full? " + stack.isFull());
//		
//		System.out.println("peek: " + stack.peek());
//		System.out.println("Size: " + stack.size());
//		while(!stack.isEmpty()) {
//			System.out.println("Element: " + stack.pop());
//		}
//		
//		stack.deleteStack();
//		System.out.println("Size: " + stack.size());
		
		StackWithLinkedList<Integer> swll = new StackWithLinkedList<>();
		swll.push(1);
		swll.push(2);
		
		System.out.println(swll.isEmpty());
		
		System.out.println(swll.pop());
		System.out.println(swll.peek());
		System.out.println(swll.pop());
		
		swll.deleteStack();
		System.out.println(swll.isEmpty());
	}

	
}
