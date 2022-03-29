package algorithms;

public class NonRepeatedString {

	public static void main(String[] args) {
		System.out.println(nonRepeatedChar("asubsebusapd"));
		System.out.println(nonRepeatedChar("aabbcc"));
		System.out.println(nonRepeatedChar("aagcdefccb"));
	}

	private static String nonRepeatedChar(String s) {
		String result = "0";
		if(s == null || s.isEmpty())
			return result;
		
		int sLength = s.length();
		if(sLength <= 2)
			return String.valueOf(s.charAt(0));
		
		StringBuilder visited = new StringBuilder();
		for(int i = 0; i < sLength; i++) {
			String currentChar = String.valueOf(s.charAt(i));
			if(!visited.toString().contains(currentChar)) {
				visited.append(currentChar);
				
				
				int lastIdx = s.lastIndexOf(currentChar);
				if(lastIdx == i)
					return currentChar;
			}
		}
		return result;
	}
}
