package kr.jaen.test;

import java.util.Scanner;

public class Main1031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[][] chul = new int[5][5];
		int[][] answer = new int[5][5];
		boolean[][] cor = new boolean[5][5];
		int Answer = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				chul[i][j] = s.nextInt();
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				answer[i][j] = s.nextInt();
			}
		}
		int line = 0;
		answer: for (int i = 0; i < 5; i++) {

			if (Answer!=0) {
				break;
			}
			for (int j = 0; j < 5; j++) {
				for (int k = 0; k < 5; k++) {
					for (int l = 0; l < 5; l++) {
						if (chul[k][l] == answer[i][j]) {
							cor[k][l] = true;
							for (int o = 0; o < 5; o++) {
								for (int p = 0; p < 5; p++) {
									if (cor[o][p]) {
										if (p == 4) {
											line++;
										}
									} else {
										break;
									}
								}
							}
							for (int o = 0; o < 5; o++) {
								for (int p = 0; p < 5; p++) {
									if (cor[p][o]) {
										if (p == 4) {
											line++;
										}
									} else {
										break;
									}
								}
							}
							for (int o = 0; o < 5; o++) {
								if (cor[o][o]) {
									if (o == 4) {
										line++;
									}
								} else {
									break;
								}
							}
							for (int o = 0; o < 5; o++) {
								if (cor[4 - o][o]) {
									if (o == 4) {
										line++;
									}
								} else {
									break;
								}
							}
							if (line >= 3) {
								Answer = 5*i+j+1;
								break answer;
							}
							break;
						}
					}
				}
				line=0;
			}
		}
		System.out.println(Answer);
	}

}
