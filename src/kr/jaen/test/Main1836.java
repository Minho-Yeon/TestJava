package kr.jaen.test;

import java.util.Scanner;

public class Main1836 {
	static int Answer = 0;
	static int temp = 0;
	static int[] su;
	static int N;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		N = s.nextInt();
		su = new int[N];
		for (int i = 0; i < N; i++) {
			su[i] = s.nextInt();
		}

		////////////////////
		compute(0, false);

		///////////////////

		System.out.println(Answer);

	}

	public static void compute(int c, boolean a) {
		if (c == N) {
			return;
		}
		for (int i = 0; i < 2; i++) {

			if (i == 0) {
				if(!a) {
					compute(c + 1, false);
				}
				
			}
			else if (i == 1) {
				temp += su[c];
				if (Answer < temp) {
					Answer = temp;
				}
				compute(c + 1, true);
				temp -= su[c];
			}

		}
	}
}
