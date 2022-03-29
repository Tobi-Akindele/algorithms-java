package algorithms;

import java.util.ArrayList;
import java.util.List;

import algorithms.Result.BinRange;

public class Adyen {

	public static void main(String[] args) {
		
		Result result = new Result();
		
		BinRange visa = new BinRange("400000000000", "419999999999", "visa");
		BinRange visaDirect = new BinRange("420008000000", "420008999999", "visadebit");
		BinRange visa2 = new BinRange("435000000000", "435000999999", "visa");
		BinRange mc = new BinRange("540000000000", "599999999999", "mc");
		
		List<BinRange> ranges = new ArrayList<>();
		ranges.add(visa);
		ranges.add(visaDirect);
		ranges.add(visa2);
		ranges.add(mc);
		
		Result.buildCache(ranges);
		
	}
}
