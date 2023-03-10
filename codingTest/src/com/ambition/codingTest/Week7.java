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
		
		// 백준 2386 ========================
		
		int ch = ' ';
		int cnt = 0;
	
		
		while(true) {
			
			
			System.out.print("문자열 입력 : ");
			String input = br.readLine();
			
			if(input.equals("#")) break;
			
			// 소문자로 바꿔서 배열에 저장한다
			String strArr[] = input.toLowerCase().split("");
			
			for(int i = 0; i < strArr.length; i++) {
				if(input.split("")[0].equals(strArr[i]))
					cnt++;
			}
			
			System.out.println(input.split("")[0] + " " + (cnt - 1));
		}
		
		
		
		// 1. N-1은 나머지와 몫이 같은 자연수 개수
		// 2. 나머지와 몫이 같은 자연수는 배수 관계 3 => (4, 8), 4 => (5, 10, 15)
		
		System.out.print("숫자 입력: ");
		
		long n = sc.nextLong();
		long sum = 0;
		
		for(long i = 1; i < n; i++) {
			sum += (n + 1) * i;
		}
		
		System.out.println(sum);
		
		
		
		// 백준 1371 ========================
		
		String input;
		int alph[] = new int[26];
		
		while((input = br.readLine()) != null) {
			for(int i = 0; i < input.length(); i++) {
				// 공백이 아닌 문자만 세어지는 조건
				if(!input.substring(i, i + 1).equals(" ")) {
					// i번째 알파벳을 아스키코드(정수형)으로 변환하여 누적함 (97 == 'a')
					alph[(int)input.substring(i, i + 1).charAt(0) - 97]++;
				}
			}
		
			// JAVA 기본 데이터 타입 중 특히 정수형으로 선언하고 
			// MIN_VALUE 혹은 MAX_VALUE를 붙여주면 그 데이터타입이 표현할 수 있는 
			// 숫자의 범위 중 가장 작은 숫자(큰 숫자로) 값이 할당됨 => 대소비교를 할 때 안전하고 편리하다
			int max = Integer.MAX_VALUE;
			
			// 최대값을 알아낸다
			for(int i = 0; i < alph.length; i++) {
				if(max < alph[i]) {
					max = alph[i];
				}
			}
			
			// 최대값을 출력한다
			for(int i = 0; i < alph.length; i++) {
				if(alph[i] == max) {
					System.out.print((char)(i + 97));
				}
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
		
		
		br.close();
		sc.close();

	}

}
