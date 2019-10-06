package kr.jaen.test;
import java.util.Scanner;
public class Main2857 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String[] a=new String[5];
		int max=0;
		for(int i=0;i<5;i++) {
			a[i]=s.next();
			if(max<a[i].length()) {
				max = a[i].length();
			}
		}
		char[][] b = new char[5][max];
		for(int i=0;i<5;i++) {
			for(int j=0;j<a[i].length();j++) {
				if(a[i].charAt(j)=='0') {
					b[i][j]='['; 
				}else {
					b[i][j]=a[i].charAt(j); 
				}
				
			}
		}
		for(int i=0;i<max;i++) {
			for(int j=0;j<5;j++) {
				if(b[j][i]!=0) {
					if(b[j][i]=='[') {
						System.out.print(0);
					}else {
						System.out.print(b[j][i]);
					}
					
				}
			}
		}

		
	}

}
