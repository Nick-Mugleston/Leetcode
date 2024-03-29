import java.util.ArrayList;
import java.util.List;

public class P1291 {

	public static void main(String[] args) {
		System.out.println(sequentialDigits(1000, 13000));
	}

	public static List<Integer> sequentialDigits(int low, int high) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		int seq = 123456789;
		int l = (int)Math.log10(low)+1;
		int h = (int)Math.log10(high)+1;
		while(l <= h) {
			int front = 1, back = 1;
			for(int i = 0; i < 9-l; i++) {
				front *= 10;
			}
			for(int i = 0; i < l; i++) {
				back *= 10;
			}
			for(int i = 0; i <= 9-l; i++) {
				int n = (seq/front)%back;
				if(n >= low && n <= high) {
					a.add(n);
				}
				else if(n > high) {
					return a;
				}
				front /= 10;
			}
			l++;
		}
		return a;
	}
}
