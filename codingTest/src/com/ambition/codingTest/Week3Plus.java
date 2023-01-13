package com.ambition.codingTest;

import java.util.Scanner;

public class Week3Plus {

	public static void main(String[] args) {
		
		/* 3주차 추가 문제 */
		
		Scanner sc = new Scanner(System.in);
		
		// 5. 입력한 정숫값이 10의 배수인지, 아닌지 표시
		System.out.print("5번) 정숫값을 입력하세요. : ");
		int num5 = sc.nextInt();
		
		if(num5 > 0) {
			if(num5 % 10 == 0) {
				System.out.println("이 값은 10의 배수입니다.");
			} else {
				System.out.println("이 값은 10의 배수가 아닙니다.");
			}
		} else {
			System.out.println("음의 정숫값을 입력하셨습니다.");
		}
		
		
		// 4. 입력한 정숫값이 5로 나누어 떨어지는지, 아닌지 표시
		
		System.out.print("4번) 정숫값을 입력하세요. : ");
		int num4 = sc.nextInt();
		
		if(num4 > 0) {
			if(num4 % 5 == 0) {
				System.out.println("이 값은 5로 나누어집니다.");
			} else {
				System.out.println("이 값은 5로 나누어지지 않습니다.");
			}
		} else {
			System.out.println("음의 정숫값을 입력하였습니다.");
		}

		
		// 1. 읽은 정숫값이 양수면 3으로 나눈 결과를 표시
		
		System.out.print("1번) 정숫값을 입력하세요. : ");
		
		int num = sc.nextInt();
		
		if(num > 0) {
			if(num % 3 == 0) {
				System.out.println("이 값은 3으로 나누어집니다.");
			} else if(num % 3 == 1) {
				System.out.println("이 값을 3으로 나눈 나머지는 1입니다.");
			} else {
				System.out.println("이 값을 3으로 나눈 나머지는 2입니다.");
			}
		} else {
			System.out.println("이 값은 양수가 아닙니다.");
		}
		
		
		// 2. 입력한 점수에 따라 수/우/미/양/가 판정하기.
		
		System.out.print("2번) 점수를 입력하세요. : ");
		int score = sc.nextInt();
		
		if(score != 0 && score <= 49) {
			System.out.println("가");
		} else if(score <= 59) {
			System.out.println("양");
		} else if(score <= 69) {
			System.out.println("미");
		} else if(score <= 79) {
			System.out.println("우");
		} else if(score <= 100) {
			System.out.println("수");
		} else {
			System.out.println("점수를 잘못 입력하셨습니다.");
		}
		
		
		// 3. 2개의 값 대소 비교
		System.out.print("3번) a 입력 : ");
		int a = sc.nextInt();
		
		System.out.print("3번) b 입력 : ");
		int b = sc.nextInt();
		
		if(a == b) {
			System.out.println("a와 b는 같다.");
		} else if(a > b) {
			System.out.println("a가 크다.");
		} else if(a < b) {
			System.out.println("b가 크다.");
		}

	}

}
