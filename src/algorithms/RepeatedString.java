package algorithms;

import java.util.Arrays;

public class RepeatedString {

	public static void main(String[] args) {
		String s = "aaaaaabbbbbCdAA";
		String n = "10000111";
		System.out.println(Arrays.toString(repeatedSubstring(s)));
		System.out.println(Arrays.toString(repeatedSubstringTwo(s)));
		System.out.println();
		System.out.println();
		System.out.println(Arrays.toString(repeatedSubstring(n)));
		System.out.println(Arrays.toString(repeatedSubstringTwo(n)));
		
//		System.out.println(s.split("a").length);
//		System.out.println(Arrays.toString(s.split("a")));
	}

	public static int[] repeatedSubstring(String s) {
		if (s.length() == 0)
			return new int[] { -1, 0 };
		if (s.length() == 1)
			return new int[] { 0, 1 };
		int idx = -1;
		int maxCharCount = 0;
		int count = 1;
		int i;
		for (i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				count++;
			} else {
				if (count > maxCharCount) {
					maxCharCount = count;
					idx = i - count;
				}
				count = 1;
			}
		}
		if (count > maxCharCount) {
			maxCharCount = count;
			idx = i - count;
		}
		return new int[] { idx, maxCharCount };
	}
	
	public static int[] repeatedSubstringTwo(String s) {
		if (s.length() == 0)
			return new int[] { -1, 0 };
		if (s.length() == 1)
			return new int[] { 0, 1 };
		
		int maxOccur = s.split(String.valueOf(s.charAt(0))).length;
		int idx = 0;
		for(int i = 1; i < s.length(); i++) {
			if(s.charAt(i) != s.charAt(i - 1)) {
				int currLength = s.split(String.valueOf(s.charAt(i))).length;
				if(currLength > maxOccur) {
					maxOccur = currLength;
					idx = i;
				}
			}
		}
		return new int[] {idx, maxOccur - 1};
	}
}
