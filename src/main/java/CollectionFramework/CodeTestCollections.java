package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CodeTestCollections {
  
  public static void main(String[] args) {
	checkValue();
	System.out.println(Arrays.toString(setToArray()));
  }
  
  /*
   Check if element(value) if in the set or not?
   .contains()
   */
  public static void checkValue() {
	HashSet<Integer> hs = new HashSet<Integer>();
	// add elements to HashSet object
	hs.add(3);
	hs.add(17);
	hs.add(6);
	hs.add(9);
	hs.add(7);
	
	
	//... check set if retur true if no = 7 is there else return false/
	if (hs.contains(7)) {
	  System.out.println(true);
	} else {
	  System.out.println(false);
	}
	
	hs.remove(7);
	
  }
  
  //covert hashset into an array
  
  public static int[] setToArray() {
	List<Integer> hs = new ArrayList<>();
	// add elements to HashSet object
	hs.add(3);
	hs.add(17);
	hs.add(6);
	hs.add(9);
	hs.add(7);
	
	int[] arrOne = new int[hs.size()];
	
  	for (int i = 0; i < hs.size(); i++) {
	  arrOne[i] = hs.get(i);
	}
	
	return arrOne;
	
  }
  
}
