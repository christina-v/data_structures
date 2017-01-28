import java.util.*;
import java.awt.*;


public interface MyList<E> {

	int size();

	boolean isEmpty();

	//tells you element at the index
	E get(int i) throws IndexOutOfBoundsException;

	//replaces element at index
	E set(int i, E e) throws IndexOutOfBoundsException;

	//removes/returns element at index i
	E remove(int i) throws IndexOutOfBoundsException;

}