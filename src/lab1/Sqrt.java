package lab1;

public class Sqrt {
	public static double sqrt(double a) {
		if (a < 0 || Double.isNaN(a) || a == Double.NEGATIVE_INFINITY || a == Double.POSITIVE_INFINITY) { // Changed a == Double.NaN to Double.isNaN(a)			
			return 0;
		}
		return Math.sqrt(a);
	}
} 

// http://stackoverflow.com/questions/15493094/eclemma-says-1-of-4-branches-not-covered-but-which-branch-is-it