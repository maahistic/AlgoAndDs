import java.util.Arrays;
import java.util.List;

// Java program to find the equilibrium index of an array

public class sample {

	public static void main(String[] args) {
		Integer[] arr = {3,41,1,67,3,8,34,97,-1,0,0,-12,3,41,100,-8394,63,46,89,54,651};
		long start = System.nanoTime();
		Arrays.sort(arr);
		List list = Arrays.asList(arr);
		System.out.println(Arrays.binarySearch(arr, -12));
		for(Object ls : list)
			System.out.print(ls+" ");
		System.out.println(System.nanoTime()-start);
	}
}