package kr.jaen.test;
import java.util.Scanner;
public class Main2514 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int koi=0;
		int ioi=0;
		String a = s.next();
		for(int i=0;i<a.length()-2;i++) {
			if(a.charAt(i)=='K'||a.charAt(i)=='I') {
				if(a.charAt(i+1)=='O'&&a.charAt(i+2)=='I') {
					if(a.charAt(i)=='K') {
						koi++;
					}else {
						ioi++;
					}
				}
			}
		}
		System.out.println(koi);
		System.out.println(ioi);
	}
}
