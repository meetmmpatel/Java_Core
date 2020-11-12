package WeekTwo.Exceptions;

public class NestedTryCatch {
  
  public static void main(String[] args) {
	
	try {
	  //Two child try catch block..
	  try {
		System.out.println("Inside try block one");
		int b = 45 / 2;
	  } catch (ArithmeticException e) {
		System.out.println("Inside first child block");
	  }
	  
	  //child two
	  try {
		System.out.println("Inside try block two");
		int b = 45 / 0;
	  } catch (ArithmeticException e) {
		System.out.println("Inside secound catch block");
	  }
	  
	  System.out.println("Just another try block statement");
	  
	} catch (ArithmeticException e) {
	  System.out.println("there is an arithmetic exception");
	} catch (ArrayIndexOutOfBoundsException e) {
	  System.out.println("it's an array out of bound exception");
	} catch (Exception e) {
	  System.out.println("something went wrong!!");
	}
	
	System.out.println("code continue...");
  }
  
  
}
