package kr.jaen.test;

import java.util.Scanner;

public class TestIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. if
		//new Scanner�� �ϵ��ũ�� �޸𸮿� loading�ϴ� �� �ּҴ� s�� ������ ����
		// Scanner s�� s�� Scanner�� ����Ű�� �ִ�.
		// System.in : ǥ�� �Է���ġ , System.out : ǥ�� �����ġ
		Scanner s = new Scanner(System.in);
		int score=s.nextInt(); //Ű����� ���� ������ �Է� ����
		System.out.println(score);
	}

}
