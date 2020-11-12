package WeekOne.controlFlow;

public class DoWhileLoop {
  
  /*
   * do{ Statement(s); }
   * while (conditions);
   */
  
  public static void main(String[] args) {
    doWhileLoopDemo();
  }
  
  public static int doWhileLoopDemo (){
    int i = 10;
    
    // Print 10 to 0...
    do {
      //?
	  System.out.println(i);
	  i--;
	}while (i >= 12);
    return i;
  }
  
}
