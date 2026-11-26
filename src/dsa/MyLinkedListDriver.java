package dsa;
public class MyLinkedListDriver {
	public static void main(String[] args) {
		SinglyLinkedList<Integer> l1 = new SinglyLinkedList<>();
		
		l1.add(21);
		l1.add(22);
		l1.add(23);
		l1.add(24);
		l1.add(25);
		
		l1.remove(22);
		
		System.out.println(l1);
		
		
	}
}
