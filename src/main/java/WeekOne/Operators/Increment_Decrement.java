package WeekOne.Operators;

public class Increment_Decrement {
  
  public static void main(String[] args) {
	
	int count = 100;
	System.out.println(count);
	++count;
	System.out.println(count);
	
	--count;
	System.out.println(count);
	
	int a = 1;
	int b = 2;
	int c;
	int d;
	
	System.out.println("value of a  " + a);
	c = ++b; // 3
	d = a++;  // print the 1 and then add value
	c++; // 3 print and then it will add the value
	
	System.out.println("a = " + a);
	System.out.println("b = " + b);
	System.out.println("c = " + c);
	System.out.println("d = " + d);
	System.out.println("d = " + d);
	
	
  }
}
