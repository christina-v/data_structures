import java.util.*;
import java.lang.*;

public class myArrayList {


	public static void main(String[] args) {

		ArrayList<Character> letters = new ArrayList<Character>();

		letters.add('j');
		letters.add('a');
		letters.add('v');
		letters.add('a');

		int length = letters.size();

		for(int i = 0; i < length; i++) {
			System.out.println(letters.get(i));
		}


	} 




}