package kr.jaen.test;
import java.util.Scanner;
public class Main1523 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int size;
		int jong;
		while(true) {
			size=s.nextInt();
			jong=s.nextInt();
			if(size<1||size>100||jong<1||jong>3) {
				System.out.println("INPUT ERROR!");
			}else {
				break;
			}
		}
		switch(jong) {
		case 1:
			for(int i=1;i<=size;i++) {
				for(int j=0;j<i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
		case 2:
			for(int i=size;i>=0;i--) {
				for(int j=0;j<i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
		case 3:
			for(int i=1;i<=size;i++) {
				for(int j=0;j<size-i;j++) {
					System.out.print(" ");
				}
				for(int j=0;j<1+2*(i-1);j++) {
					System.out.print("*");
				}
				System.out.println();
				
			}
			break;
		}
		
	}

}
