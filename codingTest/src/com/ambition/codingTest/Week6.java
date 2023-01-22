package com.ambition.codingTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Week6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 5. 1~12 정숫값을 읽어 해당 계절 표시하기.
		
		System.out.print("몇 월입니까? : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 12 : case 1 : case 2 : System.out.println("겨울"); break;
		case 3 : case 4 : case 5 : System.out.println("봄"); break;
		case 6 : case 7 : case 8 : System.out.println("여름"); break;
		case 9 : case 10 : case 11 : System.out.println("가을"); break;
		default : System.out.println("잘못 입력하셨습니다."); break;
		
		}
		
		
		// 4. 0이면 가위, 1이면 바위 2면 보 표시하기.
		System.out.print("0, 1, 2 중 하나를 입력 : ");
		
		int num = sc.nextInt();
		String answer = "";
		
		switch(num) {
		case 0 : answer = "가위"; break;
		case 1 : answer = "바위"; break;
		case 2 : answer = "가위"; break;
		default : System.out.println("0, 1, 2 중 하나를 입력해야 합니다."); break;
		}
		
		System.out.print("컴퓨터가 낸 것 : " + answer);
		
		System.out.println();
		
		// 3. 3개의 정숫값을 오름차순으로 정렬하기.
		System.out.print("첫 번째 숫자 입력 : ");
		int a3 = sc.nextInt();
		
		System.out.print("두 번째 숫자 입력 : ");
		int b3 = sc.nextInt();
		
		System.out.print("세 번째 숫자 입력 : ");
		int c3 = sc.nextInt();
		
		Integer sort[] = {a3, b3, c3};
		
		Arrays.sort(sort, Collections.reverseOrder());
		
		a3 = sort[0]; b3 = sort[1]; c3 = sort[2];
		
		System.out.println("변수 a는 " + a3 + "입니다.");
		System.out.println("변수 b는 " + b3 + "입니다.");
		System.out.println("변수 c는 " + c3 + "입니다.");
		
		// 2. 두 정숫값을 큰 순으로 정렬하기.
		System.out.print("첫 번째 숫자 입력 : ");
		int one = sc.nextInt();
		
		System.out.print("두 번째 숫자 입력 : ");
		int two = sc.nextInt();

		if(one <= two) {
			int temp = one;
			one = two;
			two = temp;
		}
		
		System.out.println("one >= two가 되도록 정렬했습니다.");
		System.out.println("one " + one);
		System.out.println("two " + two);
		
		
		// 1. 두 정숫값 중 큰 값 작은 값 표시하기.
		
		System.out.print("첫 번째 숫자 입력 : ");
		int a = sc.nextInt();
		
		System.out.print("두 번째 숫자 입력 : ");
		int b = sc.nextInt();
		
		if(a == b) {
			System.out.println("두 수의 값이 같습니다.");
		} else {
			int max = Math.max(a, b);
			int min = Math.min(a, b);
			
			System.out.println("두 수 중 큰 값은 " + max + "입니다.");
			System.out.println("두 수 중 작은 값은 " + min + "입니다.");
		}
		
		
		
		
		
		
		

	}

}
