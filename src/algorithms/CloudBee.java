package algorithms;

public class CloudBee {

	public static void main(String[] args) {

		CloudBee c = new CloudBee();
//		System.out.println(c.solution(new int[] { 1, 1000, 80, -91 }));
//		System.out.println(c.solution(new int[] { 47, 1900, 1, 90, 45 }));
		
		
		System.out.println(c.solution(new int[] {1,1,2,3,3}, 3));
		
		System.out.println(c.solution(new int[] {1,1,3}, 2));

	}

	public int solution(int[] A) {
		int sum = 0;

		if (A.length > 100000)
			return sum;

		for (int i = 0; i < A.length; i++) {
			if (isTwoDigit(A[i])) {
				sum += A[i];
			}
		}
		return sum;
	}

	private boolean isTwoDigit(int number) {
		return (number > 9 && number < 100) || (number < -9 && number > -100);
	}

	public boolean solution(int[] A, int K) {
		int n = A.length;
		for (int i = 0; i < n - 1; i++) {
//			if (A[i] + 1 < A[i + 1])
//				return false;
			if((A[i] != A[i+1]) && (A[i] + 1 != A[i+1]))
				return false;
		}
		if (A[0] != 1 || A[n - 1] != K)
			return false;
		else
			return true;
	}

}
