package com.ambition.codingTest.week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// 백준 10102 개표
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int juror = Integer.parseInt(br.readLine());
		String result = br.readLine();
		
		int a = 0;
		int b = 0;
		
		for(int i = 0; i < juror; i++) {
			
			if(result.charAt(i) == 'A') a++;
			else b++;
			
		}
		
		System.out.println(Math.max(a, b) == a ? 'A' : 'B');
		br.close();
		
	}
}
