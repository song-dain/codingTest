package com.ambition.codingTest.week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Application5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// 백준 9094 수학적 호기심
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= num; i++) {
			
			// 두 수를 한 번에 입력받고 토큰에 저장하고 각 n, m 변수에 넣어준다
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int cnt = 0;
			
			// 0 < a < b < n
			for(int a = 1; a < n; a++) {
				for(int b = (a+1); b < n; b++) {
					// (a2+b2+m)/(ab) 가 정수다 == 몫이 0이다
					if(((a * a) + (b * b) + m) % (a * b) == 0) {
						cnt++;
					}
				}
			}
			
			System.out.println(cnt);
			br.close();
		}

	}

}
