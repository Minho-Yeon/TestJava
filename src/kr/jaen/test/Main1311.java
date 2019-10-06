package kr.jaen.test;
import java.util.Scanner;
import java.util.Arrays;
public class Main1311 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int Answer=0;
		char[] color= new char[5];
		int[] number= new int[5];
		for(int i=0;i<5;i++){
			color[i]=s.next().charAt(0);
			number[i]=s.nextInt();
		}
		Arrays.sort(number);
		char temp=color[0];
		boolean fourcard = false;
		boolean fullHouse = false;
		boolean flush = false;
		boolean straight=true;
		boolean triple = false;
		boolean twoPair=false;
		boolean onePair=false;
		for(int i=1;i<5;i++){
			if(temp!=color[i]){
				break;
			}else if(i==4){
				flush = true;
			}
		}
		int count =1;
		int[][] save = new int[2][2];
		int index = 0;
		for(int i=0;i<4;i++){
			if(number[i]+1!=number[i+1]){	//straight
				straight = false;
			}
			if(number[i]==number[i+1]){		//fourcard
				count++;
				if(count>1&&i==3){
					save[index][0]=number[i];
					save[index][1]=count;
					index++;
				}
			}else{
				if(count>1){
					save[index][0]=number[i];
					save[index][1]=count;
					index++;
				}
				count =1;
			}
		}
		int tripleNum = 0;
		int pairNum=0;
		for(int i=0;i<2;i++){
			if(save[i][1]==4){
				fourcard=true;
				break;
			}else if(save[i][1]==3){
				tripleNum = save[i][0];
				if(i==1&&save[0][1]==2){
					fullHouse=true;
					pairNum=save[0][0];
					break;
				}else if(i==0&&save[1][1]==2){
					fullHouse=true;
					pairNum=save[1][0];
					break;
				}else{
					triple=true;
					break;
				}
			}else if(save[i][1]==2){
				pairNum=save[i][0];
				if(i==1&&save[0][1]==2){
					twoPair=true;
					break;
				}else if(i==0&&save[1][1]==2){
					twoPair=true;
					break;
				}else if(i==1&&save[0][1]==0){
					onePair=true;
					pairNum=save[i][0];
				}else if(i==0&&save[1][1]==0){
					onePair=true;
					
				}
			}
		}
		
		
		if(flush&&straight){
			Answer=900+number[4];
		}else if(fourcard){
			if(number[4]>number[3]){
				Answer = 800+number[3];
			}else{
				Answer=800+number[4];
			}
			
		}else if(fullHouse){
			Answer = 700+tripleNum*10+pairNum;
		}else if(flush){
		
			Answer = 600+number[4];
		}else if(straight){
			Answer = 500+number[4];
		}else if(triple){
			Answer = 400+tripleNum;
		}else if(twoPair){
			if(save[0][0]<save[1][0]){
				Answer = 300+save[1][0]*10+save[0][0];
			}else{
				Answer = 300+save[0][0]*10+save[1][0];
			}
			
		}else if(onePair){
			Answer = 200+pairNum;
		}
		else{
			Answer =100+number[4];
		}
		System.out.println(Answer);
	}

}
