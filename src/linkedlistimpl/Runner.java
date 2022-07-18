package linkedlistimpl;

import linkedlistimpl.singlelinkedlist.SingleLinkedList;

public class Runner {

	public static void main(String[] args) {
		SingleLinkedList<String> sll = new SingleLinkedList<>();
		sll.createSingleLinkedList("Tobi");
		System.out.println("value: " + sll.getHead().getValue());
		System.out.println("next: " + sll.getHead().getNext());
	}

}
