package dsa;
import java.util.EmptyStackException;
import java.util.StringJoiner;
public class MyStack<T> {

	private T[] stack;
	private int size; // 0

	public MyStack() {
		stack = (T[]) new Object[10];
	}

	public MyStack(int initialCapacity) {
		if (initialCapacity < 1) throw new IllegalArgumentException("Initial capacity can not be "+initialCapacity);
		stack = (T[]) new Object[initialCapacity];
	}

	public void push(T ele) {
		if (size == stack.length) resize();
		if (size < stack.length) {
			stack[size] = ele;
			size++;
		}
	}

	public T pop() {
		if (size == 0) throw new EmptyStackException();
		T ele = stack[size - 1];
		stack[size - 1] = null;
		size--;
		return ele;
	}

	public T peek() {
		if (size == 0) throw new EmptyStackException();
		return stack[size - 1];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == stack.length;
	}

	public void clear() {
		for (int i = 0; i < size; i++) {
			stack[i] = null;
		}
		size = 0;
	}

	public void resize() {
		T[] newArray = (T[]) new Object[stack.length * 2];
		for (int i = 0; i < size; i++) {
			newArray[i] = stack[i];
		}
		stack = newArray;
	}

	@Override
	public String toString() {
		if (size == 0) return "[]";
		StringJoiner res = new StringJoiner(",", "[", "]");
		for (int i = 0; i < size; i++) {
			res.add(stack[i] + "");
		}
		return res.toString();
	}
}