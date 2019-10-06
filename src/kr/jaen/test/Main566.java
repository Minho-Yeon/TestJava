package kr.jaen.test;
import java.util.Scanner;
public class Main566 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=100;
		Scanner s = new Scanner(System.in);
		int su = s.nextInt();
		int temp;
		System.out.print(result+" "+su+" ");
		
		while(true){
			result-=su;
			System.out.print(result+" ");
			if(result<0){
				break;
			}
			temp = result;
			result=su;
			su=temp;
		}
	}

}
