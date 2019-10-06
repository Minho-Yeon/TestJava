package kr.jaen.test;
import java.io.FileInputStream;
import java.util.Scanner;

public class Solution12 {
	static int T, N;
	static int AnswerEven, AnswerOdd;
	
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("Solution12.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
			N = sc.nextInt();
			int[][] arr=new int[N][N];
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			//////////////////////////////
			//( 이 부분에 알고리즘 구현을 한다. )//
			int odd=0;
			int even=0;
			for(int i=1;i<N-1;i++){
				for(int j=1;j<N-1;j++){
					if(arr[i-1][j]%2==1&&arr[i+1][j]%2==1&&arr[i][j-1]%2==1&&arr[i][j+1]%2==1){
						odd++;
					}else if(arr[i-1][j]%2==0&&arr[i+1][j]%2==0&&arr[i][j-1]%2==0&&arr[i][j+1]%2==0){
						even++;
					}
				}
			}
			AnswerEven=even;
			AnswerOdd=odd;
			//////////////////////////////

			
			
			System.out.println("#"+test_case+" "+AnswerEven+" "+AnswerOdd);
		}
	}
}