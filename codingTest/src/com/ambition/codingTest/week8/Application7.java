package com.ambition.codingTest.week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Application7 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int work = Integer.parseInt(st.nextToken());
		int total = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int works[] = new int[work];
		
		int sum = 0;
		int cnt = 0;
		
		// 배열에 소요시간을 넣어준다
		for(int i = 0; i < works.length; i++)
			works[i] = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < works.length; i++) {
			sum += works[i];
			
			if(sum > total) break; // 더한 값이 토탈 시간보다 크면 중지
			
			cnt++; // 아니면 횟수 세기
			
		}
		
		System.out.println(cnt);
		
		br.close();
		
	}
}
