package CollectionFramework;

public class CodeTestArray {
  
  public static void main(String[] args) {
	System.out.println("Sum of an array");
	ArraySum();
	System.out.println("Duplicate Array");
	findDuplicate();
	System.out.println("Array Min Max");
	findMinMax();
	System.out.println("Array Triple up");
	System.out.println(tripleUp(new int[]{-100, -99, -99, 100, 101, 102}));
  }
  
  /*
   print the total sum and length of an array
   */
  public static void ArraySum() {
	int[] arrOne = {12, 23, 33, 44, 66, 5, 6, 9, 7, 6};
	
	int sum = 0;
	for (int i : arrOne) {
	  sum += i;
	}
	System.out.println(sum);
  }
  
  /*
   find the duplicate numbers
   */
  public static void findDuplicate() {
	int[] arrOne = {1, 2, 5, 5, 6, 6, 7, 2, 7};
	
	//Hint nested loop..
	
	for (int i = 0; i < arrOne.length - 1; i++) {
	  for (int j = i + 1; j < arrOne.length; j++) {
		if (arrOne[i] == arrOne[j]) {
		  System.out.println("Duplicate Values: " + arrOne[j]);
		}
	  }
	}
  }
  
  /*
    find the min and max numbers from an array
    
   */
  public static void findMinMax() {
	int[] arrOne = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
	
	int max = arrOne[0];
	int min = arrOne[0];
	
	for (int i = 1; i < arrOne.length; i++) {
	  if (arrOne[i] > max) {
		max = arrOne[i];
	  }
	}
	System.out.println("Max value: " + max);
	
	for (int i = 1; i < arrOne.length; i++) {
	  if (arrOne[i] < min) {
		min = arrOne[i];
	  }
	}
	System.out.println("Min value: " + min);
  }
  
  /*
   Return true if the array contains, somewhere,
   three increasing adjacent
   numbers like .... 4, 5, 6, ... or 23, 24, 25.
	tripleUp([1, 4, 5, 6, 2]) → true
	tripleUp([1, 2, 3]) → true
	tripleUp([1, 2, 4]) → false
	tripleUp([1, 2, 4, 5, 7, 6, 5, 7, 7, 6]) -> false
	tripleUp([-100, -99, -99, 100, 101, 102]) → true
	tripleUp([2, 3, 5, 6, 8, 9, 2, 3]) → false
   */
  
  public static boolean tripleUp(int[] nums) {
	
	for (int i = 0; i < nums.length - 2; i++) {
	  if (nums[i] + 1 == nums[i + 1] && nums[i + 1] + 1 == nums[i + 2]) {
		return true;
	  }
	}
	return false;
  }
  
}
