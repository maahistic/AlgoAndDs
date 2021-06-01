package com.learning.challenges;

import java.util.Arrays;
import java.util.Scanner;

public class InfyAss5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int[] numbers = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();  
		Arrays.sort(numbers);
		int total = 0;
		int x = 0 ;
		for (int max = numbers.length-1 ; max>1; max-=2)
		{
			total = numbers[max];
			x++;
		}
		int round = (x & 1)==0 ? (numbers[0]+numbers[1])*x : ((numbers[0]+numbers[1])*(x-1))+numbers[0] ; 
		System.out.println((numbers[1]*2)+round+total);
	}

}
