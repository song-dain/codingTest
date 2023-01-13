package com.ambition.codingTest;

import java.util.Random;
import java.util.Scanner;

public class Week1 {
	
	public static void main(String[] args) {
		
		/* 1주차 문제 */
		
		Random rd = new Random();
		
		/* 1번 */
		//한 자리 양의 정숫값 (즉, 1이상 9이하의 값)을 랜덤으로 생성해서 표시
		System.out.println("1-1 : " + ((int)(Math.random() * 9) + 1));
		
		//한 자리 음의 정숫값 (즉, -9이상 -1이하의 값)을 랜덤으로 생성해서 표시
		System.out.println("1-2 : " + ((int)(Math.random() * -9) - 1));
		
		//두 자리 양의 정숫값 (즉, 10이상 99이하의 값)을 랜덤으로 생성해서 표시
		System.out.println("1-3 : " + ((int)(Math.random() * 99) + 10));
		
		System.out.println("");
		
		/* 2번 */
		//키보드에서 입력한 정숫값을 +5 또는 -5 범위의 랜덤 정숫값을 생성하자
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		int max = num + 5;
		int min = num -5;
		
		System.out.println("2번 : " + (rd.nextInt(max) + min));
		
		
		/* 3번 */
		//0.0이상 1.0 미만의 실수값을 랜덤으로 생성해서 표시
		double num1 = Math.random() * 0.9;
		System.out.println("3-1 : " + String.format("%.1f", num1));
		
		//0.0이상 10.0 미만의 실숫값을 랜덤으로 생성해서 표시
		double num2 = Math.random() * 9.9; 
		System.out.println("3-2 : " + String.format("%.1f", num2));
		
		//-1.0이상 1.0미만의 실숫값을 랜덤으로 생성해서 표시
		double num3 = Math.random() * 1.0 - 0.1;
		System.out.println("3-3 : " + String.format("%.1f", num3));
		
		
		/* 4번 */
		//키보드로 입력한 성과 이름으로 인사하는 프로그램을 작성하자
		System.out.print("성 : ");
		String lastName = sc.nextLine();
		
		System.out.print("이름 : " );
		String firstName = sc.nextLine();
		
		System.out.println(lastName + firstName + " ㅎㅇ");
		
		
		/* 5번 */
		//입력한 주소를 표시하는 프로그램을 작성하자.
		
		System.out.print("지역 : ");
		String assress = sc.nextLine();
		
		System.out.print("동 : ");
		String detail = sc.nextLine();
		
		System.out.println("사는 곳은 " + assress + ", " + detail + " 입니다.");
		
		
		/* 6번 */
		//String 형의 변수를 문자열로 초기화하거나 변수에 문자열을 대입하는 프로그램을 작성하자.
		
		String str1 = "Hello";
		System.out.println(str1);
		
		String str2 = "world";
		System.out.println(str2);
		
	}

}
