package pratical_application;

public class VariableTyeps {
  
  //Variable types??
  // Local and global
	  // static
	  // Non - static
	  // instance
  
  
  // Global variable...with non-static ..
   int number;
   String str;
   
   //Global variable with static
 static float price;
 static long  qty;
  
  public static void main(String[] args) {
    
    VariableTyeps tyeps = new VariableTyeps();
    //call to non-static variable and method
    tyeps.number = 25;
    tyeps.getNumber();
  
    //call to static variable and method..
	price = 25.99F;
	getInfo();
  }
  
  public static void getInfo(){
	System.out.println("Static method");
  }
   
   //method 1
   public  void getNumber(){
     number = 10;
     
     //local variable with non-static
	 String name = "Java";
    str = "javaScript";
	 System.out.println(name);
	 
	  price = 12.99F;
   
   }
  // method 2
  public  void ReadNumber(){
	number = 20;
	str = "python";
	
  }
  
}
