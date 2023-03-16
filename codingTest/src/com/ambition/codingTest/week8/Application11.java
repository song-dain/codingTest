package com.ambition.codingTest.week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Application11 {

	public static void main(String[] args) throws IOException {
		
		// 백준 나이 구하기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int by = Integer.parseInt(st.nextToken());
		int bm = Integer.parseInt(st.nextToken());
		int bd = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int sy = Integer.parseInt(st.nextToken());
		int sm = Integer.parseInt(st.nextToken());
		int sd = Integer.parseInt(st.nextToken());
		
		int age = sy - by;
		
		// 만나이
		if(by == sy) {
			System.out.println(age);
		} else {
			if(bm > sm) {
				System.out.println(age - 1);
			} else if(bm == sm) {
				if(bd <= sd) {
					System.out.println(age);
				} else {
					System.out.println(age - 1);
				}
			} else {
				System.out.println(age);
			}
		}
		
		// 세는 나이
		System.out.println(age + 1);
		
		// 연 나이
		System.out.println(age);
		
		br.close();

	}

}
