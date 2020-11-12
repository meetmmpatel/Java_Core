package WeekOne.controlFlow;

public class ForEachLoopDemo {
  
  /*
    for(int i: nameOfArray){
     .. code ...
    }
   */
  
  public static void main(String[] args) {
	
	double[] arr = {12.99, 23.99, 45.99, 35.78};
	
	for (double i : arr) {
	  System.out.println(i);
	}
	
	System.out.println("---Code Test---");
	System.out.println(array667(new int[]{6, 6, 2, 6, 7}));
  }
  
  /*
  Given an array of ints, return the number of times that two 6's
  are next to each other in the array.
  Also count instances where the second "6" is actually a 7.
	  array667([6, 6, 2]) → 1
	  array667([6, 6, 2, 6]) → 1
	  array667([6, 7, 2, 6]) → 1
	  array667([6, 7, 6, 6]) → 2
	  array667([1, 2, 3, 5, 6]) → 0
	  array667([6, 6, 2, 6, 7]) → 2
	  array667([]) → 0
   */
  
  public static int array667(int[] arr) {
     /*
       1. int that have total value
       2. for  loop .. read each value.
      */
	int total = 0;
	for (int i = 0; i < arr.length -1; i++) {
	  if (arr[i] == 6) {
		if (arr[i + 1] == 6 || arr[i + 1] == 7) {
		  total++;
		}
	  }
	}
	return total;
  }
  
  
}
