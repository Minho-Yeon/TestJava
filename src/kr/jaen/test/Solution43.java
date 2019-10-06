package kr.jaen.test;
import java.io.FileInputStream;
import java.util.Scanner;

public class Solution43 {
	static int N, Si, Sj, P, D;
	static int Answer;
	
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("Solution43.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
			N = sc.nextInt();
			Si = sc.nextInt(); //출발점의 i좌표
			Sj = sc.nextInt(); //출발점의 j좌표
			P = sc.nextInt();
			
			int Pi[] = new int[P];  // 함정의 i좌표의 모음
			int Pj[] = new int[P];  // 함정의 j좌표의 모음
			
			for(int k=0; k<P; k++) {
				Pi[k] = sc.nextInt();
				Pj[k] = sc.nextInt();
			}
			
			D = sc.nextInt();
			int Dd[] = new int[D];  // 방향 모음
			int Da[] = new int[D];  // 이동 칸수 모음
			
			for(int k=0; k<D; k++) {
				Dd[k] = sc.nextInt();
				Da[k] = sc.nextInt();
			}
			//////////////////////////////
			//( 이 부분에 알고리즘 구현을 한다. )//
			int[][] miro = new int[N+1][N+1];
			for(int i=0;i<P;i++) {
				miro[Pi[i]][Pj[i]]=1;
			}
			Answer=0;
			for(int i=0;i<D;i++) {
				switch(Dd[i]) {
				case 1:
					for(int j=0;j<Da[i];j++) {
						Si--;
						if(Si<1||miro[Si][Sj]==1) {
							Si=0;
							Sj=0;
							break;
						}else {
							Answer++;
						}
					}
					break;
				case 2:
					for(int j=0;j<Da[i];j++) {
						Si--;
						Sj++;
						if(Si<1||Sj>N||miro[Si][Sj]==1) {
							Si=0;
							Sj=0;
							break;
						}else {
							Answer++;
						}
					}
					break;
				case 3:
					for(int j=0;j<Da[i];j++) {
						Sj++;
						if(Sj>N||miro[Si][Sj]==1) {
							Si=0;
							Sj=0;
							break;
						}else {
							Answer++;
						}
					}
					break;
				case 4:
					for(int j=0;j<Da[i];j++) {
						Si++;
						Sj++;
						if(Si>N||Sj>N||miro[Si][Sj]==1) {
							Si=0;
							Sj=0;
							break;
						}else {
							Answer++;
						}
					}
					break;
				case 5:
					for(int j=0;j<Da[i];j++) {
						Si++;
						if(Si>N||miro[Si][Sj]==1) {
							Si=0;
							Sj=0;
							break;
						}else {
							Answer++;
						}
					}
					break;
				case 6:
					for(int j=0;j<Da[i];j++) {
						Si++;
						Sj--;
						if(Si>N||Sj<1||miro[Si][Sj]==1) {
							Si=0;
							Sj=0;
							break;
						}else {
							Answer++;
						}
					}
					break;
				case 7:
					for(int j=0;j<Da[i];j++) {
						Sj--;
						if(Sj<1||miro[Si][Sj]==1) {
							Si=0;
							Sj=0;
							break;
						}else {
							Answer++;
						}
					}
					break;
				case 8:
					for(int j=0;j<Da[i];j++) {
						Si--;
						Sj--;
						if(Si<1||Sj<1||miro[Si][Sj]==1) {
							Si=0;
							Sj=0;
							break;
						}else {
							Answer++;
						}
					}
					break;
				}
				if(Si==0&&Sj==0) {
					break;
				}
			}
			
			//////////////////////////////

			
			
			System.out.println("#"+test_case+" "+Answer);
		}
	}
}