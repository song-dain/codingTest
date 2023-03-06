package com.ambition.codingTest;

public class Week7 {

	public static void main(String[] args) {
		
		System.out.println("프로그래머스 문제");
		
		long number = 12345;
		
		long reverse = number;
		int k = 0;

		
		// 먼저 입력받은 number의 길이를 알아봄(변수 k에 넣음)
		while(number > 0) {
			k++;
			number = number/10;
		}
		
		int arr[] = new int[k];
		
		for(int i = 0; i < k; i++) {
			arr[i] = (int)reverse%10;
			reverse /=10;
		}
		
		for(int num : arr) {
			System.out.print(num + " ");
		}
		
		
		
		

	}

}
