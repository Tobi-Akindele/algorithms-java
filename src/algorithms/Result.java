package algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Result {

	static final class BinRange {
		final String start;
		final String end;
		final String cardType;

		BinRange(String start, String end, String cardType) {
			this.start = start;
			this.end = end;
			this.cardType = cardType;
		}
	}

	private static HashMap<Integer, String> binCache;
	private static List<Long> rangeList;

	interface CardTypeCache {
		/**
		 * @param cardNumber 12 to 23 digit card number.
		 * @return the card type for this cardNumber or null if the card number does not
		 *         fall into any valid bin ranges.
		 */
		String get(String cardNumber);
	}

	public static CardTypeCache buildCache(List<BinRange> binRanges) {

		binCache = new HashMap<>();
		rangeList = new ArrayList<>();

		for (int i = 0; i < binRanges.size(); i++) {
			binCache.put(i, binRanges.get(i).cardType);
			rangeList.add(Long.parseLong(binRanges.get(i).start));
			rangeList.add(Long.parseLong(binRanges.get(i).end));
		}
		Collections.sort(rangeList);
		return new CardTypeCacheImpl();
	}

	static class CardTypeCacheImpl implements CardTypeCache {

		@Override
		public String get(String cardNumber) {

			Integer key = -1;
			Long cardNumberLong = Long.parseLong(cardNumber.substring(0, 12));

			int left = 0;
			int right = rangeList.size();

			while (left < right) {

				int mid = left + (right - left) / 2;

				if ((mid % 2 == 0 
						&& rangeList.get(mid) <= cardNumberLong 
						&& cardNumberLong <= rangeList.get(mid + 1))
						|| mid % 2 == 1 
								&& rangeList.get(mid - 1) <= cardNumberLong
								&& cardNumberLong <= rangeList.get(mid)) {
					key = mid / 2;
				}

				if (cardNumberLong < rangeList.get(mid)) {

					right = mid;

				} else {

					left = mid + 1;

				}
			}

			return (key != -1) ? binCache.get(key) : "null";
		}
	}

	public static void main(String[] args) {

//		BinRange visa = new BinRange("400000000000", "419999999999", "visa");
//		BinRange visaDirect = new BinRange("420008000000", "420008999999", "visadebit");
//		BinRange visa2 = new BinRange("435000000000", "435000999999", "visa");
//		BinRange mc = new BinRange("540000000000", "599999999999", "mc");

		BinRange visa = new BinRange("400000000000", "499999999999", "visa");
		BinRange mc = new BinRange("500000000000", "599999999999", "mc");
		BinRange discover = new BinRange("650000000000", "658999999999", "discover");

		List<BinRange> ranges = new ArrayList<>();
//		ranges.add(visa);
		ranges.add(visa);
		ranges.add(mc);
		ranges.add(discover);

		Result.buildCache(ranges);

		CardTypeCache ctc = new CardTypeCacheImpl();

		System.out.println(ctc.get("5555444433331111"));

	}
}
