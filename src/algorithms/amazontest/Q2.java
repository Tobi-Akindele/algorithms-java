package algorithms.amazontest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q2 {
	
	public static int getMaxFreqDeviation(String s) {
		
		Map<String, Integer> resultMap = new HashMap<>();
		Set<String> distinctSubstrings = distinctSubstring(s);
		
		for(String k: distinctSubstrings) {
			resultMap.put(k, findMaxDevivation(k));
		}
		
		final Integer[] maxCount = { 0 };
		for (Map.Entry<String, Integer> entry : resultMap.entrySet()) {
			Integer value = entry.getValue();
			if (value > maxCount[0]) {
				maxCount[0] = value;
			}
			
		}
		
		return maxCount[0];
	}
	
	public static Set<String> distinctSubstring(String str)
    {
        // Put all distinct substring in a HashSet
        Set<String> result = new HashSet<>();
 
        // List All Substrings
        for (int i = 0; i <= str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                result.add(str.substring(i, j));
            }
        }
 
        return result;
    }
	
	public static int findMaxDevivation(String s) {

		if (s.length() == 1)
			return 0;

		Map<String, Integer> letters = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			String letter = String.valueOf(s.charAt(i));
			if (letters.containsKey(letter)) {
				Integer count = letters.get(letter) + 1;
				letters.put(letter, count);
			} else {
				letters.put(letter, 1);
			}
		}

		final Integer[] mostCount = { 0 };
		final Integer[] secondMost = { Integer.MAX_VALUE };
		// Check the keys for the two most frequency of letters

		for (Map.Entry<String, Integer> entry : letters.entrySet()) {
			Integer value = entry.getValue();
			if (value > mostCount[0]) {
				mostCount[0] = value;
			}
			
		}
		
		for (Map.Entry<String, Integer> entry : letters.entrySet()) {
			Integer value = entry.getValue();
			
			if (value < secondMost[0]) {
				secondMost[0] = value;
			}
		}
		return mostCount[0] - secondMost[0];
	}

	public static void main(String[] args) {

		String s = "bbacccabab";
		String s2 = "aaaaa";
		System.out.println(getMaxFreqDeviation(s));
		System.out.println(getMaxFreqDeviation(s2));
		

	}
}
