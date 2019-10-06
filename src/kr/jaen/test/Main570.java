package kr.jaen.test;
public class Main570 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[5][5];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				if(i==0||j==0){
					a[i][j]=1;
				}else{
					a[i][j]=a[i-1][j]+a[i][j-1];
				}
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
