import java.util.*;
import java.awt.*;


public class LinkedStack<E> implements MyStack<E> {

	//empty list
	private MySinglyLinkedList<E> list = new MySinglyLinkedList<>();

	//new stack uses initial empty list
	public LinkedStack(){}

	public int size() {
		return list.size();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public void push(E element) {
		list.addFirst(element);
	}

	public E top() {
		return list.first();
	}

	public E pop() {
		return list.removeFirst();
	}


	public static void main(String[] args) {

		/*LinkedStack<Integer> intStack = new LinkedStack<Integer>();

		intStack.push(6);
		intStack.push(4);
		intStack.push(2);

		System.out.println(intStack.top());*/

	}

}