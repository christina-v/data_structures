import java.util.*;
import java.awt.*;

public class MyDoublyLinkedList<E> {

//IMPLEMENTATION FROM DATA STRUCTURES AND ALGORITHMS 6th Ed.

/* nested node class */
private static class Node<E> {
	private E element;
	private Node<E> prev;
	private Node<E> next;
	public Node(E e, Node<E> p, Node<E> n) {
		element = e;
		prev = p;
		next = n;
	}
	public E getElement() { return element;}
	public Node<E> getPrev() {return prev;}
	public Node<E> getNext() {return next;}
	public void setPrev(Node<E> p) {prev = p;}
	public void setNext(Node<E> n) {next = n;}
	
}//end of nested class

/* instance variabled of DoublyLinkedList */
private Node<E> header;
private Node<E> trailer;
private int size = 0;

//construct new empty list
public MyDoublyLinkedList() {
	header = new Node<>(null, null, null);
	trailer = new Node<>(null, header, null);
	header.setNext(trailer);
}
//returns the number of elements in list
public int size() {return size;}
public boolean isEmpty() {return size == 0;}

//returns the first element in list
public E first() {
	if(isEmpty()) {return null;}
	return header.getNext().getElement();
}

//returns last element
public E last() {
	if(isEmpty()) {return null;}
	return trailer.getPrev().getElement();
}

/* public update methods */
public void addFirst(E e) {
	addBetween(e, header, header.getNext());
}

public void addLast(E e) {
	addBetween(e, trailer.getPrev(), trailer);
}

//remove and return first element of list
public E removeFirst() {
	if(isEmpty()) {return null;}
	return remove(header.getNext());
}

public E removeLast() {
	if(isEmpty()) {return null;}
	return remove(trailer.getPrev());
}

/* private update methods */
private void addBetween(E e, Node<E> predecessor, Node<E> successor) {
	//create and link a new node
	Node<E> newest = new Node<>(e, predecessor, successor);
	predecessor.setNext(newest);
	successor.setPrev(newest);
	size++;
}

//removes given node from list and returns element
private E remove(Node<E> node) {
	Node<E> predecessor = node.getPrev();
	Node<E> successor = node.getNext();
	predecessor.setNext(successor);
	successor.setPrev(predecessor);
	size--;
	return node.getElement();
}

public static void main(String[] args) {
	MyDoublyLinkedList<Character> dll = new MyDoublyLinkedList<Character>();
}


}