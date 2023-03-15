package com.ambition.codingTest.week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Application10 {

	public static void main(String[] args) throws IOException {
		
		// 백준 16171 나는 친구가 적다 (Small)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String find = br.readLine();
		
		// 정규식을 이용해 문자+숫자 문자열에서 문자만 추출한다
		String regex = "[^a-zA-Z]";
		String str = input.replaceAll(regex, "");
		
		if(str.contains(find)) System.out.println(1);
		else System.out.println(0);
		

	}

}
