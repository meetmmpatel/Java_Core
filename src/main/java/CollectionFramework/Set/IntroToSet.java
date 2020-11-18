package CollectionFramework.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IntroToSet {
  
  
  public static void main(String[] args) {
	
	Set<String> stringSet = new HashSet<>();
	
	stringSet.add("Apple");
	stringSet.add("Mango");
	stringSet.add("Orange");
	stringSet.add("Apple");
	stringSet.add(null);
	stringSet.add(null);
	
	System.out.println(stringSet);
	
	// for each...
	
	Iterator<String> iterator = stringSet.iterator();
	
	while (iterator.hasNext()) {
	  System.out.println(iterator.next());
	}
	
	//Convert list and set into array
	
	String arrOne[] = new String[stringSet.size()];
	stringSet.toArray();
	
	arrOne[0] = "Some Value";
	arrOne[3] = "Last Value";
	System.out.println(Arrays.toString(arrOne));
	
  }
  
  
}

