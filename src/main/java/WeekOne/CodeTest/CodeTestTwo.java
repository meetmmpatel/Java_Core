package WeekOne.CodeTest;

public class CodeTestTwo {
  
  public static void main(String[] args) {
	or35(3);
	or35(10);
	or35(8);
	
	System.out.println("===In1020====");
	in1020(12, 99);
	in1020(21, 12);
	in1020(8, 99);
	
	System.out.println("====HasTeen=====");
	hasTeen(13, 20, 10);
	hasTeen(20, 19, 10);
	hasTeen(20, 10, 13);
	
	System.out.println("====intMax ====");
	intMax(1, 2, 3);
	intMax(1, 3, 2);
	intMax(3, 2, 1);
 
	System.out.println("===Close to 10 =====");
	close10(8, 13);
	close10(13, 8);
	close10(13, 7);
  }
  
  
  /*
	Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % “mod” operator
	or35(3) → true
	or35(10) → true
	or35(8) → false
	*/
  
  static void or35(int i) {
	
	if (i % 3 == 0 || i % 5 == 0) {
	  System.out.println(true);
	} else {
	  System.out.println(false);
	}
	
  }
  
  
 /*
	Given 2 int values, return true if either of them is in the range 10..20 inclusive.
	in1020(12, 99) → true
	in1020(21, 12) → true
	in1020(8, 99) → false
	*/
  
  static void in1020(int a, int b) {
	if (a >= 10 && a <= 20 || b >= 10 && b <= 20) {
	  System.out.println(true);
	} else {
	  System.out.println(false);
	}
	
  }
  
 /*
	We’ll say that a number is “teen” if it is in the range 13..19 inclusive. Given 3 int values,
	return true if 1 or more of them are teen.
	hasTeen(13, 20, 10) → true
	hasTeen(20, 19, 10) → true
	hasTeen(20, 10, 13) → true
	*/
  
  static void hasTeen(int a, int b, int c) {
	boolean result = (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
	System.out.println(result);
  }
 
 
 /*
	Given three int values, a b c, return the largest.
	intMax(1, 2, 3) → 3
	intMax(1, 3, 2) → 3
	intMax(3, 2, 1) → 3
	*/
  
  static void intMax(int a, int b, int c) {
	
	// a , b , c ? Max   temp = a & b   temp to c
	int temp = Math.max(a, b);
	int result = Math.max(temp, c);
	System.out.println(result);
	
  }
  
  
 /*
	Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
	Note that Math.abs(n) returns the absolute value of a number.
	close10(8, 13) → 8
	close10(13, 8) → 8
	close10(13, 7) → 0
   */
  
  static void close10(int a, int b) {
  
	if (Math.abs(a - 10) == Math.abs(b - 10)) {
	  System.out.println(0);
	} else if (Math.abs(a - 10) < Math.abs(b - 10)) {
	  System.out.println(a);
	} else {
	  System.out.println(b);
	}
	
  }
  
  
}
