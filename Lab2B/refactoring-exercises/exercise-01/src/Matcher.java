public class Matcher {
	public boolean match(int[] expected, int[] actual, int clipLimit, int delta) {

		if (actual.length != expected.length) return false;

		for (int i = 0; i < actual.length; i++) {
			if (actual[i] > clipLimit) {
				actual[i] = clipLimit;
			} else if (Math.abs(expected[i] - actual[i]) > delta) {
				return false;
			}
		}
		return true;
	}
}