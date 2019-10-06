package kr.jaen.test;
import java.io.FileInputStream;
import java.util.Scanner;

public class Solution32 {
	static int Answer;
	static int X, Y, N, P;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("Solution32.txt"));
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt(); // Test case

		// fill up the data
		for (int test_case = 1; test_case <= T; test_case++) {

			X = sc.nextInt(); // position row
			Y = sc.nextInt(); // position col
			N = sc.nextInt(); // number of player

			int[][] room = new int[X + 1][Y + 1];// because start from 1;
			// fill up table
			for (int i = 1; i <= X; i++) {
				for (int j = 1; j <= Y; j++) {
					room[i][j] = sc.nextInt();
				}
			}

			int[][] player = new int[N][3];
			for (int i = 0; i < N; i++) {
				player[i][0] = sc.nextInt(); // coord X
				player[i][1] = sc.nextInt(); // coord Y
				player[i][2] = sc.nextInt(); // steps
			}
			
			P =sc.nextInt();
			int[][] trap=new int[P][2];
			for(int i = 0; i < P; i++){
				trap[i][0] = sc.nextInt();
				trap[i][1] = sc.nextInt();
			}			
			//////////////////////////////
			//( �� �κп� �˰��� ������ �Ѵ�. )//
			for(int i=0;i<P;i++){
				room[trap[i][0]][trap[i][1]]=0;
			}
			int[] money = new int[N];
			for(int i =0; i<N;i++){
				for(int j=0;j<player[i][2];j++){
					int x=player[i][0];
					int y=player[i][1];
					int temp=room[x][y];
					switch(temp/10){
					case 1:
						if(y+temp%10>Y){
							money[i]=-1000;
							break;
						}
						y+=temp%10;
						break;
					case 2:
						if(x+temp%10>X){
							money[i]=-1000;
							break;
						}
						x+=temp%10;
						break;
					case 3:
						if(y-temp%10<1){
							money[i]=-1000;
							break;
						}
						y-=temp%10;
						break;
					case 4:
						if(x-temp%10<1){
							money[i]=-1000;
							break;
						}
						x-=temp%10;
						break;
					}
					if(money[i]==-1000){
						break;
					}else{
						if(room[x][y]==0){
							money[i]=-1000;
							break;
						}
						player[i][0]=x;
						player[i][1]=y;
						if(j==player[i][2]-1){
							money[i]=room[x][y]*100-1000;
						}
					}
				}
			}
			Answer=0;
			for(int value: money){
				Answer+=value;
			}
			//////////////////////////////

			
			
			System.out.println("#" + test_case + " " + Answer);
		}

	}
}
