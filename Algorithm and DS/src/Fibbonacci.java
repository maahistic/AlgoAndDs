
public class Fibbonacci {

	public static int total = 0;
	public static void main(String[] args) {
		System.out.println(fib(9));

	}

	/**
	 * @param i
	 * @return
	 */
	static int fib(int i) {
		if (i<=1)
			return 1;
		return total +=fib(i-1) + fib(i-2);
	}

}
