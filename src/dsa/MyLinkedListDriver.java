package dsa;
public class MyLinkedListDriver {
	public static void main(String[] args) {
		DoublyLinkedList<Integer> l1 = new DoublyLinkedList<>();
		
		l1.add(21);
		l1.add(22);
		l1.add(23);
		l1.add(34);
		l1.add(35);
		l1.add(36);
		
		
		l1.removeFirst();
		
		System.out.println(l1);
		
	}
}
