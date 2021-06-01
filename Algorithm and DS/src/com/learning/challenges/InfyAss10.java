package com.learning.challenges;

import java.util.Scanner;

public class InfyAss10 {

	public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
	        String tim = scan.nextLine();
	        String tArr[] = tim.split(":");
	        String zone = tArr[2].substring(2,4);
	        String hh = tArr[0];
	        int h = Integer.parseInt(hh);
	        if(zone.equals("AM") && h==12)
	        	hh="00";
	        else if(zone.equals("PM")&& h<12)
	        	hh= String.valueOf(h+12);
	        System.out.printf(hh+":"+tArr[1]+":"+tArr[2].substring(0,2));

	}

}
