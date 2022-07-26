package stackimpl;

import linkedlistimpl.singlelinkedlist.SingleLinkedList;

public class StackWithLinkedList<T> {
	
	SingleLinkedList<T> singleLinkedList;

	public StackWithLinkedList() {
		this.singleLinkedList = new SingleLinkedList<>();
	}
	
	public T push(T value) {
		singleLinkedList.insertInLinkedList(value, 0);
		return value;
	}
	
	public boolean isEmpty() {
		return singleLinkedList.getHead() == null;
	}
	
	public T pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		}
		T topElement = singleLinkedList.getHead().getValue();
		singleLinkedList.deleteNode(0);
		return topElement;
	}
	
	public T peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		}
		return singleLinkedList.getHead().getValue();
	}
	
	public void deleteStack() {
		singleLinkedList.setHead(null);
	}
}
