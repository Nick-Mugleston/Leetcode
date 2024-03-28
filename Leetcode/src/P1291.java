import java.util.ArrayList;
import java.util.List;

public class P1291 {

	public static void main(String[] args) {
		System.out.println(sequentialDigits(1000, 13000));
	}

	public static List<Integer> sequentialDigits(int low, int high) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		int seq = 123456789;
		int l = 0;
		loop:
			while(l <= (int)(Math.log10(high)+1)) {
				l = (int)(Math.log10(low)+1);
				for(int i = (int)(low/(Math.pow(10, l-1))); i<= 10-l; i++) {
					int x = (int)(seq%(Math.pow(10, 10-i))/(Math.pow(10, 10-l-i)));
					if(x < low)
						continue;
					else if(x < high)
						a.add(x);
					else
						break loop;
				}
				low = (int)Math.pow(10, l);
			}
		return a;
	}
}
