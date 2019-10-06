package kr.jaen.test;
import java.util.Scanner;

public class Main538 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int su ;
		while(true){
			System.out.print("number? ");
			su=s.nextInt();
			if(su>0){
				System.out.println("positive integer");
			}else if(su<0){
				System.out.println("negative number");
			}else{
				break;
			}
		}
	}

}
