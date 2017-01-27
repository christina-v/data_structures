import java.util.*;

public class Array {


	public static void main(String[] args) {

		/*creating a one-dimensional array of multiples of 5*/
		int[] myArray = new int[5];

		int value = 5;

		for(int i = 0; i < 5; i++) {
			myArray[i] = value*i;
			//System.out.println(myArray[i]);
	}


		/*creating a two-dimensional array with a pattern of 1 through diagonal*/
		int[][] multiArray = new int[3][3];

        
		for(int j = 0; j < 3; j++) {

			for(int k = 0; k < 3; k++) {

				if(j == k) {
					multiArray[j][k] = 1;
				}

				else {
					multiArray[j][k] = 0;
				}

				//System.out.print(multiArray[j][k] + " ");
			}
            
             //System.out.println();
		}

	
		} //end of main





}