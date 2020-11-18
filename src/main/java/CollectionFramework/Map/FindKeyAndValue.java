package CollectionFramework.Map;

import java.util.HashMap;
import java.util.Map;

public class FindKeyAndValue {
  
   /*
  The Original map: {Red=1, White=4, Blue=5, Black=3, Green=2}
  
  1. Is key 'Green' exists?
  yes! - 2
  
  2. Is key 'orange' exists?
  no!
   */
  
  public static void main(String[] args) {
	
	Map<String, Integer> map = new HashMap<>();
	map.put("Red", 1);
	map.put("White", 4);
	map.put("Blue", 5);
	map.put("Black", 3);
	map.put("Green", 2);
	
	
	if (map.containsKey("Green")){
	  System.out.println(true);
	}
	else {
	  System.out.println(false);
	}
	
	if (map.containsKey("Orange")){
	  System.out.println(true);
	}else {
	  System.out.println(false);
	}
	
	
	
  }
  
  
}
