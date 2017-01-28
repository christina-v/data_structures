import java.util.*;
import java.awt.*;

public class MySinglyLinkedList<E> {

/* IMPLEMENTATION FROM DATA STRUCTURES AND ALGORITHMS in JAVA 6th Edition*/

	//nested node class
	private static class Node<E> {
		private E element;
		private Node<E> next;
		public Node(E e, Node<E> n) {
			element = e;
			next = n;
		}

		public E getElement() {
			return element;
		}
		public Node<E> getNext() {
			return next;
		}
		public void setNext(Node<E> n) {
			next = n;
		}
	} //end of nested class

	/* instance variables */
	private Node<E> head = null;
	private Node<E> tail = null;
	private int size = 0;
	public MySinglyLinkedList() {}

	/* access methods */
	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}
   
    //returns but does not remove the first element
	public E first() {
		if(isEmpty()) {
			return null;
		}
		return head.getElement();
	}

	public E last() {
		if(isEmpty()) {
			return null;
		}
		return tail.getElement();
	}
	
	/* update methods */
	public void addFirst(E e) {
		head = new Node<>(e, head); //create and link a new node
		if(size == 0) {
			tail = head;            //new node becomes tail
		}
		size++;
	}


	public void addLast(E e) {
		Node<E> newest = new Node<>(e, null);
		if(isEmpty()){
			head = newest;
		}
		else {
			tail.setNext(newest);  //new node after existing tail
		}
		tail = newest;             //new node becomes tail
		size++;
	}


	public E removeFirst() {
		if(isEmpty()) {
			return null;
		}
		E answer = head.getElement();
		head = head.getNext();
		size--;
		if(size == 0) {
			tail = null;	//special case when list empty
		}
		return answer;
	}



	public static void main(String[] args) {
		MySinglyLinkedList<Integer> linkedList = new MySinglyLinkedList<Integer>();
		linkedList.addFirst(5);
		linkedList.addLast(7);
		int length = linkedList.size();

		System.out.println(length);
	}


}