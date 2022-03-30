package algorithms;

public class PanagramDetector {

	public static void main(String[] args) {
		System.out.println(findMissingLetters("The quick brown fox jumps over the lazy dog"));
		System.out.println(findMissingLetters("We hates Bagginses!"));
	}

	private static String findMissingLetters(String sentence) {
		
		if(sentence == null || sentence.isEmpty())
			return "";
		sentence = sentence.toLowerCase();
		String alphabets = "abcdefghijklmnopqrstuvwxyz";
		StringBuilder visited = new StringBuilder();
		for(int i = 0; i < sentence.length(); i++) {
			if(!visited.toString().contains(String.valueOf(sentence.charAt(i)))) {
				visited.append(String.valueOf(sentence.charAt(i)));
				
				alphabets = alphabets.replaceAll(String.valueOf(sentence.charAt(i)), "");
			}
		}
		return alphabets;
	}
}
