package dsa;
import java.util.StringJoiner;
public class SinglyLinkedList<T> {
	
	private Node head;
	private Node tail;
	private int size;
	
	private class Node{
		T data;
		Node next;
		public Node(T e) {
			data = e;
		}
		public String toString() {
			return data.toString();
		}
	}
	
	public SinglyLinkedList() {}
	
	public String toString() {
		StringJoiner sj = new StringJoiner("," , "[" , "]");
		Node temp = head;
		while(temp!=null) {
			sj.add(temp.data.toString());
			temp = temp.next;
		}
		return sj.toString();		
	}
	
	public void add(T ele) {
		Node newNode = new Node(ele);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}
	
	public void addFirst(T ele) {
		Node newNode = new Node(ele);
		newNode.next = head; 
		head = newNode;
		size++;
	}
	
	public void addLast(T ele) {
		add(ele);
	}
	
	public void addAll(SinglyLinkedList<T> sl) {
		this.tail.next = sl.head;
		this.tail = sl.tail;
		this.size += sl.size;
	}
	
	public int size() {
		return size;
	}
	
	public void remove(T ele) {
		if(ele.equals(head.data)) {
			head = head.next;
		}else {
			Node temp = head;
			while(temp.next!=null) {
				if(temp.next.data.equals(ele)) {
					temp.next = temp.next.next;
				}
				temp = temp.next;
			}
		}
		size--;
	}
	
}




















