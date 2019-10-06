package kr.jaen.test;
import java.util.Scanner;
public class Main530 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		if(age>=20){
			System.out.println("adult");
		}else{
			System.out.println(20-age+" years later");
		}
	}

}
