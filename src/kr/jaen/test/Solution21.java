package kr.jaen.test;
import java.io.FileInputStream;
import java.util.Scanner;

public class Solution21 {
	static long Answer;
	static int N, S;
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("Solution21.txt"));
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();//�׽�Ʈ ���̽� ��  
		
		for(int test_case=1; test_case<=T; test_case++){
			N=sc.nextInt(); //�迭�� ũ�� NxN
			int[][] lake=new int[N][N];
			
			S=sc.nextInt();//�ұ�����(Strider)��
			int[][] strider=new int[S][3];
			for(int k=0; k<S; k++){
				strider[k][0]=sc.nextInt();//����ġ
				strider[k][1]=sc.nextInt();//����ġ
				strider[k][2]=sc.nextInt();//����(1:��,2:��)
			}
			//////////////////////////////
			//( �� �κп� �˰��� ������ �Ѵ�. )//
			for(int i=0;i<strider.length;i++){
				lake[strider[i][0]][strider[i][1]]=1;
			}
			Answer=0;
			for(int i=3;i>0;i--){
				for(int k=0; k<S; k++){
					if(strider[k][2]==1){
						if(strider[k][0]+i<N){
							strider[k][0]+=i;//����ġ
						}else{
							strider[k][2]=0;
						}
					}else{
						if(strider[k][1]+i<N){
							strider[k][1]+=i;//����ġ
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
