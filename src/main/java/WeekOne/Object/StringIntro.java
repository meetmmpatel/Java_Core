package WeekOne.Object;

public class StringIntro {
  /*
    String is java Class..
    
    classname ref = new className();
    classname ref = "any text..."
  
   */
  
  
  public static void main(String[] args) {
	
	String strOne = new String("Some value");
	System.out.println(strOne);
	
	String strTwo = "next value";
	System.out.println(strTwo);
	
	String text = "SomeStringValueInJava";
	
	System.out.println(text.charAt(0));
	System.out.println(text.length());
	System.out.println(text.toLowerCase());
	System.out.println(text.toUpperCase());
	
	//covert string into an array
	System.out.println(text.toCharArray());
	System.out.println(text);
	
	for (char s : text.toCharArray()) {
//	  System.out.println(s);
	  if (s == 'S') {
		System.out.println(s);
	  }
	}
	
	String one = "Java";
	String two = "JavaScript";
	
	String three = "java";
	
	System.out.println(one.equals(two));
	
	text = "";
	System.out.println(text.isEmpty());
	
	System.out.println(one.equals(three));
	System.out.println(one.equalsIgnoreCase(three));
	
	
  }
  
  
}
