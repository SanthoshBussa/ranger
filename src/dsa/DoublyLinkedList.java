package dsa;
import java.util.StringJoiner;
public class DoublyLinkedList<T> {
	
	private Node head;
	private Node tail;
	private int size;
	
	public DoublyLinkedList() {}
	
	private class Node{
		T data;
		Node prev;
		Node next;
		public Node(T e) {
			data = e;
		}
		public String toString() {
			return data.toString();
		}
	}
	
	public void add(T ele) {
		Node newNode = new Node(ele);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		size++;
	}
	
	public String toString() {
		StringJoiner sj = new StringJoiner("," , "[" , "]");
		Node temp = head;
		while(temp!=null) {
			sj.add(temp.data.toString());
			temp = temp.next;
		}
		return sj.toString();		
	}
	
	public void printReverse() {
		StringJoiner res = new StringJoiner(",", "[", "]");
		Node temp = tail;
		while(temp!=null) {
			res.add(temp.data.toString());
			temp = temp.prev;
		}
		System.out.println(res.toString());
	}
}

















