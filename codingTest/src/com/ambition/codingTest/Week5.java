package com.ambition.codingTest;

import java.util.Scanner;

public class Week5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/* 문자열의 길이가 4 or 6이고, 숫자로만 구성되어 있는지 확인하기 */
		
		Boolean answer = true;
		
		if(b.length() != 4 && b.length() != 6) {
			answer = false;
		}
		
		for(int i = 0; i < b.length(); i++) {
			if(!Character.isDigit(b.charAt(i))) {
				answer = false;
			}
		}
		
		System.out.println(answer);

		
		/* Lv 0. 문자열 반복 출력하기 */
		
		System.out.print("반복 문자를 입력하세요. : ");
		String str = sc.nextLine();
		
		System.out.print("반복 횟수를 입력하세요 : ");
		int n = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		for(char c : str.toCharArray()) {
			sb.append((c + "").repeat(n));
		}
		
		
		System.out.println(sb.toString());
		
		
        /* Lv1. 서울에서 김서방 찾기 */
		String seoul[] = {"Song", "Kim"};
		
		String result = "";
		
		for(int i = 0; i < seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				result = "Kim은 " + i + "에 있다.";
			}
		}
		
		System.out.println(result);

	}


}
