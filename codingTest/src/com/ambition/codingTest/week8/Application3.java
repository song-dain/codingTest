package com.ambition.codingTest.week8;

import java.util.Arrays;
import java.util.Scanner;

public class Application3 {

	public static void main(String[] args) {
		
		// 백준 7510 고급수학
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실행됨");
		
		// 출력횟수와 세 변의 길이를 입력받을 배열 선언
		int num = sc.nextInt();
		sc.nextLine();
		int iarr[] = new int[3];
		
		// 값 입력받기
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < iarr.length; j++) {
				iarr[j] = sc.nextInt();
			}
			
			// 정렬한다 (빗변이 인덱스2)
			Arrays.sort(iarr);
			System.out.print("Scenario #" + (i + 1) + " : ");
			
			// 피타고라스의 정리를 이용하여 결과 값 출력
			// (직삼각형은 빗변 제외 두 변의 제곱을 더한 값은 빗변의 제곱과 같음)
			System.out.print(Math.pow(iarr[0], 2) + Math.pow(iarr[1], 2) == Math.pow(iarr[2], 2) ? "Yes" : "No");
		
			sc.close();
		}
		
	}

}
