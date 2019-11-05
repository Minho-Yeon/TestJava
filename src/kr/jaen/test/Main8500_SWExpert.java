package kr.jaen.test;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main8500_SWExpert {
	static int N;
	static int[] number;
	static int Answer;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("Main8500_SWExpert.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int test_case=1;test_case<=T;test_case++){
			Answer=0;
			N = Integer.parseInt(br.readLine());
			number = new int[N];
			
			st = new StringTokenizer(br.readLine());
			
			for(int i=0;i<N;i++){
				number[i]=Integer.parseInt(st.nextToken());
			}
		//=========================================
			Arrays.sort(number);
//			System.out.println(number[0]);
			for(int i=0;i<N;i++){
				if(i==0){	//숫자의 앞부분 처리
					Answer+=number[i];
//					System.out.printf("%d",number[i]);
				}else{
					if(number[i-1]<number[i]){
						Answer+=(number[i]-number[i-1]);
//						System.out.printf(" + %d",number[i]-number[i-1]);
					}
				}
				Answer+=(number[i]+1);
//				System.out.printf(" + %d",number[i]+1);
			}
			
			bw.append("#"+test_case+" "+Answer+"\n");
			
			
			
		//==========================================	
		}
		bw.flush();
		bw.close();
	}
}
