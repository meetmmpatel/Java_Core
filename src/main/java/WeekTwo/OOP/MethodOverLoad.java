package WeekTwo.OOP;

public class MethodOverLoad {

  
  //Method OverLoad:
  /*
   1. Method only allowed in same class
   2. Two or more method with same name..
   3. Argument data-type must be diff in each method
   4. return type of method data type must be different
   */
  
   public MethodOverLoad(){
	 System.out.println("No-arg Constructor");
   }
   
   public MethodOverLoad(String name, String message){
	 System.out.println(name + message);
   }
   
   public void displayInfo(){
	 System.out.println("Default display..");
   }
   
   public void displayInfo(String message){
	 System.out.println(message);
   }
   
   public void displayInfo(String name, String message){
	 System.out.println(name + message);
   }
   
  public static void main(String[] args) {
     
     MethodOverLoad overLoad = new MethodOverLoad();
     overLoad.displayInfo();
     overLoad.displayInfo("Message One");
     overLoad.displayInfo("Message Two");
	
	  MethodOverLoad overLoad1 = new MethodOverLoad();
	  overLoad1.displayInfo();
	
  }
}
