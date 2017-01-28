import java.util.*;
import java.lang.*;

public class myArrayList<E> implements MyList<E> {


	/*instance variables*/
	public static final int CAPACITY=16;      //default array capacity
	private E[] data;
	private int size = 0;

	/*constructors*/
	public myArrayList() {this(CAPACITY);}
	public myArrayList(int capacity) {
		data = (E[]) new Object[capacity];
	}

	/*public methods*/
	public int size() { return size; }
	public boolean isEmpty() {
		return size ==0;
	}

	//returns but does not remove
	public E get(int i) throws IndexOutOfBoundsException {
		checkIndex(i, size);
		return data[i];
	}

	//replaces the element
	public E set(int i, E e) throws IndexOutOfBoundsException {
		checkIndex(i, size);
		E temp = data[i];
		data[i] = e;
		return temp;
	}

	//inserts elements e to be at index i
	public void add(int i, E e) throws IndexOutOfBoundsException, IllegalStateException {
		checkIndex(i, size+1);
		if(size == data.length) {
			throw new IllegalStateException("Array is full");
		}
		//shift rightmost
		for(int k = size-1; k >= i; k--) {
			data[k+1] = data[k];
		}
		//place new element
		data[i] = e ;
		size++;
	}

	public E remove(int i) throws IndexOutOfBoundsException {
		checkIndex(i, size);
		E temp = data[i];
		//shift elements to fill hole
		for(int k = i; k < size-1; k++) {
			data[k] = data[k+1];
		}
	    //garbage collect
	    data[size-1] = null;
	    size--;
	    return temp;
	}

	/*utility method*/
	protected void checkIndex(int i, int n) throws IndexOutOfBoundsException {
		if(i < 0 || i > n) {
			throw new IndexOutOfBoundsException("Illegal index: "+ i);
		}
	}




	public static void main(String[] args) {


	} 




}