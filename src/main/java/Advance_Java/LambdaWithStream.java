package Advance_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaWithStream {
  
  public static void main(String[] args) {
	
	List<String> names = new ArrayList<>(Arrays.asList("Sam", "Nick", "AJ", "Mike", "Steve"));
	System.out.println(names);
	System.out.println(names.size());
	
	// Tell the count of all names inside the list??
	int count = 0;
	for (String str: names) {
	   if (str.length() > 4){
	     count++;
	   }
	}
	System.out.println("Normal for loop "+ count);
	
	//Only count the list of size is more then 4
	long nameLength = names.stream().filter(str -> str.length() > 4).count();
	System.out.println("With Stream api: "+nameLength);
 
 
	Stream.iterate(1, index -> index + 1)
			.filter(num -> num % 5 == 0)
			.limit(5).forEach(System.out::println);
	
	
  }
  
  
}
