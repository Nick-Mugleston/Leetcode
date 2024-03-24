import java.util.Arrays;

public class P0452 {

	public static void main(String[] args) {
		/*int[][] points = new int[][] {
			{12, 16},
			{2, 8},
			{1, 6},
			{7, 12}
		};*/
		int[][] points = new int[][] {
			{-2147483646,-2147483645},
			{2147483646,2147483647}
		};
		
		System.out.println(findMinArrowShots(points));
		
		for(int[] n : points) {
			System.out.println(Arrays.toString(n));
		}
	}

	public static int findMinArrowShots(int[][] points) {
		Arrays.sort(points, (a, b) -> (Integer.compare(a[0], b[0])));
		int count = 0;
		int depth = 0;
		
		while(depth < points.length) {
			int i;
			int rightEdge = points[depth][1];
			for(i = 1; depth + i < points.length && points[depth+i][0] <= rightEdge; i++) {
				rightEdge = Math.min(rightEdge, points[depth+i][1]);
			}
			depth += i;
			count++;
		}
		
		return count;
	}
}
