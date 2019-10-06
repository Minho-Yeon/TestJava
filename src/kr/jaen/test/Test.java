package kr.jaen.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10; 	//선언문
		n= n+5;		// 대입문
		System.out.println(n);
		mm();		// 메서드 호출
		
		System.out.println();
		System.out.println("헬로우"); // 메서드 호출, 콘솔 = 표준 입출력 장치
	}
	public static void mm() {
		System.out.println("mm 히히"); //Ctrl + D 한줄 삭제
		System.out.println("mm 히히"); //Ctrl + Alt + 아래방향키 하면 바로 그 줄이 복사됨
		System.out.println("mm 히히"); //Alt + 방향키는 해당 줄을 누른 방향으로 이동 시킴
		System.out.println("mm 히히");
		
	}

}
