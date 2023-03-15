package com.ambition.codingTest.week8;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Application4 {

	public static void main(String[] args) throws IOException {
		
		
		// 백준 9076 점수집계
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); sc.nextLine();
		int score[] = new int[5];
		
		for(int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
		}
		
		Arrays.sort(score);
		
		if(score[3] - score[1] >= 4) {
			System.out.println("KIN");
		} else {
			System.out.println(score[1] + score[2] + score[3]);
		}
		
		sc.close();

	}

}
