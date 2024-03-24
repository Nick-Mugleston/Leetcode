import java.util.HashMap;

public class P0525 {

	public static void main(String[] args) {
		System.out.println(findMaxLength(new int[] {0,1,1,1,0,0}));
	}

	public static int findMaxLength(int[] nums) {
		HashMap<Integer, Integer> lookback = new HashMap<Integer, Integer>();
		int max = 0;
		int prefix = 0;
		lookback.put(0, -1);
		for(int i = 0; i < nums.length; i++) {
			prefix += nums[i]*2-1;
            if(lookback.containsKey(prefix)) {
				max = Math.max(max, i-lookback.get(prefix));
			}
			else {
				lookback.put(prefix, i);
			}
		}
		return max;
	}
}
