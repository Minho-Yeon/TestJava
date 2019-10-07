package kr.jaen.test;

import java.util.Scanner;

public class Main1681 {
	static int temp = 0;
	static int Answer =0;
	static boolean[] selected;
	static int N;
	static int[][] house;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		house = new int[N + 1][N + 1];
		for (int i = 1; i < N + 1; i++) {
			for (int j = 1; j < N + 1; j++) {
				house[i][j] = s.nextInt();
			}
		}

		////////////////////////
		selected = new boolean[N + 1];
		fee(1,1);

		///////////////////////

		System.out.println(Answer);
	}

	public static void fee(int c,int x) {
		if(c==N){
			if(house[x][1]==0){
				return;
			}
			temp+=house[x][1];
			if(Answer==0){
				Answer=temp;
			}else if(temp<Answer){
				Answer=temp;
			}
			temp-=house[x][1];
			return;
		}
		for (int i = 2; i < N + 1; i++) {
			if (!selected[i]) {
				if(house[x][i]==0){
					continue;
				}
				selected[i]=true;
				temp+=house[x][i];
				fee(c+1,i);
				selected[i]=false;
				temp-=house[x][i];
			}
		}
	}
}
