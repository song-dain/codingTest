package com.ambition.codingTest.week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application8 {
	
	public static void main(String[] args) throws IOException {
		
		// 백준 10769 행복한지 슬픈지
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		
		// 기존 길이 - 이모티콘 뺀 길이 / 3 => 이모티콘 들어간 개수 나옴
		int smile = (input.length() - input.replace(":-)", "").length()) / 3;
		int sad = (input.length() - input.replace(":-(", "").length()) / 3;

		String ret = "";
		
		if(smile == 0 && sad == 0) ret = "none";
		else if(smile > sad) ret = "happy";
		else if(smile < sad) ret = "sad";
		else ret = "unsure";
		
		System.out.println(ret);
		
		br.close();
		
	}

}
