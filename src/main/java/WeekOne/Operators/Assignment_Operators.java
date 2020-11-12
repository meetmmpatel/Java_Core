package WeekOne.Operators;

public class Assignment_Operators {
  
  
  public static void main(String[] args) {
	
	int a = 1;
	int b = 2;
	int c = 3;
	
	a += 5;  // a = a(1) + 5;
	b *= 4;  // b = b(2) * 4;
	c += a * b;
	c %= 6;
	System.out.println("a = " + a);
	System.out.println("b = " + b);
	System.out.println("c = " + c);
	
	//Create an array...
	int numbers[] = {1, 22, 34, 36, 45, 5, 7, 6, 7};
	
	// index number four is even or odd number..
	
	boolean b1 = numbers[1] % 2 == 0;
	System.out.println(b1);
	
	if (numbers[1] % 2 == 0) {
	  System.out.println("it's an even number");
	} else {
	  System.out.println("it's an odd number");
	}
	
	
  }
}
