package kr.jaen.test;
import java.util.Scanner;
public class Main529 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int key = s.nextInt();
		int weight = s.nextInt();
		int biman=weight+100-key;
		System.out.println(biman);
		if(biman>0){
			System.out.println("Obesity");
		}
		
	}

}
