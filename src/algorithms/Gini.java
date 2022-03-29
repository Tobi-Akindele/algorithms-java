package algorithms;

import java.util.HashMap;
import java.util.Map;

public class Gini {

	public static void main(String[] args) {
//		String s1 = "Gini, Free your life";
//		String s2 = new String(s1);
//		System.out.println((s1 == s2) + " " + s1.equals(s2));
//
//		List<String> myList = Arrays.asList("a1", "d2", "b1", "c2", "c1");
//
//		myList.stream().filter(s -> s.startsWith("c")).map(String::toUpperCase).sorted().forEach(System.out::println);

		Map<String, Integer> movies = new HashMap<>();
		
		movies.put("Green Mile", 1999);
		movies.put("Gladiator", 2000);
		movies.put("Intersellar", 2014);
		
		movies.entrySet().removeIf(entry -> entry.getValue() > 2000);
		
		System.out.println(movies);
	}
}
