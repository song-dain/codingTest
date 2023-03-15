package com.ambition.codingTest.week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application9 {

	public static void main(String[] args) throws IOException {
		
		// 백준 11721 열 개씩 끊어 출력하기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		for(int i = 0; i < input.length(); i++) {
			if(i != 0 && i % 10 == 0) System.out.println();
			System.out.print(input.charAt(i));
		}
		
		br.close();

	}

}
