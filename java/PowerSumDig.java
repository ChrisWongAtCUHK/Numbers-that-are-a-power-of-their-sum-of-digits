import java.util.ArrayList;
import java.util.Comparator;

public class PowerSumDig {

	public static long powerSumDigTerm(int n) {
		ArrayList<Long> a = new ArrayList<>();

		// Project Euler 119
		for(int b = 2; b <= 100; b++){
			long p = b;
			for(int e = 2; e <= 10; e++){
				p *= b;
				if(sumDig(p) == b)	
					a.add(p);
			}
		}
		
		// sort by ascending
		a.sort(new Comparator<Long>() {
	        @Override
	        public int compare(Long l2, Long l1)
	        {

	            return  l2.compareTo(l1);
	        }
	    });
		return a.get(n - 1);
	}
	
	/**
	 * Get the sum of the digits
	 * @param value
	 * @return
	 */
	public static int sumDig(long value){
		int sum = 0;
		do {
			sum += value % 10;
			value /= 10;
		} while(value > 0);
		
		return sum;
	}
}