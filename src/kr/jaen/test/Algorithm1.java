package kr.jaen.test;
import java.io.FileInputStream;
import java.util.Scanner;
public class Algorithm1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("Algorithm1.txt"));
		Scanner s = new Scanner(System.in);
		
		int T = s.nextInt();
		int[] Answer= new int[T];
		for(int test_case=0;test_case<T;test_case++) {
			
			int X = s.nextInt();
			int Y = s.nextInt();
			char[][] b = new char[X][Y];
			Answer[test_case]=0;
			for(int i =0;i<X;i++) {
				for(int j =0; j<Y; j++) {
					b[i][j] = s.next().charAt(0);
				}
			}
			
			//////////////¾Ë°í¸®Áò ±¸Çö
			boolean[][] result = new boolean[X][Y];
			
			for(int i=0;i<X;i++) {
				for(int j=0;j<Y;j++) {
					if(b[i][j]=='G') {

						for(int x=i-1;x>=0;x--) {		
							if(b[x][j]=='W'||b[x][j]=='G') {	//À§·Î ÈÈ´Ù
								break;
							}else if(b[x][j]=='T') {
								result[x][j]=true;
								break;
							}
						}
						for(int x=j-1;x>=0;x--) {	
							if(b[i][x]=='W'||b[i][x]=='G') {	//ÁÂ·Î ÈÈ´Ù
								break;
							}else if(b[i][x]=='T') {
								result[i][x]=true;
								break;
							}
						}
						for(int x=i+1;x<X;x++) {		
							if(b[x][j]=='W'||b[x][j]=='G') {	//¾Æ·¡·Î ÈÈ´Ù
								break;
							}else if(b[x][j]=='T') {
								result[x][j]=true;
								break;
							}
						}
						for(int x=j+1;x<Y;x++) {	
							if(b[i][x]=='W'||b[i][x]=='G') {	//¿ì·Î ÈÈ´Ù
								break;
							}else if(b[i][x]=='T') {
								result[i][x]=true;
								break;
							}
						}
					}
				}
			}
			for(int i=0;i<X;i++) {
				for(int j=0;j<Y;j++) {
					if(result[i][j]) {
						Answer[test_case]++;
					}
				}
			}
			///////////////
		}
		for(int i=0;i<T;i++) {
			System.out.printf("#%d %d\n",i+1,Answer[i]);
		}
		
	}

}
