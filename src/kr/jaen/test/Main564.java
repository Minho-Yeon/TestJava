package kr.jaen.test;
import java.util.Scanner;
public class Main564 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[] a = new int[26];
		while(true){
			char c=s.next().charAt(0);
			int index=(int)c-65;
			if(index<0||index>25){
				break;
			}
			a[index]++;
		}
		for(int i=0;i<a.length;i++){
			if(a[i]!=0){
				System.out.println((char)(i+65)+" : "+a[i]);
			}
			
		}
	}

}
