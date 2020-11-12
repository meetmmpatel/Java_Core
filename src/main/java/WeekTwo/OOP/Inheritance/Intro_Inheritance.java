package WeekTwo.OOP.Inheritance;

/*
  Inheritance...
  1. Class to class extention
     eg. classA extend classB...
    
     A -> B(can access all method and variable of class A)
 */


class Demo {
  
  String message = "From Demo Class";
  int messageId = 101;
  
  void printMessage() {
	System.out.println("ID: " + messageId + "Message: " + message);
  }
  
}


public class Intro_Inheritance extends Demo {
  
  public static void main(String[] args) {
	
    //Inheritance
	Intro_Inheritance obj = new Intro_Inheritance();
	System.out.println(obj.messageId);
	System.out.println(obj.message);
	obj.printMessage();
	
	//Const call
	Demo demo = new Demo();
	System.out.println(demo.messageId);
	System.out.println(demo.message);
	
  }
  
}
