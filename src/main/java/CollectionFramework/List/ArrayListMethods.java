package CollectionFramework.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {
  
  
  public static void main(String[] args) {
	
	//[Red, Green, Orange, White, Black]
	
	List<String> colors = new ArrayList<>();
	colors.add("Red");
	colors.add("Green");
	colors.add("Orange");
	colors.add("White");
	colors.add("Black");
	
	System.out.println(colors);
	
	//How print each color as in new line?

//	for (int i = 0; i < colors.size(); i++){
//	  System.out.println(colors.get(i));
//	}
	
	//For each
	for (String str : colors) {
	  System.out.println(str);
	}
	
	// read each by index
	System.out.println(colors.get(2));
	
	// Add one color Pink .. add the first index
	colors.add(0, "Pink");
	System.out.println(colors);
	
//	colors.add( 9, "SomeColor");
	
	colors.remove("Pink");
	System.out.println(colors);
	colors.remove(3);
	System.out.println(colors);
	
	
	// Reverse the list
	Collections.reverse(colors);
	System.out.println(colors);
	
	System.out.println(colors.get(0));
 
 
	System.out.println("Original Color List:" + colors);
	
	List<String> colorsTwo = new ArrayList<>();
	colorsTwo.add("Purple");
	colorsTwo.add("Blue");
 
	System.out.println("new Colors List: " + colorsTwo);
	
	
	//Merge two list in to one.
	colors.addAll(colorsTwo);
	System.out.println(colors);
	
  }
  
  
}
