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
	
}
