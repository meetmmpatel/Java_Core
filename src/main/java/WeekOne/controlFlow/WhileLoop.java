package WeekOne.controlFlow;

public class WhileLoop {


  	/*
	 while (condition){
	 	Statement(s);
	 }
	 -- method with return type.
	 public static <data type> nameOfMethod(args...){
	        return....datatype..
	 }
	 */
  
  // Global variable (not inside of any method)
  static int[] numbers = {223, 45, 56, 4, 6, 78, 86};
  
  public static int sumOfArray() {
	int sum = 0;
	for (int i = 0; i < numbers.length; i++) {
	  sum += numbers[i];
	}
	System.out.println(sum);
	return sum;
  }
  
  public static int sumOfArrayWithWhileLoop() {
	int sum = 0;
	int i = 0;
	while (i < numbers.length) {
	  sum += numbers[i];
	  i++;
	}
	return sum;
  }
  
  
  public static void main(String[] args) {
	sumOfArray();
	int result = sumOfArray();
	System.out.println("with While loop");
	System.out.println(sumOfArrayWithWhileLoop());
  }
  
}
