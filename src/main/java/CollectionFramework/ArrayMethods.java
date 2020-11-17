package CollectionFramework;

import java.util.Arrays;

public class ArrayMethods {
  
  public static void main(String[] args) {
    
    // how to create array with size of 10?
	int [] arrOne = new int[10];
	System.out.println(Arrays.toString(arrOne));
	
	//How to assign value to an array.
	arrOne[4] = 25;
	System.out.println(Arrays.toString(arrOne));
	
	//how to find the length of array
	System.out.println(arrOne.length);
	
	//Fill the array with one number
	Arrays.fill(arrOne, 88);
	System.out.println(Arrays.toString(arrOne));
	
	//how to create two dimension array
	int [][] arrTwo = {{1,2,3}, {3,4,5}, {34,56, 46}};
	System.out.println(Arrays.deepToString(arrTwo));
 
	System.out.println(arrTwo[1][2]);
	
	String names[] = {"Mark","Sam","Mike","Josh"};
 
	System.out.println(Arrays.toString(names));
	
	//Copy an array from another array
	String[] newNames = names.clone();
	System.out.println(Arrays.toString(newNames));
	
	
  }
  
  
}
