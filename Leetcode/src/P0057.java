public class P0057 {

	public static void main(String[] args) {
		int[][] intervals = new int[][] {
			{1,2},
			{3,5},
			{6,7},
			{8,10},
			{12,16}
		};
		intervals = insert(intervals, new int[] {11,11});
	}

	public static int[][] insert(int[][] intervals, int[] newInterval) {
		int[] affectedIndecies = new int[] {-2,-2};
		for(int i = 0; i < intervals.length; i++) {
			if(affectedIndecies[0] == -2 && (newInterval[0] <= intervals[i][0] || newInterval[0] <= intervals[i][1])) {
				affectedIndecies[0] = i;
			}
			if(affectedIndecies[1] == -2) {
				if(newInterval[1] < intervals[i][0]) {
					affectedIndecies[1] = i-1;
				}
				else if(newInterval[1] <= intervals[i][1]) {
					affectedIndecies[1] = i;
				}
			}
		}
		if(affectedIndecies[0] == -2) {
			affectedIndecies[0] = intervals.length;
			affectedIndecies[1] = intervals.length-1;
		}
		else if(affectedIndecies[1] == -2) {
			affectedIndecies[1] = intervals.length-1;
		}
		int[][] newIntervals = new int[(intervals.length-(affectedIndecies[1] - affectedIndecies[0]))][2];
		int offset = 0;
		for(int i = 0; i < newIntervals.length; i++) {
			if(i < affectedIndecies[0] || i > affectedIndecies[0]) {
				newIntervals[i] = intervals[i+offset];
			}
			else if(i == affectedIndecies[0]) {
				if(affectedIndecies[1] < affectedIndecies[0]) {
					newIntervals[i] = newInterval;
					offset = -1;
					
				}
				else {
					newIntervals[i][0] = Math.min(newInterval[0], intervals[affectedIndecies[0]+offset][0]);
					newIntervals[i][1] = Math.max(newInterval[1], intervals[affectedIndecies[1]+offset][1]);
					offset = affectedIndecies[1]-affectedIndecies[0];
				}
			}
		}
		return newIntervals;
	}
}
