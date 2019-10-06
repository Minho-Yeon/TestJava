package kr.jaen.test;
import java.io.FileInputStream;
import java.util.Scanner;

public class Solution13 {
	static int T, N;
	static int Answer;
	
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("Solution13.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
			N = sc.nextInt();
			char[][] area=new char[N][N];
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					area[i][j] = sc.next().charAt(0);
				}
			}
			//////////////////////////////
			//( 이 부분에 알고리즘 구현을 한다. )//
			Answer=2;
			int count;
			for(int i=0;i<N;i++){
				for(int j=0;j<N;j++){
					
					if(area[i][j]=='B'){
						count=0;
						if(i!=0){
							if(area[i-1][j]!='B'){
								continue;
							}
						}
						if(i!=N-1){
							if(area[i+1][j]!='B'){
								continue;
							}
						}
						if(j!=0){
							if(area[i][j-1]!='B'){
								continue;
							}
						}
						if(j!=N-1){
							if(area[i][j+1]!='B'){
								continue;
							}
						}
						if(i!=0&&j!=0){
							if(area[i-1][j-1]!='B'){
								continue;
							}
						}
						if(i!=0&&j!=N-1){
							if(area[i-1][j+1]!='B'){
								continue;
							}
						}
						if(i!=N-1&&j!=0){
							if(area[i+1][j-1]!='B'){
								continue;
							}
						}
						if(i!=N-1&&j!=N-1){
							if(area[i+1][j+1]!='B'){
								continue;
							}
						}
						
						for(int k=0;k<N;k++){
							if(area[i][k]=='B'){
								count++;
							}
							if(area[k][j]=='B'){
								count++;
							}
						}
						count--;
						if(Answer<count){
							Answer=count;
						}
					}
				}
			}
			//////////////////////////////

			
			
			System.out.println("#"+test_case+" "+Answer);
		}
	}
}