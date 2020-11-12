package WeekOne.controlFlow;

public class ForLoopCodeTest {
  
  
  public static void main(String[] args) {
	
    /*
     1. Print sum of range of number
      2.Print even or odd number from range of numbers
      3.Read the value from an array.
     */
	
	printTotal();
	evenOrOdd();
	readAnArray();
	int arr[] = {1, 2, 9, 9, 9};
	arrayCount9(arr);
	arrayCount9(new int[]{2,6,9,7,5,6,8});
  }
  
  
  static void printTotal() {
	// total of 0 to 15 numbers
	
	int total = 0;
	for (int i = 0; i <= 15; i++) {
	  total += i;
	}
	System.out.println(total);
  }
  
  static void evenOrOdd() {
	// number from 1 to 20 .. which number even and which one is odd?
	
	for (int i = 1; i <= 20; i++) {
	  if (i % 2 == 0) {
		System.out.println("Value of I is even: " + i);
	  } else {
		System.out.println("Value of I is odd: " + i);
	  }
	}
  }
  
  static void readAnArray() {
	
	int[] numbers = {23, 3, 4, 65, 56, 78, 89};
	for (int i = 0; i < numbers.length; i++) {
//	  System.out.println(numbers[i]);
	  if (numbers[i] % 2 == 0) {
		System.out.println("Even numbers are : " + numbers[i]);
	  }
	}
	
	String[] names = {"james", "mark", "Sam"};
	for (int i = 0; i < names.length; i++) {
//	  System.out.println(names[i]);
	  System.out.println(names[0]);
	}
	
	
  }
  
  /*
  Given an array of ints, return the number of 9's in the array.

	arrayCount9([1, 2, 9]) → 1
	arrayCount9([1, 9, 9]) → 2
	arrayCount9([1, 9, 9, 3, 9]) → 3
   */
  
  static void arrayCount9(int[] array){
    
    int count = 0;
    for (int i = 0; i < array.length; i++){
      if (array[i] == 9){
        count++;
	  }
	}
	System.out.println(count);
  
  }
  
}
