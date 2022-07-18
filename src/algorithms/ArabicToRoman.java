package algorithms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ArabicToRoman {
	
	public static void main(String[] args) {
		System.out.println(intToRoman(67));
	}

	private static Map<Integer, String> romanStringMap = new LinkedHashMap<>();
    private static  void initMap() {
        romanStringMap.put(1000, "M");
        romanStringMap.put(900, "CM");
        romanStringMap.put(500, "D");
        romanStringMap.put(400, "CD");
        romanStringMap.put(100, "C");
        romanStringMap.put(90, "XC");
        romanStringMap.put(50, "L");
        romanStringMap.put(40, "XL");
        romanStringMap.put(10, "X");
        romanStringMap.put(9, "IX");
        romanStringMap.put(5, "V");
        romanStringMap.put(4, "IV");
        romanStringMap.put(1, "I");
    }
    
    public static String intToRoman(int num) {
        initMap();
        StringBuilder sb = new StringBuilder();
        for(Entry<Integer, String> key: romanStringMap.entrySet()) {
            while(num >= key.getKey()){
                sb.append(romanStringMap.get(key.getKey()));
                num -= key.getKey();
            }
        }
        return sb.toString();
    }	
}
