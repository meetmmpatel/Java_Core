package pratical_application;

public class StaticVsNon_static {
  
  // call static and non-static variables and methods...
  
  public static void main(String[] args) {
	
    JavaClass javaClass = new JavaClass();
    
    javaClass.name = "Java";
    javaClass.isActive = true;
    javaClass.getNameInfo();
    
    //classname.static v or m
	JavaClass.price = 12.99;
	JavaClass.number = 34;
	JavaClass.getPrice();
  
  }
  
}



class JavaClass{
  
  //Global variable
  
  String name;
  boolean isActive;
  
  static int number;
  static double price;
  
  public void getNameInfo(){
    String info = "Some Info";
	System.out.println(info);
	System.out.println(name);
	System.out.println(isActive);
  }
  
  public static void getPrice(){
    char word = 'A';
	System.out.println(word);
	System.out.println(number);
	System.out.println(price);
  }
  
  
}