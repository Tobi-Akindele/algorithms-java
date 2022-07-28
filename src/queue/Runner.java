package queue;

public class Runner {

	public static void main(String[] args) {
		QueueWithArray<Integer> qwa = new QueueWithArray<>(Integer.class, 2);
		qwa.enqueue(1);
		qwa.enqueue(2);
		qwa.enqueue(3);
		
//		System.out.println(qwa.isFull());
//		
//		System.out.println(qwa.isEmpty());
		
		System.out.println(qwa.dequeue());
		System.out.println(qwa.peek());
		qwa.delete();
	}

}
