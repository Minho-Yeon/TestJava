package kr.jaen.test;

import java.util.Scanner;

public class TestIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. if
		//new Scanner는 하드디스크의 메모리에 loading하는 것 주소는 s가 가지고 있음
		// Scanner s는 s가 Scanner를 가리키고 있다.
		// System.in : 표준 입력장치 , System.out : 표준 출력장치
		Scanner s = new Scanner(System.in);
		int score=s.nextInt(); //키보드로 부터 정수를 입력 받음
		System.out.println(score);
	}

}
