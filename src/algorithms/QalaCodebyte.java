package algorithms;

public class QalaCodebyte {

	public static void main(String[] args) {
		System.out.println(replaceEveryThirdCharacter(StringChallenge("I Love Code")));
	}

	public static String StringChallenge(String str) {
		// code goes here
		String challengeToken = "vu3rqkp4a8d";
		if (str == null || str.isEmpty()) {
			return challengeToken;
		}

		StringBuilder reversedStr = new StringBuilder("");

		for (int i = str.length() - 1; i >= 0; i--) {

			reversedStr.append(str.charAt(i));

		}

		return reversedStr.toString() + challengeToken;
	}

	private static String replaceEveryThirdCharacter(String str) {
		int count = 1;
		StringBuilder builderStr = new StringBuilder(str);
		for (int i = 0; i < str.length(); i++) {
			if (count == 3) { 
				
				builderStr.setCharAt(i, 'X');
				
				count = 0;
			}
			count++;
		}
		return builderStr.toString();
	}
}
