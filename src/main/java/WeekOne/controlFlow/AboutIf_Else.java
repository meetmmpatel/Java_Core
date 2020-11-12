package WeekOne.controlFlow;

import java.util.Random;

public class AboutIf_Else {
  
  /*
    1. Only If statement..
    2. If and Else statement..
    3. If and elseIf and else..
    4. Nested If conditions
   */
  
  
  public static void main(String[] args) {
	
	int num = 30;
	
	// If only statement
	if (num >= 5) {
	  System.out.println("It's valid number");
	}
	
	// If else statement
	if (num % 2 != 0) {
	  System.out.println("it;s an odd number");
	} else {
	  System.out.println("it's an even number");
	}
	
	// check the value of num if it's with 0 to 4 number, or within 5 to 10
	
	if (num <= 4) {
	  System.out.println("Number is within 0 to 4");
	} else if (num <= 10) {
	  System.out.println("Number is within 5 to 10");
	} else {
	  System.out.println("It's not valid number");
	}
	
	
	Random random = new Random();
	int a = random.nextInt(5);
	
	if (a == 1) {
	  System.out.println("It's one");
	} else if (a == 2) {
	  System.out.println("it's two");
	} else if (a == 3) {
	  System.out.println("It's three");
	} else {
	  System.out.println("Not valid number");
	}
	
	
  }
  
  
}
