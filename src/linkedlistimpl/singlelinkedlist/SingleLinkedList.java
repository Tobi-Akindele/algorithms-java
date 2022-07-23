package linkedlistimpl.singlelinkedlist;

public class SingleLinkedList<T> {

	private Node<T> head;
	private Node<T> tail;
	private int size;

	public Node<T> createSingleLinkedList(T nodeValue) {
		Node<T> node = new Node<>();
		node.setValue(nodeValue);
		head = node;
		tail = node;
		size = 1;

		return head;
	}

	public void insertInLinkedList(T value, int location) {

		Node<T> newNode = new Node<>();
		newNode.setValue(value);

		if (head == null) {
			createSingleLinkedList(value);
		} else if (location == 0) { // Insert at the beginning of the linkedList
			newNode.setNext(head);
			head = newNode;
		} else if (location >= size) { // Then just insert at the end of the linkedList
			tail.setNext(newNode);
			tail = newNode;
		} else { // Then insert at the appropriate location
			Node<T> tmpNode = head;
			int idx = 0;
			while (idx < location - 1) {
				tmpNode = tmpNode.getNext();
				idx++;
			}
			newNode.setNext(tmpNode.getNext());
			tmpNode.setNext(newNode);
		}
		size++;
	}

	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}

	public Node<T> getTail() {
		return tail;
	}

	public void setTail(Node<T> tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "SingleLinkedList [head=" + head + ", tail=" + tail + ", size=" + size + "]";
	}
}
