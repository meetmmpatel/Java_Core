package Advance_Java;

import java.util.Hashtable;
import java.util.Map;
import java.util.stream.Collectors;

public class MapWithStream {
  
  
  public static void main(String[] args) {
	
    
    //How to convert Map(any Class) into stream and read and filter the results
  
  
	Map<Integer, String> map = new Hashtable<>();
    //hast table will not allow null value as key
	
	map.put(11, "Java");
	map.put(12, "JavaScript");
	map.put(13, "HTML");
	map.put(14, "CSS");
	map.put(15, "HTML-5");
 
	System.out.println(map);
	
	Map<Integer, String> result = map.entrySet().stream()
			.filter(m -> m.getKey() <= 12)
			.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
  
	System.out.println(result);
	
	
	// value less or equel to 13 and only print name that starts with H
	Map<Integer, String> results = map.entrySet().stream()
			.filter(key -> key.getKey() <= 13)
			.filter(value -> value.getValue().startsWith("H"))
			.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
  
	System.out.println("Up to 13 key and starts with H");
	System.out.println(results);
		
  
  
  }
}
