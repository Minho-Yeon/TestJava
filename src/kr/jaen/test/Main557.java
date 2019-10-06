package kr.jaen.test;
import java.util.Scanner;
public class Main557 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char[] c = new char[10];
		for(int i = 0 ;i<c.length;i++){
			c[i]=s.next().charAt(0);
		}
		System.out.print(c[0]+" "+c[3]+" "+c[6]);
		
	}

}
