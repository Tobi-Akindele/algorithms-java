package queue;

import java.lang.reflect.Array;

public class QueueWithArray<T> {
	T[] arr;
	int beginningOfQueue;
	int topOfQueue;

	@SuppressWarnings("unchecked")
	public QueueWithArray(Class<T> type, int size) {
		this.arr = (T[]) Array.newInstance(type, size);
		this.beginningOfQueue = -1;
		this.topOfQueue = -1;
		System.out.println("Queue created with size: " + size);
	}
	
	public boolean isFull() {
		return topOfQueue == arr.length - 1;
	}
	
	public boolean isEmpty() {
		return beginningOfQueue == -1 || beginningOfQueue == arr.length;
	}
	
	public T enqueue(T value) {
		if(isFull()) {
			System.out.println("Queue is full");
			return null;
		}
		if(isEmpty()) {
			beginningOfQueue = 0;
			topOfQueue++;
			arr[topOfQueue] = value;
		} else {
			topOfQueue++;
			arr[topOfQueue] = value;
		}
		System.out.println("value added: " + value);
		return value;
	}
	
	public T dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return null;
		} else {
			T result = arr[beginningOfQueue];
			beginningOfQueue++;
			if(beginningOfQueue > topOfQueue) {
				beginningOfQueue = -1;
				topOfQueue = -1;
			}
			return result;
		}
	}
	
	public T peek() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return null;
		} else {
			return arr[beginningOfQueue];
		}
	}
	
	public void delete() {
		arr = null;
		System.out.println("Queue deleted!");
	}
}
