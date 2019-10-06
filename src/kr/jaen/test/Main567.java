package kr.jaen.test;
public class Main567 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[3][5];
		a[0][0] = 5;
		a[0][1] = 8;
		a[0][2] = 10;
		a[0][3] = 6;
		a[0][4] = 4;
		a[1][0] = 11;
		a[1][1] = 20;
		a[1][2] = 1;
		a[1][3] = 13;
		a[1][4] = 2;
		a[2][0] = 7;
		a[2][1] = 9;
		a[2][2] = 14;
		a[2][3] = 22;
		a[2][4] = 3;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
					System.out.printf("%2d   ",a[i][j]);
			}
			System.out.println();
		}

	}

}
