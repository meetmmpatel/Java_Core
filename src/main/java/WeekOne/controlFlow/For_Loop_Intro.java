package WeekOne.controlFlow;

public class For_Loop_Intro {
  
  
  public static void main(String[] args) {
	
    // print 1 to 10...
	/*
	 for ( init ; booleanExpression ; update ) {
        statement (s)
    }
	 */
	
	 for (int i = 1; i <= 10; i++){
	   System.out.println(i);
	 }
  
	System.out.println("Loop with outside variable ");
	 
	 int j = 0;
	 for (; j < 5; j++){
	   System.out.println(j);
	 }
  
	System.out.println("Loop with all condition outside..");
	 
	 int m = 0;
	 for (; ; ){
	   System.out.println(m);
	   m++;
	   
	   if (m > 6){
	     break;
	   }
	 }
  
  
	System.out.println("For loop with multiple value");
	  for ( int i = 0,k = 0; i < 5; i++){
		System.out.println("value of I: " + i + "value of j: " + k);
	  }
  
  
  }
  
  
  
}
