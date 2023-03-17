package com.ambition.codingTest.week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application16 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// 백준 2748 피보나치 수 2
		// 피보나치 수 - 첫째 및 둘째 항이 1이며 그 뒤의 모든 항은 바로 앞 두 항의 합인 수열
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		// 0(f1) 1(f2) 1(sum) 2 3 ... 으로 초기화한다
		long sum = 1;
		long f1 = 0;
		long f2 = 1;
		
		// n만큼 반복문을 돌리면 됨
		for(int i = 1; i < n; i++) {
			sum = f1 + f2;
			f1 = f2;
			f2 = sum;	
		}
		
		System.out.println(sum);

	}

	
}
