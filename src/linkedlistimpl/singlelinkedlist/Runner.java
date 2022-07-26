package linkedlistimpl.singlelinkedlist;

public class Runner {

	public static void main(String[] args) {
		SingleLinkedList<String> sll = new SingleLinkedList<>();
		sll.createSingleLinkedList("A");
		
		sll.insertInLinkedList("B", 1);
		sll.insertInLinkedList("C", 2);
		sll.insertInLinkedList("D", 3);
		sll.insertInLinkedList("E", 4);
		sll.insertInLinkedList("F", 5);
		
		sll.traverseSingleLinkedList();
		
//		sll.deleteNode(3);
		sll.deleteSingleLinkedList();
		
		sll.traverseSingleLinkedList();
		
		
//		System.out.println(sll.searchSingleLinkedList("D"));
	}

}
