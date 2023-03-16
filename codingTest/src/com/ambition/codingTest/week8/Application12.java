package com.ambition.codingTest.week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Application12 {

	public static void main(String[] args) throws IOException {
		
		// 백준 스네이크버드
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int arr[] = new int[N];
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 과일의 높이를 정렬한다
		Arrays.sort(arr);
		
		// 과일의 높이와 스네이크버드의 길이를 비교한다
		for(int i = 0; i < N; i++) {
			if(arr[i] > L) {
				break;
			}
			L++;
		}

		System.out.println(L);
		
		br.close();

	}

}
