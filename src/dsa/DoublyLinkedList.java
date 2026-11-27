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
	public void addFirst(T ele) {
		Node newNode = new Node(ele);
		if(head == null) add(ele);
		else{
			newNode.next = head;
			this.head.prev = newNode;
			head = newNode;
		}
		size++;
	}
	
	public void addLast(T ele) {
		add(ele);
	}
	
	public void addAll(DoublyLinkedList<T> dl) {
		if(head == null) {
			head = dl.head;
			tail = dl.tail;
		}
		else {
			this.tail.next = dl.head;
			dl.head.prev = this.tail;
			tail = dl.tail;
		}
		this.size+=dl.size;
	}
	public void removeFirst() {
		if(head == null) throw new IllegalArgumentException("List is Empty");
		head = head.next;
		head.prev = null;
	}
	public int size() {
		return this.size;
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

















