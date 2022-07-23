package linkedlistimpl.singlelinkedlist;

public class Runner {

	public static void main(String[] args) {
		SingleLinkedList<String> sll = new SingleLinkedList<>();
		sll.createSingleLinkedList("Tobi");
		
		sll.insertInLinkedList("Akindele", 0);
		sll.insertInLinkedList("Zee", 1);
		
		System.out.println(sll);
	}

}
