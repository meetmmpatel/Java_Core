package CollectionFramework.Map;


import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIntro {
  
  
  public static void main(String[] args) {
	
	Map<Integer, String> hashMap = new HashMap<>();
	
	System.out.println(hashMap);
	
	//Add value into map
	hashMap.put(11, "Java");
	hashMap.put(22, "C++");
	hashMap.put(33, "Python");
	
	System.out.println(hashMap);
	
	Collection collection = hashMap.values();
	Iterator iterator = collection.iterator();
	
	// print the values..
	while (iterator.hasNext()) {
	  System.out.println(iterator.next());
	}
	
	//Simple for loop
	for (Iterator it = hashMap.keySet().iterator(); it.hasNext(); ) {
	  System.out.println("Print the key value;" + it.next());
	}
	
	
	//check if key is there or not
	boolean keyExists = hashMap.containsKey(33);
	System.out.println(keyExists);
	
	boolean valueExists = hashMap.containsValue("C++");
	System.out.println(valueExists);
	
  }
}
