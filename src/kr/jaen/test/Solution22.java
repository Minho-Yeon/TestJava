package kr.jaen.test;
import java.io.FileInputStream;
import java.util.Scanner;

public class Solution22 {
	static long Answer;
	static int N, S;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("Solution22.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();// �׽�Ʈ ���̽� ��

		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt(); // �迭�� ũ�� NxN
			int[][] lake = new int[N][N];

			S = sc.nextInt();// �ұ�����(Strider)��
			int[][] strider = new int[S][3];
			for (int k = 0; k < S; k++) {
				strider[k][0] = sc.nextInt();// ����ġ
				strider[k][1] = sc.nextInt();// ����ġ
				strider[k][2] = sc.nextInt();// ����(1:��,2:��)
			}
			//////////////////////////////
			// ( �� �κп� �˰��� ������ �Ѵ�. )//
			Answer = S;
			for (int k = 0; k < S; k++) {
				for (int i = 3; i > 0; i--) {
					if (strider[k][2] == 1) { // ���� ��

						if (strider[k][0] - i < 0) {
							strider[k][2] = 0;
							Answer--;
							break;
						} else {
							strider[k][0] -= i;
						}
					} else if(strider[k][2]==2) { // ���� ��
						if (strider[k][0] + i >= N) {
							strider[k][2] = 0;
							Answer--;
							break;
						} else {
							strider[k][0] += i;
						}
					}else if(strider[k][2]==3) { // ���� ��
						if (strider[k][1] - i < 0) {
							strider[k][2] = 0;
							Answer--;
							break;
						} else {
							strider[k][1] -= i;
						}
					}else if(strider[k][2]==4) { // ���� ��
						if (strider[k][1] + i >= N) {
							strider[k][2] = 0;
							Answer--;
							break;
						} else {
							strider[k][1] += i;
						}
					}
					if (lake[strider[k][0]][strider[k][1]] == 1) {
						strider[k][2] = 0;
						Answer--;
						break;
					}
					if (i == 1) {
						lake[strider[k][0]][strider[k][1]] = 1;
					}
				}
			}

			//////////////////////////////

			System.out.println("#" + test_case + " " + Answer);
		}
	}
}
