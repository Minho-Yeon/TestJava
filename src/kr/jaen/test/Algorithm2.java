package kr.jaen.test;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;
public class Algorithm2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("Algorithm2.txt"));
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		int X;
		int Y;
		int L;
		int Answer=0;
		for(int test_case=0;test_case<T;test_case++) {
			Y=s.nextInt();
			X=s.nextInt();
			
			L=s.nextInt();
			int[][] line = new int[L][2];
			for(int i=0;i<L;i++) {
				line[i][0]=s.nextInt();
				line[i][1]=s.nextInt();
			}
			
			///////////////////////////알고리즘 구현

			boolean[][] bat = new boolean[X+1][Y+1];
			for(int i=0;i<L;i++){
				if(line[i][0]==0){
					for(int j=0;j<=Y;j++){
						bat[line[i][1]][j]=true;
					}
				}else{
					for(int j=0;j<=X;j++){
						bat[j][line[i][1]]=true;
					}
				}
			}
			int baseX1 = 0;
			int baseX2 = 0;
			int baseY1 = 0;
			int baseY2 = 0;
			int result = 0;
			for(int i=1;i<=Y;i++){
				if(bat[0][i]==true||i==Y){
					baseY2=i;
					for(int j =1;j<=X;j++){
						if(bat[j][0]==true||j==X){
							baseX2=j;
							result = (baseX2-baseX1)*(baseY2-baseY1);
							baseX1=j;
							if(result>Answer){
								Answer=result;
							}
						}
					}
					baseY1=i;
				}
			}
			///////////////////////////
			System.out.println(Answer);
		}
	}

}
