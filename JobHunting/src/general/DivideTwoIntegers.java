package general;

public class DivideTwoIntegers {
	// Divide two integers without using multiplication, division and mod operator.
	
	
//	http://blog.csdn.net/linhuanmars/article/details/20024907
	
//	use pow of 2 to deal with it.
	public int divide(int dividend, int divisor) {
		if (divisor == 0)
			return Integer.MAX_VALUE;
		int res = 0;
		if (dividend == Integer.MIN_VALUE) {
			res = 1;
			dividend += Math.abs(divisor);
		}
		if (divisor == Integer.MIN_VALUE)
			return res;
		boolean isNeg = ((dividend ^ divisor) >>> 31 == 1);
		dividend = Math.abs(dividend);
		divisor = Math.abs(divisor);
		int digit = 0;
		while (divisor <= (dividend >> 1)) {
			divisor <<= 1;
			digit++;
		}
		while (digit >= 0) {
			if (dividend >= divisor) {
				dividend -= divisor;
				res += 1 << digit;
			}
			divisor >>= 1;
			digit--;
		}
		return isNeg ? -res : res;
	}
}
