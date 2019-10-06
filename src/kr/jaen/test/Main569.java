package kr.jaen.test;
import java.util.Scanner;
public class Main569 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[][] a = new int[5][4];
		int count=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=s.nextInt();
			}
		}
		int total=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				total+=a[i][j];
			}
			if(total/4>=80){
				System.out.println("pass");
				count++;
			}else{
				System.out.println("fail");
			}
			total=0;
		}
		System.out.println("Successful : "+count);
	}

}
