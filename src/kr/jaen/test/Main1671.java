package kr.jaen.test;

import java.util.Scanner;

public class Main1671 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int[][] jongi = new int[101][101];
		int N = s.nextInt();
		int[] X = new int[N];
		int[] Y = new int[N];
		for (int i = 0; i < N; i++) {
			X[i] = s.nextInt();
			Y[i] = s.nextInt();
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					jongi[X[i] + j][Y[i] + k]=1;
				}
			}
		}
		int result=0;
		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= 100; j++) {
				if(jongi[i][j]==0) {
					if(i>1&&jongi[i-1][j]==1) {
						result++;
					}
					if(i<100&&jongi[i+1][j]==1) {
						result++;
					}
				}else if(i==1||i==100){
					result++;
				}
				if(jongi[j][i]==0) {
					if(i>1&&jongi[j][i-1]==1) {
						result++;
					}
					if(i<100&&jongi[j][i+1]==1) {
						result++;
					}
				}else if(i==1||i==100) {
					result++;
				}
			}
		}
		System.out.println(result);
	}
}
