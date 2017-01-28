import java.util.*;
import java.awt.*;


public interface Stack<E> {

	int size();

	boolean isEmpty();

	void push(E e);

	/* remove and return respective elements */
	E top();

	E pop();

}