package WeekOne.Operators;

public class Logical_Operators {
  
  /*
  Symbol	Long Name
	&&	conditional AND
	||	conditional OR
	!	logical negation (NOT)
   */
  
  public static void main(String[] args) {
	
	int a = 200;
	int b = 400;
	
	boolean b1 = a == b;
	boolean b2 = a <= b;
	
	if (b1 || b2) {
	  System.out.println("Print true");
	} else {
	  System.out.println("print false");
	}
	
	if (a <= b) {
	  System.out.println(true);
	} else {
	  System.out.println(false);
	}
	
	boolean b3 = a != b;
	System.out.println(b3);
	
  }
  
  
}
