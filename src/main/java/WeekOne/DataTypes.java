package WeekOne;

public class DataTypes {
  
  public static void main(String[] args) {
    
    /*
     1. Primitive types
     		- boolean  = true or false
     		- char ('') = Only single char allowed
     		- byte   = -127 to 127
            - short  = -32000 to 32000
            - int    = -9bn to 9bn
            - long   = -32 b to 32 L
            - float  =  0.9999999 must F at end.
            - double =  0.111 up to 11 numbers
     2. Non-primitive or reference type
     
     		- String  =  text value
     		- Array   =  Collection of values
     		- Class   = Class and Object
     */
	
	// type varName = value;
	boolean b1 = true;
	System.out.println(b1);
	
	char c1 = 'A';
	System.out.println(c1);
	
	byte byteValue = 120;
	System.out.println(byteValue);
	
	short shortValue = 23090;
	System.out.println(shortValue);
	
	int intValue = 3499834;
	System.out.println(intValue);
	
	long longValue = 898098098;
	System.out.println(longValue);
	
	float floatValue = 1.99F;
	System.out.println(floatValue);
	
	double doubleValue = 12.9898;
	System.out.println(doubleValue);
 
	System.out.println("========= References Types=========");
	
	String textValue = "This is string in java";
	System.out.println(textValue);
	
	String numbersofString = "15 15 15";
	System.out.println(numbersofString);
	
	//Array data Type...
	int listOfNumber[] = {45, 55, 65, 75};
	System.out.println(listOfNumber[1]);
	
	String names[] = {"Mark", "Miller", "Sam", "Josh"};
	System.out.println(names[2]);
	
	
  }
  
  
}
