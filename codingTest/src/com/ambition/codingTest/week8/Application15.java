package com.ambition.codingTest.week8;

import java.util.Scanner;

public class Application15 {

	public static void main(String[] args) {
		
		// 백준 11586 지영 공주님의 마법 거울
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 몇 줄 출력인지 입력받기
		sc.nextLine();
		String[] sArr = new String[n]; // 배열 크기로 지정
		
		for(int i = 0; i < sArr.length; i++) {
			sArr[i] = sc.nextLine(); // 배열에 값을 넣어준다
		}
		
		int mind = sc.nextInt(); // 번호 1~3
		sc.nextLine();
		
		switch(mind) {
		
		case 1 : // 그대로 출력
			for(int i = 0; i < sArr.length; i++) {
				System.out.println(sArr[i]);
			} break;
		case 2 : // 좌우반전 출력
			for(int i = 0; i < sArr.length; i++) {
				StringBuilder sb = new StringBuilder();
				System.out.println(sb.append(sArr[i]).reverse().toString());
			}
		case 3 : // 역순 출력
			for(int i = sArr.length - 1; i >= 0; i--) {
				System.out.println(sArr[i]);
			}
		}
		

	}

}
