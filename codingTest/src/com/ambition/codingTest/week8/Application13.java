package com.ambition.codingTest.week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Application13 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// 백준 25191 치킨댄스를 추는 곰곰이를 본 임스 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int cnt = A/2+B;
		
		System.out.println(Math.min(N, cnt));

	}

}
