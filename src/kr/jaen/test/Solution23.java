package kr.jaen.test;
import java.io.FileInputStream;
import java.util.Scanner;

public class Solution23 {
	static long Answer;
	static int N, S;
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("Solution23.txt"));
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();//�׽�Ʈ ���̽� ��  
		
		for(int test_case=1; test_case<=T; test_case++){
			N=sc.nextInt(); //�迭�� ũ�� NxN
			int[][] lake=new int[N][N];
			
			S=sc.nextInt();//������ ��
			int[][] P=new int[S][3];
			for(int i=0; i<S; i++){
				P[i][0]=sc.nextInt();//����(1:��(��)->��(��),2:��(��)->��(��))
				P[i][1]=sc.nextInt();//��ġ(0~N-1, ����1=��(j)��ȣ,����2=��(i)��ȣ
				P[i][2]=sc.nextInt();//��ũ��(0~N-1)
			}
			//////////////////////////////
			//( �� �κп� �˰����� ������ �Ѵ�. )//
			Answer=0;
			for(int i=0;i<S; i++){
				for(int j= 0;j<3;j++){
					if((j+1)*P[i][2]-1>=N){
						break;
					}
					if(P[i][0]==1){	//��
						if(lake[(j+1)*P[i][2]-1][P[i][1]]==1){
							Answer=i+1;
							break;
						}
						lake[(j+1)*P[i][2]-1][P[i][1]]=1;
					}else{			//��
						if(lake[P[i][1]][(j+1)*P[i][2]-1]==1){
							Answer=i+1;
							break;
						}
						lake[P[i][1]][(j+1)*P[i][2]-1]=1;
					}
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