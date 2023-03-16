package com.ambition.codingTest.week8;

import java.util.Scanner;

public class Application14 {

	public static void main(String[] args) {
		
		// 백준 14910 오르막
		
		Scanner sc = new Scanner(System.in);
		String[] nums = sc.nextLine().split(" ");
		String ret = "Good";
		
		for(int i = 0; i < nums.length - 1; i++) {
			int cur = Integer.parseInt(nums[i]);
			int pev = Integer.parseInt(nums[i+1]);
			
			if(cur > pev) {
				ret = "Bad"; break;
			}
		}
		
		System.out.println(ret);
		
		sc.close();

	}

}
