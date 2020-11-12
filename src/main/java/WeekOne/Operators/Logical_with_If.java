package WeekOne.Operators;

public class Logical_with_If {
  
  public static void main(String[] args) {
	
	// && , && vs & OR(||) !(NOT)
	
	//And (&&)
	
	int a = 0;
	int b = 1;
	
	if (a == 0 && b == 10) {
	  System.out.println(true);
	} else {
	  System.out.println(false);
	}
	
	
	int value = 8;
	int count = 10;
	int limit = 11;
	
	if (++value % 2 == 0 && ++count < limit) {
	  System.out.println(true);
	} else {
	  System.out.println(false);
	}
	
	/*
	Given two int values, return their sum. Unless the two values are the same,
	then return double their sum.
	 */
	
	int x = 2;
	int y = 2;
	int sum = x + y;
	
	if (x == y) {
	  System.out.println((sum) * 2);
	  
	} else {
	  System.out.println(sum);
	}
	
	
  }
  
  
}
