package kr.jaen.test;
import java.util.Scanner;
public class Main1880 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =  new Scanner(System.in);
		String a = s.next();
		s.nextLine();
		String b = s.nextLine();
		for(int i=0;i<b.length();i++) {
			if((int)b.charAt(i)>=65&&(int)b.charAt(i)<=90) {
				System.out.print((char)(a.charAt((int)b.charAt(i)-65)-32));
			}else if(b.charAt(i)==' ') {
				System.out.print(" ");
			}
			else {
				System.out.print(a.charAt((int)b.charAt(i)-97));
			}
			
		}		
	}

}
