package com.ambition.codingTest.week8;

import java.util.Scanner;

public class Application18 {

	// 백준 2816 디지털 티비

	// 1(채널아래로), 2 채널(채널위로) 3(현채널아래로내리기), 4 채널(현채널위로올리기)

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());

		String[] chs = new String[n];

		int kbs1_idx = 0;
		int kbs2_idx = 0;
		String temp = "";

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < n; i++) {
			chs[i] = sc.next();

			// kbs1, kbs2 인덱스 찾기
			if (chs[i].equals("KBS1")) {
				kbs1_idx = i;
			}

			if (chs[i].equals("KBS2")) {
				kbs2_idx = i;
			}
		}

		if (kbs1_idx < kbs2_idx) {
			// 현 kbs1 채널 번호만큼 내려가기
			for (int j = 0; j < kbs1_idx; j++) {
				result.append("1");
			}
			// 현 kbs1 채널 번호만큼 올라가기
			for (int j = 0; j < kbs1_idx; j++) {
				result.append("4");
			}
			// kbs2도 같은 방식으로 함
			for (int j = 0; j < kbs2_idx; j++) {
				result.append("1");
			}
			// kbs2는 두 번째가 되어야 하므로 한 번 덜 돌린다
			for (int j = 0; j < kbs2_idx - 1; j++) {
				result.append("4");
			}

		} else {
			// 현 kbs1 채널 번호만큼 내려가기
			for (int j = 0; j < kbs1_idx; j++) {
				result.append("1");
			}
			// 현 kbs1 채널 번호만큼 올라가기
			for (int j = 0; j < kbs1_idx; j++) {
				result.append("4");
			}
			// kbs2가 밀렸으므로 한 번 더 돌린다
			for (int j = 0; j < kbs2_idx + 1; j++) {
				result.append("1");
			}
			// kbs2 인덱스만큼 올린다
			for (int j = 0; j < kbs2_idx; j++) {
				result.append("4");
			}
		}

		System.out.println(result);

	}

}
