package dsa;

import java.util.Stack;

public class MyStackDriver {
	
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		
		MyStack ms = new MyStack(3);
		
		ms.push("abc");
		ms.push(20);
		ms.push(false);
		ms.push(40);
		
		
		
		System.out.println(ms);
		
		ms.clear();
		
		System.out.println(ms);
		
		
		
		
	}

}
