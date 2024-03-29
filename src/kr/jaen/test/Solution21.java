package kr.jaen.test;
import java.io.FileInputStream;
import java.util.Scanner;

public class Solution21 {
	static long Answer;
	static int N, S;
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("Solution21.txt"));
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();//테스트 케이스 수  
		
		for(int test_case=1; test_case<=T; test_case++){
			N=sc.nextInt(); //배열의 크기 NxN
			int[][] lake=new int[N][N];
			
			S=sc.nextInt();//소금쟁이(Strider)수
			int[][] strider=new int[S][3];
			for(int k=0; k<S; k++){
				strider[k][0]=sc.nextInt();//행위치
				strider[k][1]=sc.nextInt();//열위치
				strider[k][2]=sc.nextInt();//방향(1:하,2:우)
			}
			//////////////////////////////
			//( 이 부분에 알고리즘 구현을 한다. )//
			for(int i=0;i<strider.length;i++){
				lake[strider[i][0]][strider[i][1]]=1;
			}
			Answer=0;
			for(int i=3;i>0;i--){
				for(int k=0; k<S; k++){
					if(strider[k][2]==1){
						if(strider[k][0]+i<N){
							strider[k][0]+=i;//행위치
						}else{
							strider[k][2]=0;
						}
					}else{
						if(strider[k][1]+i<N){
							strider[k][1]+=i;//행위치
						}else{
							strider[k][2]=0;
						}
					}
					if(strider[k][2]!=0&&lake[strider[k][0]][strider[k][1]]==1){
						Answer=k+1;
						break;
					}
					lake[strider[k][0]][strider[k][1]]=1;
				}
				if(Answer!=0){
					break;
				}
			}
			
			
			//////////////////////////////

			
			
			System.out.println("#"+test_case+" "+Answer);
		}
	}
}
