package kr.jaen.test;
import java.util.Scanner;
public class Main565 {
	public static void main(String[] args){
		int[] a = new int[10];
		Scanner s = new Scanner(System.in);
		int su;
		while(true){
			su= s.nextInt();
			if(su>=1&&su<100){
				su=su/10;
				a[su]++;
				
			}else if(su==0){
				break;
			}
		}
		for(int i=0;i<a.length;i++){
			if(a[i]!=0){
				System.out.println(i+" : "+a[i]);
			}
		}
	}
}
