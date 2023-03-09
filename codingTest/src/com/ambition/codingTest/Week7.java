package com.ambition.codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Week7 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		// 백준 1371 ========================
		
		int alph[] = new int[26];
		
		while(sc.hasNextLine()) {
			
			String str = sc.nextLine();
			
			for(int i = 0; i < str.length(); i++) {
				// 알파벳 범위에 있을 경우
				if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
					alph[str.charAt(i) - 'a']++;
				}
			}
			
		}
		
		int max = 0;
		for(int i = 0; i < 26; i++) {
			if(max < alph[i]){
				max = alph[i];
			}
		}
		
		for(int i = 0; i < 26; i++) {
			if(max == alph[i]) {
				System.out.println((char) (i + 'a'));
			}
		}
		
		
		// 백준 1259 ========================
		
		
		
		while(true) {
			
			System.out.print("숫자 입력 : ");
			String str2 = br.readLine();
			boolean check = true;
			
			// 0을 입력하면 종료
			if(str2.equals("0")) break;
			
			// 숫자를 반으로 나누어 맨앞자리와 맨뒤를 돌며 비교
			for(int i = 0; i < str2.length()/2; i++) {
				if(str2.charAt(i) != str2.charAt(str2.length() -1 -i)) check = false;
			}
			
			if(check) System.out.println("yes");
			else System.out.println("no");
		}
		
		
		
		// 백준 1152 ========================
		
		System.out.print("문자열 입력: ");
		
		// StringTokenizer로 공백을 통해 분리하여 토큰에 저장 후 토큰 세기
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		System.out.println(st.countTokens());
		
		
		// 다른 풀이
		
		int count = 0;
		int pre_str = 32; // 공백을 의미
		int str;
		
		while(true) {
			
			// 문자를 아스키코드로(정수형으로) 입력받기
			str = System.in.read();
			
			// 입력받은 문자가 공백일 때
			if(str == 32) {
				// 이전 문자가 공백이 아니면
				if(pre_str != 32) count++;
			}
			
			// 입력받은 문자가 개행일 때
			else if(str == 10) {
				// 이전의 문자가 공백이 아니면
				if(pre_str != 32) count++;
				break;
			}
			
			pre_str = str;
			
		}
		
		System.out.println(count);
		
		
		
		// 프로그래머스 =======================
		
		System.out.print("숫자 입력: ");
		long number = sc.nextLong();
		
		int reverse = (int) number;
		int k = 0;

		
		// 먼저 입력받은 number의 길이를 변수 k에 넣는 작업
		while(number > 0) {
			k++;
			number = number/10;
		}
		
		int arr[] = new int[k];
		
		
		// 끝자리 수가 나머지가 되어 가져올 수 있음
		for(int i = 0; i < k; i++) {
			arr[i] = reverse%10;
			reverse /=10;
		}
		
		// 출력
		for(int num : arr) {
			System.out.print(num + " ");
		}
		
		
		sc.close();
		

	}

}
