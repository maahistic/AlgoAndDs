package com.learning.challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class InfyAss7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		Integer x[] = new Integer[num];
		Integer y[] = new Integer[num];
		for(int i=0; i<num ; i++)
		{
			x[0] = scan.nextInt();
			y[0] = scan.nextInt();
		}
		int max = Collections.max(Arrays.asList(y));
		int min = Collections.min(Arrays.asList(x));
		
		for (int a = min ; a<=max ; a++)
		{
			
		}
	}

}
