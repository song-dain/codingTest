package com.ambition.codingTest.week8;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Application2 {
	
	public static void main(String[] args) {
		
		// 백준 5597 과제 안 내신 분..?
		
		Scanner sc = new Scanner(System.in);
		
		// 30명인데 0부터 세기 때문에 길이를 31로 하고 0에 true를 넣어주었다
		boolean iarr[] = new boolean[31];
		iarr[0] = true;
		
		// 낸 숫자는 true로 값을 넣어준다
		for(int i = 0; i < 28; i++) {
			iarr[sc.nextInt()] = true;
		}
		
		// 값이 false인 인덱스만 출력한다
		for(int i = 0; i < iarr.length; i++) {
			if(!iarr[i]) {
				System.out.println(i);
			}
		}
		
		
		
	}

}
