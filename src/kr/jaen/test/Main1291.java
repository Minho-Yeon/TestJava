package kr.jaen.test;

import java.util.Scanner;

public class Main1291 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int first;
		int second;
		while (true) {
			first = s.nextInt();
			second = s.nextInt();
			if (first < 2 || first > 9 || second < 2 || second > 9) {
				System.out.println("INPUT ERROR!");
			} else {
				break;
			}
		}
		for(int i=1;i<10;i++) {
			if(first>second) {
				for(int j=first;j>=second;j--) {
					System.out.printf("%d * %d = %2d   ",j,i,j*i);
				}
				System.out.println();
			}else {
				for(int j=first;j<=second;j++) {
					System.out.printf("%d * %d = %2d   ",j,i,j*i);
				}
				System.out.println();
			}
		}
	}

}
