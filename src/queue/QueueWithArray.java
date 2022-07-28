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
}
