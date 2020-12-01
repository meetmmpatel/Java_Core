package Advance_Java;

public class LambdaIntro {
  
  //Method decelaration
  //Call expression ...
  
  /*
   (args list) -> {method body..}
   
   IN normal function
   1. name
   2. Args list
   3. body
   4. return type
   
   In lambda
   1. No name
   2. Args list
   3. Body
   4. No return type
   5. Always implements Functional interface.
   
   */
  
  public static void main(String[] args) {
	
	//Call the interface by name.
	// provide args if any..
	// provide method body..
	
	InterfaceOne one = () -> {
	  return "Hello From Interface One";
	};
	
	System.out.println(one.sayHello());
	
	InterfaceTwo two = (num) -> {
	  return num + 5;
	};
	System.out.println(two.incrementByFive(10));
	
	
	
  }
}

//Functional interface must have only one method..

@FunctionalInterface
interface InterfaceOne {
  public abstract String sayHello();
}

@FunctionalInterface
interface InterfaceTwo {
  public abstract int incrementByFive(int num);
}

@FunctionalInterface
interface InterfaceThree{
  public abstract String fullName(String firstName, String LastName);
}


