package kr.jaen.test;
import java.io.FileInputStream;
import java.util.Scanner;

public class Solution41 {
	static long Answer;
	static int N, S;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("Solution41.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();// �׽�Ʈ ���̽� ��

		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt(); // �迭�� ũ�� N

			S = sc.nextInt();// ���� ��
			int[][] stone = new int[S][3];
			for (int i = 0; i < S; i++) {
				stone[i][0] = sc.nextInt();// ��
			}

			for (int i = 0; i < S; i++) {
				stone[i][1] = sc.nextInt();// ����ġ
				stone[i][2] = sc.nextInt();// ����ġ
			}
			//////////////////////////////
			// ( �� �κп� �˰��� ������ �Ѵ�. )//
			int[][] lake = new int[N+1][N+1];
			for (int i = 0; i < S; i++) {
				for(int j=-stone[i][0]; j<=stone[i][0] ; j++) {
					for(int k=-stone[i][0]; k<=stone[i][0] ; k++) {
						if(j+stone[i][1]<1||j+stone[i][1]>N||k+stone[i][2]<1||k+stone[i][2]>N) {
							continue;
						}
//						if(j==0&&k==0) {
//							continue;
//						}
						lake[j+stone[i][1]][k+stone[i][2]]++;
					}
				}
			}
			Answer=0;
			for (int i = 1; i < N+1; i++) {
				for(int j=1;j<N+1;j++){
					if(Answer<lake[i][j]){
						Answer=lake[i][j];
					}
				}
			}
			//////////////////////////////

			System.out.println("#" + test_case + " " + Answer);
		}
	}
}
