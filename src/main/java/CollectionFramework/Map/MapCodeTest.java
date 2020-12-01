package CollectionFramework.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapCodeTest {
  public static void main(String[] args) {
	
	HashMap<String, String> hs = new HashMap<>();
	
	hs.put("a", "candy");
	hs.put("b", "dirt");
	hs.put("c", "meh");
//	System.out.println(mapBully(hs));
	
	System.out.println(mapShare(hs));
	
	TreeMap<String, String> ab = new TreeMap<>();
	ab.put("a", "Hi");
	ab.put("b", "There");
	System.out.println(mapAB(ab));
  }
  
  
  /*
  Modify and return the given map as follows: if the key “a” has a value,
  set the key “b” to have that value, and set the key “a” to have the value “”.
  Basically “b” is a bully, taking the value and replacing it with the empty string.

  mapBully({“a”: “candy”, “b”: “dirt”}) → {“a”: “”, “b”: “candy”}
  mapBully({“a”: “candy”}) → {“a”: “”, “b”: “candy”}
  mapBully({“a”: “candy”, “b”: “carrot”, “c”: “meh”}) → {“a”: “”, “b”: “candy”, “c”: “meh”}
   */
  
  public static HashMap<String, String> mapBully(HashMap<String, String> map) {
	if (map.containsKey("a")) {
	  map.put("b", map.get("a"));
	  map.put("a", "");
	}
	return map;
  }
  
  /*
  Code Test Two:
	Modify and return the given map as follows: if the key “a” has
	a value, set the key “b” to have that same value.
	In all cases remove the key “c”, leaving the rest of the map unchanged.

	mapShare({“a”: “aaa”, “b”: “bbb”, “c”: “ccc”}) → {“a”: “aaa”, “b”: “aaa”}
	mapShare({“b”: “xyz”, “c”: “ccc”}) → {“b”: “xyz”}
	mapShare({“a”: “aaa”, “c”: “meh”, “d”: “hi”}) → {“a”: “aaa”, “b”: “aaa”, “d”: “hi”}
   */
  
  public static HashMap<String, String> mapShare(HashMap<String, String> map) {
	
	if (map.containsKey("a")) {
	  map.put("b", map.get("a"));
	  map.remove("c");
	}
	return map;
  }
  
  /*
  Modify and return the given map as follows:
  for this problem the map may or may not contain the "a" and "b" keys.
  If both keys are present, append their 2 string values together and
  store the result under the key "ab".
	mapAB({“a”: “Hi”, “b”: “There”}) → {“a”: “Hi”, “ab”: “HiThere”, “b”: “There”}
	mapAB({“a”: “Hi”}) → {“a”: “Hi”}
	mapAB({“b”: “There”}) → {“b”: “There”}
   */
  
  public static Map<String, String> mapAB(Map<String, String> map) {
	
	if (map.containsKey("a") && map.containsKey("b")) {
	  map.put("ab", map.get("a") + map.get("b"));
	}
	return map;
  }
  
  
}
