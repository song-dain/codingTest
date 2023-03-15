package com.ambition.codingTest.week8;

import java.io.IOException;
import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) throws IOException {
		
		// 백준 4447 좋은놈 나쁜놈
		
		Scanner sc = new Scanner(System.in);

		// 숫자를 입력받는다
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < num; i++) {
		
			// 히어로 이름을 입력받고 G, B가 몇 번 나오는지 셀 변수를 선언한다
			String hero = sc.nextLine();
			int good = 0;
			int bad = 0;
			
			// 이름 길이만큼 돌리며 G, B가 몇 번 나오는지 센다
			for(int j = 0; j < hero.length(); j++) {
				
				hero.toUpperCase();
				
				if(hero.charAt(j) == 'G') good++;
				else if(hero.charAt(j) == 'B') bad++;
				
			}
			
			// 값을 비교하여 출력값을 지정해준다
			if(good > bad) System.out.println(hero + " is GOOD");
			else if (good < bad) System.out.println(hero + "is BADDY");
			else System.out.println(hero + "is NEUTRAL");
			
		}
		
		sc.close();
		
	}

}
