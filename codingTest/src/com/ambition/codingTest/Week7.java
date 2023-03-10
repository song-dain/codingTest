package com.ambition.codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Week7 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		
		
		// 백준 4458 	========================
		
		// 줄의 수 입력받기
		System.out.print("줄의 수 입력 : ");
		int num9 = Integer.parseInt(br.readLine());
		
		for(int i = 0; i <= num9; i++) {
			String str9 = br.readLine();
			
			// 첫번째 글자를 잘라 대문자로 만들고, 첫 번째 이후 ~ 끝까지 글자를 잘라 합친다
			System.out.println((str9.substring(0, 1)).toUpperCase() + str9.substring(1));
		}
		
		
		
		// 백준 3046 	========================
		
		// R2 구하기, S는 R1과 R2의 평균 값이다
		
		System.out.print("R1 입력 : ");
		int r1 = sc.nextInt();
		
		System.out.println("S 입력 : ");
		int s = sc.nextInt();
		
		// 평균에 2를 곱하고 R1을 빼면 R2가 나온다
		System.out.println(s * 2 - r1);
		
		
		
		// 백준 2953 ========================
		
		Map<Integer, Integer> map = new HashMap<>();
		
		// 몇 번째 사람인지, 평가 점수 합계를 map에 저장한다
		for(int i = 0; i <= 5; i++) {
			
			// 다음 턴에서 0으로 초기화
			int sum = 0;
			
			for(int j = 0; j < 4; j++) {
				sum += sc.nextInt();
			}
			
			map.put(i, sum);
		}
		
		// 키 값만 저장
		List<Integer> keySetList = new ArrayList<Integer>(map.keySet());
		
		// Collections sort 기능을 이용해 내림차순 정렬함 (참고 : https://hianna.tistory.com/569)
		Collections.sort(keySetList, Collections.reverseOrder());
		
		// 가장 첫 번째 키와 값 출력
		System.out.println(keySetList.get(0) + " " + map.get(keySetList.get(0)));
		
		
		
		// 백준 2947 ========================
		
		int twig[] = new int[5];
		
		// 5개의 숫자를 입력받는다
		System.out.println("다섯 개 숫자 입력 : ");
		for(int i = 0; i < 5; i++) {
			twig[i] = sc.nextInt();
		}
		
		// 정렬한다 받은 숫자가 5개이므로 5번 돌린다
		for(int j = 0; j < 5; j++) {
			for(int i = 0; i < 4; i++) {
				
				// 앞의 자리보다 큰 숫자라면 임시 변수에 담아 자릿수를 교한한다
				if(twig[i] > twig[i + 1]) {
					int temp = twig[i];
					twig[i] = twig[i + 1];
					twig[i + 1] = temp;
					
					// 현재 위치를 출력한다
					for(int tw : twig) {
						System.out.print(tw + " ");
					}
					
					System.out.println();
				}
			}
		}
		
		
		
		// 백준 2857 ========================
		
		// 5개의 암호명을 넣을 문자열 배열, 결과를 넣을 문자열, 요원이 있는지 없는지 확인할 불리언 변수 선언
		String strArr2[] = new String[5];
		StringBuilder sb2 = new StringBuilder();
		boolean checked = false;
		
		while(true) {
			
			System.out.print("요원명 입력 : ");
			
			for(int i = 0; i < 5; i++) {
				
				strArr2[i] = sc.nextLine();
				
				// 요원이 있을 경우 true로 변환하고 몇 번째인지 저장함
				if(strArr2[i].contains("FBI")) {
					checked = true;
					sb2.append(i + 1 + " "); 
				}
			}
			
			// 요원이 있을 경우와 없을 경우를 나누어 출력
			if(checked == true) {
				System.out.println(sb2); break;
			} else {
				System.out.println("HE GOT AWAY!"); break;
			}
			
		}
		
		
		
		// 백준 2438 ========================
		// 별찍기
		
		System.out.print("2438 숫자 입력 : ");
		int col = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		
		for(int i = 0; i < col; i++) {
			sb.append("*");
			System.out.println(sb);
		}
		
		
		
		// 백준 2386 ======================== (모르겠다!)
		
        while (true) {
        	
        	System.out.print("2386 문자열 입력 : ");
            String inputStr = br.readLine();
            if (inputStr.equals("#")) {
                break;
            }
            
            // 문자열을 토큰으로 저장, 첫 번째 문자를 가져옴
            StringTokenizer st3 = new StringTokenizer(inputStr, " ");
            char givenLetter = st3.nextToken().charAt(0);

            String str = "";

            while (st3.hasMoreTokens()) {
                str += st3.nextToken();
            }

            System.out.println(givenLetter + " " + countCharInStr(givenLetter, str));
        }
		
		
		
        // 백준 1834 ========================
        
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
		StringTokenizer st0 = new StringTokenizer(br.readLine(), " ");
		System.out.println(st0.countTokens());
		
		
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
	
    private static int countCharInStr(char givenLetter, String str) {
        int count = 0;
        for (char letter : str.toLowerCase().toCharArray()) {
            if (letter == givenLetter) {
                count++;
            }
        }
        return count;
    }

}


