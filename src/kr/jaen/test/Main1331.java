package kr.jaen.test;

import java.util.Scanner;

public class Main1331 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int byun = s.nextInt();
		char[][] a = new char[2*byun][2*byun];
		int x=1;
		int y=byun;
		int ch=65;
		a[x][y]=(char)ch;
		ch++;
		while(true) {
			if(x<byun&&y<=byun) {
				x++;
				y--;
			}else if(y<byun&&x>=byun) {
				x++;
				y++;
			}else if(y>=byun&&x>byun) {
				x--;
				y++;
			}else if(y>byun+1&&x<=byun) {
				x--;
				y--;
			}else if(y==byun+1&&x<=byun) {
				y--;
			}
			a[x][y]=(char)ch;
			if(x==byun&y==byun) {
				break;
			}
			ch++;
			if(ch==91) {
				ch=65;
			}
		}
		for(int i=1;i<a.length;i++) {
			for(int j=1;j<a[i].length;j++) {
				if(a[i][j]==0) {
					System.out.print("  ");
				}else {
					System.out.print(a[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
}
