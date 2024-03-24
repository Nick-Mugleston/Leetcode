
public class P2485 {

	public static void main(String[] args) {
		System.out.println(pivotInteger(4));
	}
	
	public static int pivotInteger(int n) {
		return (int)(Math.sqrt((n*n+n)/2)%1 == 0?Math.sqrt((n*n+n)/2):-1);
	}
}
