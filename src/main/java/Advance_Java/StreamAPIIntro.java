package Advance_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIIntro {
  
  public static void main(String[] args) {
	
	Stream<String> stringStream = Stream.of("XML", "JAVA", "C++", "HTML", "JS");
	stringStream.forEach(System.out::println);
	
	//Create Stream from ArrayList collections
	List<String> names = new ArrayList<>(Arrays.asList("Pluto", "Mars", "Jupiter", "Earth", "Sun", "Moon"));
	System.out.println(names);
	
	//Print the all planet name?
	Stream<String> printNames = names.stream();
//	printNames.forEach(System.out::println);
	
	//Print the planet name with length less then 5 ??
	Stream<String> lessThenFive = printNames.filter(str -> str.length() > 3 && str.length() < 5);
	lessThenFive.forEach(System.out::println);
	
	//map() calculate
	List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
	System.out.println(numbers);
	
	// return multiplication every number by it's self
	List<Integer> results = numbers.stream().map(num -> num * num)
			.collect(Collectors.toList());
	System.out.println(results);
	
	List<String> personNames = new ArrayList<>(Arrays.asList("William" +
			"Elijah" +
			"James" +
			"Benjamin" +
			"Lucas" +
			"Mason" +
			"Ethan" +
			"Alexander" +
			"Henry" +
			"Jacob" +
			"Michael" +
			"Daniel" +
			"Logan" +
			"Jackson" +
			"Sebastian"));
	
//	System.out.println(personNames);
	
	  List<String> namesWithAM = personNames.stream()
			  .filter(str -> str.startsWith("A") || str.startsWith("M"))
			  .collect(Collectors.toList());
	  
	  namesWithAM.forEach(System.out::println);
	
  }
  
}
