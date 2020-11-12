package WeekOne.Operators;

public class Ternary_Intro {
  
  public static void main(String[] args) {
	
	
	int i;
	int k = 0;
	
	i = 36;
	
	// want to check the value of i and if it's bigger then 10 then value of k will 20;
	// If value of I less then 10 value of k will -20;

//	if (i >= 10) {
//	  k = 20;
//	  System.out.println(k);
//	} else {
//	  k = -20;
//	  System.out.println(k);
//	}
	
	// variable (expression) ? true : false.
	
	int result = i >= 10 ? 20 : -20;
	k = result;
	System.out.println(k);
	
	int num = 3;
	// code in ternary check if num is even or odd...
	String ans = num % 2 == 0 ? "Even" : "Odd";
	System.out.println(ans);
	
	
	
  }
  
  
}
