package kr.jaen.test;

import java.util.Scanner;

public class Main1733 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int[][] pan = new int[20][20];

		for (int i = 1; i < 20; i++) {
			for (int j = 1; j < 20; j++) {
				pan[i][j] = s.nextInt();
			}
		}
		boolean[][] value = new boolean[20][20];
		int[] dirBlack = new int[8];
		int[] dirWhite = new int[8];
		int resultX = 0;
		int resultY = 0;
		for (int i = 1; i < 20; i++) {
			for (int j = 1; j < 20; j++) {
				if (pan[i][j] == 1) {
					for (int k = 1; k < 6; k++) {
						if (j + k < 20 && pan[i][j + k] == 1) {
							dirBlack[0]++;
						} else {
							break;
						}
					}
					for (int k = 1; k < 6; k++) {
						if (j - k > 0 && pan[i][j - k] == 1) {
							dirBlack[4]++;
						} else {
							break;
						}
					}
					for (int k = 1; k < 6; k++) {
						if (i + k < 20 && pan[i + k][j] == 1) {
							dirBlack[2]++;
						} else {
							break;
						}
					}
					for (int k = 1; k < 6; k++) {
						if (i - k > 0 && pan[i - k][j] == 1) {
							dirBlack[6]++;
						} else {
							break;
						}
					}
					for (int k = 1; k < 6; k++) {
						if (i + k < 20 && j + k < 20 && pan[i + k][j + k] == 1) {
							dirBlack[1]++;
						} else {
							break;
						}
					}
					for (int k = 1; k < 6; k++) {
						if (i - k > 0 && j - k > 0 && pan[i - k][j - k] == 1) {
							dirBlack[5]++;
						} else {
							break;
						}
					}
					for (int k = 1; k < 6; k++) {
						if (i + k < 20 && j - k > 0 && pan[i + k][j - k] == 1) {
							dirBlack[3]++;
						} else {
							break;
						}
					}
					for (int k = 1; k < 6; k++) {
						if (i - k > 0 && j + k < 20 && pan[i - k][j + k] == 1) {
							dirBlack[7]++;
						} else {
							break;
						}
					}
					if (dirBlack[0] + dirBlack[4] + 1 == 5) {
						for (int l = 0; l < 5; l++) {
							value[i][j - dirBlack[4] + l] = true;
						}
					}
					if (dirBlack[2] + dirBlack[6] + 1 == 5) {
						for (int l = 0; l < 5; l++) {
							value[i - dirBlack[6] + l][j] = true;
						}
					}
					if (dirBlack[1] + dirBlack[5] + 1 == 5) {

						for (int l = 0; l < 5; l++) {
							value[i - dirBlack[5] + l][j - dirBlack[5] + l] = true;
						}
					}
					if (dirBlack[3] + dirBlack[7] + 1 == 5) {

						for (int l = 0; l < 5; l++) {
							value[i + dirBlack[3] - l][j - dirBlack[3] + l] = true;
						}
					}
					dirBlack = new int[8];
				} else if (pan[i][j] == 2) {
					for (int k = 1; k < 6; k++) {
						if (j + k < 20 && pan[i][j + k] == 2) {
							dirWhite[0]++;
						} else {
							break;
						}
					}
					for (int k = 1; k < 6; k++) {
						if (j - k > 0 && pan[i][j - k] == 2) {
							dirWhite[4]++;
						} else {
							break;
						}
					}
					for (int k = 1; k < 6; k++) {
						if (i + k < 20 && pan[i + k][j] == 2) {
							dirWhite[2]++;
						} else {
							break;
						}
					}
					for (int k = 1; k < 6; k++) {
						if (i - k > 0 && pan[i - k][j] == 2) {
							dirWhite[6]++;
						} else {
							break;
						}
					}
					for (int k = 1; k < 6; k++) {
						if (i + k < 20 && j + k < 20 && pan[i + k][j + k] == 2) {
							dirWhite[1]++;
						} else {
							break;
						}
					}
					for (int k = 1; k < 6; k++) {
						if (i - k > 0 && j - k > 0 && pan[i - k][j - k] == 2) {
							dirWhite[5]++;
						} else {
							break;
						}
					}
					for (int k = 1; k < 6; k++) {
						if (i + k < 20 && j - k > 0 && pan[i + k][j - k] == 2) {
							dirWhite[3]++;
						} else {
							break;
						}
					}
					for (int k = 1; k < 6; k++) {
						if (i - k > 0 && j + k < 20 && pan[i - k][j + k] == 2) {
							dirWhite[7]++;
						} else {
							break;
						}
					}
					if (dirWhite[0] + dirWhite[4] + 1 == 5) {
						for (int l = 0; l < 5; l++) {
							value[i][j - dirWhite[4] + l] = true;
						}
					}
					if (dirWhite[2] + dirWhite[6] + 1 == 5) {
						for (int l = 0; l < 5; l++) {
							value[i - dirWhite[6] + l][j] = true;
						}
					}
					if (dirWhite[1] + dirWhite[5] + 1 == 5) {
						for (int l = 0; l < 5; l++) {
							value[i - dirWhite[5] + l][j - dirWhite[5] + l] = true;
						}
					}
					if (dirWhite[3] + dirWhite[7] + 1 == 5) {
						for (int l = 0; l < 5; l++) {
							value[i + dirWhite[3] - l][j - dirWhite[3] + l] = true;
						}
					}
					dirWhite = new int[8];
				}
			}
		}
		int count = 0;
		for (int i = 1; i < 20; i++) {
			for (int j = 1; j < 20; j++) {
				if (value[j][i] == true) {
					if (count == 0) {
						resultX = j;
						resultY = i;
					}
					count++;
				}
			}
		}
		if (count == 5) {
			if (pan[resultX][resultY] == 1) {
				System.out.println(1);
			} else {
				System.out.println(2);
			}
			System.out.println(resultX + " " + resultY);
		} else {
			System.out.println(0);
		}
	}
}