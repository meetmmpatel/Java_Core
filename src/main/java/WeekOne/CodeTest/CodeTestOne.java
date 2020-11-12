package WeekOne.CodeTest;

public class CodeTestOne {
  
  
  public static void main(String[] args) {
	sumDouble(1, 2);
	sumDouble(3, 2);
	sumDouble(2, 2);
	
	diff21(19);
	diff21(10);
	diff21(46);
	
	makes10(9, 10);
	makes10(9, 9);
	makes10(1, 9);
	
	System.out.println("===IcyHot====");
	icyHot(120, -1);
	icyHot(-1, 120);
	icyHot(2, 120);
 
	System.out.println("===NegPos====");
	posNeg(1, -1, false);
	posNeg(-1, 1, false);
	posNeg(-4, -5, true);
 
	System.out.println("====Near100====");
	nearHundred(93);
	nearHundred(90);
	nearHundred(89);
	
  }
  
  /*
    Given two int values, return their sum.
    Unless the two values are the same, then return double their sum.

      sumDouble(1, 2) → 3
      sumDouble(3, 2) → 5
      sumDouble(2, 2) → 8
   */
  
  static void sumDouble(int a, int b) {
	if (a == b) {
	  System.out.println((a + b) * 2);
	} else {
	  System.out.println(a + b);
	}
  }
  
  /*
  Given an int n, return the absolute difference between n and 21,
  except return double the absolute difference if n is over 21.
    diff21(19) → 2
    diff21(10) → 11
    diff21(21) → 0
   */
  
  static void diff21(int n) {
	if (n <= 21) {
	  System.out.println(21 - n);
	} else {
	  System.out.println((n - 21) * 2);
	}
	
  }
  
  /*
   Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
    makes10(9, 10) → true
    makes10(9, 9) → false
    makes10(1, 9) → true
   */
  
  static void makes10(int a, int b) {
	int sum = a + b;
	
	if (a == 10 || b == 10) {
	  System.out.println(true);
	} else if (sum == 10) {
	  System.out.println(true);
	} else {
	  System.out.println(false);
	}
	
	
  }
  
  
  
  /*
  Given two temperatures, return true if one is less than 0 and the other is greater than 100.
    icyHot(120, -1) → true
    icyHot(-1, 120) → true
    icyHot(2, 120) → false
    */
  
  static void icyHot(int a, int b) {
//    if ((a > 100 && b < 0) || (a < 0 && b > 100)){
//      System.out.println(true);
//    } else {
//      System.out.println(false);
//    }
	
	boolean result = ((a > 100 && b < 0) || (a < 0 && b > 100)) ? true : false;
	System.out.println(result);
	
  }
  
  
  /*
  Given 2 int values, return true if one is negative and one is positive.
  Except if the parameter “negative” is true,
  then return true only if both are negative.
    posNeg(1, -1, false) → true
    posNeg(-1, 1, false) → true
    posNeg(-4, -5, true) → true
    */
  
  static void posNeg(int a, int b, boolean neg) {
	if (neg) {
	  System.out.println(a < 0 && b < 0);
	} else {
	  System.out.println((a < 0 && b > 0) || (a > 0 && b < 0));
	}
  }
  
  
  /*
  Given an int n, return true if it is within 10 of 100 or 200.
  Note: Math.abs(num) computes the absolute value of a number.
      nearHundred(93) → true
      nearHundred(90) → true
      nearHundred(89) → false
   */
  
  static void nearHundred(int n){
//    if (n + 10 >= 100 && n -10 <= 200){
//	  System.out.println(true);
//	}else {
//	  System.out.println(false);
//	}
 
	boolean result = n + 10 >= 100 && n -10 <= 200 ? true : false;
	System.out.println(result);
  }
  
  
}
