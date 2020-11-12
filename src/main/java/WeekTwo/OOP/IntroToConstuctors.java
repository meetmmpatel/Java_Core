package WeekTwo.OOP;

public class IntroToConstuctors {
  
  /*
    // Call
     Classname ref = new ClassName();
     
     Types:
     1. Default (Auto)
     2. No-Args
     3. With Args
     
    // it's type of method.
	// it has a same name as class
	// Constructors are always public
	// They don't have return type.
	// Can not be static
	// any class java provide default constructor
	// you can multiple constructors in one class
   */
  
  
  //No-args Constructor
  public IntroToConstuctors() {
	System.out.println("This is No-args Constructor");
  }
  
  public IntroToConstuctors(String name, String text) {
	System.out.println("This is name: " + name);
	System.out.println("This is text: " + text);
  }
  
  
  public IntroToConstuctors(String name, int number){
	System.out.println(name);
	System.out.println(number);
  
  }
  
  public static void main(String[] args) {
	IntroToConstuctors intro = new IntroToConstuctors();
	IntroToConstuctors intro1 = new IntroToConstuctors("Java", "OOP");
	IntroToConstuctors intro2 = new IntroToConstuctors("javaScript", 3);
  }
  
  
}
