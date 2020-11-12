package WeekOne.Operators;

import java.util.Random;

public class Rendom_Arithmetic {
 
  /*
   public => private, protected, default
   static => not static
   void   => non void (return object)
   name of method => your given name.
   (arguments , dataType and name)
   {
     logic of method..
   }
  */
  
  public static void printInt(String str, int i) {
	System.out.println(str + " = " + i);
  }
  
  public static void printFloat(String str, float f) {
	System.out.println(str + " = " + f);
  }
  
  public static void main(String[] args) {
	
	// Call to the class Random
	Random random = new Random();
	
	// created three variables
	int j, k;
	
	j = random.nextInt(100) + 1;
	k = random.nextInt(100) + 1;
	
	printInt("J value", j);
	printInt("K value", k);
	
	float u, v;
	
	u = random.nextFloat() + 1;
	v = random.nextFloat() + 1;
	
	printFloat("value of U", u);
	printFloat("value of V", v);
	
	
  }
  
  
}
