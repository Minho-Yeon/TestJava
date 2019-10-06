package kr.jaen.test;
import java.util.Scanner;
public class Main537 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int su;
		while(true){
			su = s.nextInt();
			if(su>0&&su<=100){
				break;
			}
		}
		
		int i=1;
		int total=0;
			while(i<=su){
				total+=i;
				i++;
			}
			System.out.println(total);
	}

}
