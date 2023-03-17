package com.ambition.codingTest.week8;

import java.util.Scanner;

public class Application17 {

	// 백준 1652 누울 자리를 찾아라
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int row = 0;
		int col = 0;
		
		int N = Integer.parseInt(sc.next());
		String[] arr = new String[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.next();
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				
				if(arr[i].charAt(j) == '.') {
					
					// 가로로 누울 수 있는 자리 찾기
					// 다음 칸이 있고, 다음 칸이 '.' 인지 확인 
					if(j+1 < N && arr[i].charAt(j + 1) == '.') {
						// 다음다음 칸이 없거나(벽), 다음다음 칸이 X(짐)인 경우
						if(j+2 >= N || (j+2 < N && arr[i].charAt(j+2) == 'X')) {
							row++; // 가로값 추가
						}
					}
					
					// 세로로 누울 수 있는 자리 찾기
					// 아래 칸이 있고, 아래 칸이 '.'인지 확인
					if(i + 1 < N && arr[i+1].charAt(j) == '.') {
						// 아래아래 칸이 없거나(벽), 아래아래 칸이 X(짐)인 경우
						if(i + 2 >= N || (i+2 < N && arr[i + 2].charAt(j) =='X')){
							col++; // 세로값 추가
						}
					}
				}
			}
			
			System.out.println(row + " " + col);
			
			sc.close();
			
		}
		

	}
}
