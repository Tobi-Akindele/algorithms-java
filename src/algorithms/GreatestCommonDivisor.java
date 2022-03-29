package algorithms;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		System.out.println(GCD(1220, 516));
		System.out.println(gcd(1220, 516));
	}

	public static int GCD(int m, int n) {

		int r = m % n;
		if (r == 0) {
			return n;
		}
		m = n;
		n = r;
		
		return GCD(m, n);

	}

	static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
}
