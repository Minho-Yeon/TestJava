package kr.jaen.test;
import java.util.Scanner;
public class TestFor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] su = new int[n];
		int total=0;
		for(int i=0;i<n;i++) {
			su[i] = s.nextInt();
		}
		for(int i : su) {
			total+=i;
		}
		System.out.println(total);
		
		
	}

}
