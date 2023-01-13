package com.ambition.codingTest;

import java.util.Scanner;

public class Week2 {

	public static void main(String[] args) {
		
		/* 2주차 문제 */
		
		Scanner sc = new Scanner(System.in);
		
		// 키보드로 입력한 정수값이 음이면 "이 값은 음의 값입니다." 출력하기.
		System.out.print("3-1 ● 숫자 입력 : ");
		int num1 = sc.nextInt();
		
		if(num1 < 0) {
			System.out.println("이 값은 음의 값입니다.");
		}
		
		
		// 정수값을 읽어서 절대값 구하기
		
		System.out.print("3-2 ● 숫자 입력 : ");
		int num2 = sc.nextInt();
		
		if(num2 < 0) {
			num2 = Math.abs(num2);
		}
		
		System.out.println("절대값은 " + num2 + "입니다.");
		
		
		// 2개의 정수값을 읽어서 후자가 전자의 약수이면 "B는 A의 약수이다." 라고 표시하고 그렇지 않으면 "B는 A의 약수가 아니다." 라고 표시하기.
		
		System.out.println("3-3 ● 숫자 A 입력 : ");
		int numA = sc.nextInt();
		
		System.out.println("3-3 ● 숫자 B 입력 : ");
		int numB = sc.nextInt();
		
		if(numA % numB == 0) {
			System.out.println("B는 A의 약수이다.");
		} else {
			System.out.println("B는 A의 약수가 아니다.");
		}
		
		
		// 3-3을 논리 부정 연산자를 사용해 수정하기.
		
		System.out.println("3-4 ● 숫자 A 입력 : ");
		int numA2 = sc.nextInt();
		
		System.out.println("3-4 ● 숫자 B 입력 : ");
		int numB2 = sc.nextInt();
		
		if(numA2 % numB2 != 0) {
			System.out.println("B는 A의 약수가 아니다.");
		} else {
			System.out.println("B는 A의 약수이다.");
		}
		
		
		// 정수값을 읽어 부호(양수, 음수, 0)를 판정하기.
		
		System.out.print("3-5 ● 숫자 입력 : ");
		int num5 = sc.nextInt();
		
		if(num5 >= 1) {
			System.out.println("양수입니다.");
		} else if(num5 < 0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0입니다.");
		}
	

	}

}
