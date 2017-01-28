import java.util.*;
import java.awt.*;



public class LinkedQueue<E> implements MyQueue<E> {

	private MySinglyLinkedList<E> list = new MySinglyLinkedList<>();

	public LinkedQueue() {}

	public int size() {
		return list.size();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public void enqueue(E element) {
		list.addLast(element);
	}

	public E first() {
		return list.first();
	}

	public E dequeue() {
		return list.removeFirst();
	}


	public static void main(String[] args) {

		/*LinkedQueue<String> myQ = new LinkedQueue<String>();

		myQ.enqueue("C");
		myQ.enqueue("V");*/
		
	}	
}