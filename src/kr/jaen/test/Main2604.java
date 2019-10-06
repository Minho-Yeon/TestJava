package kr.jaen.test;
import java.util.Scanner;
public class Main2604 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String a = s.next();
		char temp='(';
		int total = 0;
		for(int i=0;i<a.length();i++) {
			if(i==0||temp!=a.charAt(i)) {
				total+=10;
			}else {
				total+=5;
			}
			temp=a.charAt(i);
		}
		System.out.println(total);
	}

}
