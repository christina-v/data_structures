import java.util.*;
import java.awt.*;




public interface MyQueue<E> {

	/* FIFO - first in first out */

	//returns number of elements
	int size();

	//tests whether queue is empty
	boolean isEmpty();

	//inserts element at back if queue
	void enqueue(E e);

	//returns, but does not remove first element
	E first();

	//removes and returns the first elements of queue
	E dequeue();

}
