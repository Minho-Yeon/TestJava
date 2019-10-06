package kr.jaen.test;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution42 {
	static int N, Si, Sj, P, D;
	static int Ai, Aj;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("Solution42.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			Si = sc.nextInt(); // 출발점의 i좌표
			Sj = sc.nextInt(); // 출발점의 j좌표
			P = sc.nextInt();

			int Pi[] = new int[P]; // 함정의 i좌표의 모음
			int Pj[] = new int[P]; // 함정의 j좌표의 모음

			for (int k = 0; k < P; k++) {
				Pi[k] = sc.nextInt();
				Pj[k] = sc.nextInt();
			}

			D = sc.nextInt();
			int Dd[] = new int[D]; // 방향 모음
			int Da[] = new int[D]; // 이동 칸수 모음

			for (int k = 0; k < D; k++) {
				Dd[k] = sc.nextInt();
				Da[k] = sc.nextInt();
			}
			//////////////////////////////
			// ( 이 부분에 알고리즘 구현을 한다. )//
			int[][] miro = new int[N + 1][N + 1];
			for (int i = 0; i < P; i++) {
				miro[Pi[i]][Pj[i]] = 1;
			}
			Ai = -1;
			Aj = -1;
			for (int i = 0; i < D; i++) {
				switch (Dd[i]) {
				case 1:
					if (Si - Da[i] < 1) {
						Ai = 0;
						Aj = 0;
						break;
					}
					for(int j=0;j<Da[i];j++) {
						Si--;
						if (miro[Si][Sj] == 1) {
							Ai = 0;
							Aj = 0;
							break;
						}
					}
					break;
				case 2:
					if (Sj + Da[i] > N) {
						Ai = 0;
						Aj = 0;
						break;
					}
					for(int j=0;j<Da[i];j++) {
						Sj++;
						if (miro[Si][Sj] == 1) {
							Ai = 0;
							Aj = 0;
							break;
						}
					}
					break;
				case 3:
					if (Si + Da[i] > N) {
						Ai = 0;
						Aj = 0;
						break;
					}
					for(int j=0;j<Da[i];j++) {
						Si++;
						if (miro[Si][Sj] == 1) {
							Ai = 0;
							Aj = 0;
							break;
						}
					}
					break;
				case 4:
					if (Sj - Da[i] < 1) {
						Ai = 0;
						Aj = 0;
						break;
					}
					for(int j=0;j<Da[i];j++) {
						Sj--;
						if (miro[Si][Sj] == 1) {
							Ai = 0;
							Aj = 0;
							break;
						}
					}
					break;
				}
				if (Ai == 0 && Aj == 0) {
					break;
				} else if (miro[Si][Sj] == 1) {
					Ai = 0;
					Aj = 0;
					break;

				}
				Ai=Si;
				Aj=Sj;
			}

			//////////////////////////////

			System.out.println("#" + test_case + " " + Ai + " " + Aj);
		}
	}
}
