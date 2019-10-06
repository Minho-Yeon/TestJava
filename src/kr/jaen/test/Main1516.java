package kr.jaen.test;
import java.util.Scanner;
import java.util.Arrays;
public class Main1516 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String temp;
		while(true) {
			temp=s.nextLine();
			if(temp.equals("END")) {
				break;
			}
			
			String[] c= temp.split(" ");
			Arrays.sort(c);
			temp=null;
			int score =1;
			for(String word:c) {
				if(word.equals(temp)) {
					score++;
				}else {
					if(temp!=null) {
						System.out.println(score);
					}
					System.out.print(word+" : ");
					score=1;
				}
				temp=word;
			}
			System.out.println(score);
			
		}

	}

}
