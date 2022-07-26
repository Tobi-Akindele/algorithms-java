package stackimpl;

import java.lang.reflect.Array;

public class Stack<T> {
	T[] arr;
	int topOfStack;

	@SuppressWarnings("unchecked")
	public Stack(Class<T> clazz, int size) {
		this.arr = (T[]) Array.newInstance(clazz, size);
		this.topOfStack = -1;

		System.out.println("Stack is created with size: " + arr.length);
	}

	public boolean isEmpty() {
		return topOfStack == -1;
	}

	public boolean isFull() {
		return this.topOfStack == arr.length - 1;
	}

	public T push(T value) {
		if (isFull()) {
			System.out.println("Stack is full");
			return null;
		}
		arr[topOfStack + 1] = value;
		topOfStack++;
		return value;
	}

	public T pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		}
		T topElement = arr[topOfStack];
		topOfStack--;
		return topElement;
	}

	public T peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		}
		return arr[topOfStack];
	}

	public void deleteStack() {
		this.arr = null;
		topOfStack = -1;
	}
	
	public int size() {
		return arr == null ? 0 : arr.length;
	}
}
