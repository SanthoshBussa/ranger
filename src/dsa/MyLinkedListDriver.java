package dsa;
public class MyLinkedListDriver {
	public static void main(String[] args) {
		DoublyLinkedList<Integer> l1 = new DoublyLinkedList<>();
		
		l1.add(21);
		l1.add(22);
		l1.add(23);
		l1.add(24);
		l1.add(25);
		
		
		System.out.println(l1);
		l1.printReverse();
		
		
	}
}
