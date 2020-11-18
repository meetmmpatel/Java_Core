package CollectionFramework.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntroToList {
  
  
  public static void main(String[] args) {
	
	int array[] = {23, 4, 5, 6, 7};
	System.out.println(array.length);
	//array[5] = 11;
	
	List<Integer> numbers = new ArrayList<>();
	System.out.println(numbers.size());
	
	//Add some numbers
	numbers.add(11);
	numbers.add(34);
	System.out.println(numbers);
	System.out.println(numbers.size());
	
	numbers.add(23);
	numbers.add(56);
	numbers.add(56);
	System.out.println(numbers);
	
	numbers.add(Arrays.stream(array).sum());
	System.out.println(numbers);
	System.out.println(numbers.size());
	
  }
  
  
}
