package com.ambition.codingTest;

import java.util.Scanner;

public class Week4 {

	public static void main(String[] args) {
		
		/* 4주차 문제 */
		
		String one = new String("one");
		String two = new String("one");
		
		System.out.println(one == two);
		
		Scanner sc = new Scanner(System.in);
		
		// 5. 키보드에서 입력한 정숫값 3개 중 중간값 구하기.
		System.out.print("정숫값 A를 입력하세요. : ");
		int numA = sc.nextInt();
		
		System.out.print("정숫값 B를 입력하세요. : ");
		int numB = sc.nextInt();
		
		System.out.print("정숫값 C를 입력하세요. : ");
		int numC = sc.nextInt();
		
		char mid = 'C';
		
		if(numA > numB) {
			
			 if(numB > numC) {
				 mid = 'B';
			 } else if(numA < numC) {
				 mid = 'A';
			 } else {
				 mid = 'C';
			 }
			 
		} else if(numA > numC) {
			mid = 'A';
		} else if(numB > numC) {
			mid = 'C';
		} else {
			mid = 'B';
		}
		
		System.out.println("중앙값은 " + mid + "입니다.");
		
		
		
		// 4. 키보드에서 입력한 정숫값 3개 중 최솟값 구하기.
		System.out.print("정숫값 A를 입력하세요. : ");
		int num4A = sc.nextInt();
		
		System.out.print("정숫값 B를 입력하세요. : ");
		int num4B = sc.nextInt();
		
		System.out.print("정숫값 C를 입력하세요. : ");
		int num4C = sc.nextInt();
		
		String minNum = (num4A > num4B) ? ((num4B > num4C) ? "최솟값은 C입니다." : "최솟값은 B입니다.") : "최솟값은 A입니다.";
		
		System.out.println(minNum);
		
		// 3. 2개 정숫값의 차가 10 이하인지, 아닌지 표시하기.
		System.out.print("정숫값 A를 입력하세요. : ");
		int num3A = sc.nextInt();
		
		System.out.print("정숫값 B를 입력하세요. : ");
		int num3B = sc.nextInt();
		
		if(Math.max(num3A, num3B) - Math.min(num3A, num3B) <= 10) {
			System.out.println("두 값의 차는 10 이하입니다.");
		} else {
			System.out.println("두 값의 차는 11 이상입니다.");
		}
		
		
		// 2. 2개 정숫값의 차 표시하기.
		System.out.print("정숫값 A를 입력하세요. : ");
		int num2A = sc.nextInt();
		
		System.out.print("정숫값 B를 입력하세요. : ");
		int num2B = sc.nextInt();
		
		int result = Math.max(num2A, num2B);
		
		System.out.println("두 값의 차는 " + result + "입니다.");
		
		
		// 1. 2개의 실숫값 중에서 큰 값 표시하기.
		
		System.out.print("실숫값 A를 입력하세요. : ");
		double num1A = sc.nextDouble();
		
		System.out.print("실숫값 B를 입력하세요. : ");
		double num1B = sc.nextDouble();
		
		char maxNum = num1A > num1B ? 'A' : 'B';
		
		System.out.println("최대값은 " + maxNum + "입니다.");

	}

}
