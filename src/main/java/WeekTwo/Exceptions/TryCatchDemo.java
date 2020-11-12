package WeekTwo.Exceptions;

public class TryCatchDemo {
  
  
  public static void main(String[] args) {
	
	demoOne();
	System.out.println("Code continue...");
	demoTwo();
	System.out.println("Code after method two");
	demoThree();
  }
  
  
  public static void demoOne() {
	
	int numOne;
	int numTwo;
	
	try {
	  numOne = 0;
	  numTwo = 50 / numOne;
	} catch (ArithmeticException e) {
	  System.out.println("Number can not be divide");
	}
	
  }
  
  public static void demoTwo() {
	
	//Try with multiple catch..
	try {
	  int arr[] = {22, 33, 44, 55, 66};
	  arr[20] = 15;
	  System.out.println("Inside demotwo try catch");
	} catch (ArithmeticException e) {
	  System.out.println("Can not divide by zero");
	} catch (ArrayIndexOutOfBoundsException e) {
	  System.out.println("Code is outside of any array range");
	}
  }
  
  
  public static void demoThree() {
	try {
	  String str = null;
	  System.out.println(str.length());
	} catch (NullPointerException e) {
	  System.out.println("It has a null value..");
	}
	
  }
  
  
}
