package kr.jaen.test;
import java.util.Scanner;
public class Main568 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[][] a= new int[2][4],b=new int[2][4];
		System.out.println("first array");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("second array");
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b[i].length;j++){
				b[i][j]=s.nextInt();
				a[i][j]*=b[i][j];
				
			}
			
		}
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
