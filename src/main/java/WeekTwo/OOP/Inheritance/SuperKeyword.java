package WeekTwo.OOP.Inheritance;

public class SuperKeyword extends SuperClass {
  
    public SuperKeyword(){
      super();
	  System.out.println("This is Child class");
	}
	
	public SuperKeyword(String message){
      super("This is message from super class");
	  System.out.println(message);
	}
 
	public void printInfo(){
      super.displayInfo();
	  System.out.println("This is print info");
	}
  
  public static void main(String[] args) {
	 SuperKeyword keyword = new SuperKeyword();
	 keyword.printInfo();
	 
	 SuperKeyword superKeyword = new SuperKeyword("Some Message");
	 System.out.println(superKeyword);
	 
  }

}


class SuperClass {
  
  //Two conts
  // Two non static method
  
  public SuperClass() {
	System.out.println("SuperClass Constructor");
  }
  
  public SuperClass(String message) {
	System.out.println(message);
  }
  
  void displayInfo() {
	System.out.println("This is default info");
  }
  
  void displayInfo(String info) {
	System.out.println(info);
  }
}
