package hw2_2;

import java.util.Scanner; 
import java.util.Random;
public class hw2_2 {
	public static void main(String[] args) {
		Random rand= new Random();
		int ans=30;
		int min=0;
		int max=100;
		int guess=0;
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("請輸入一個數字");
			guess=sc.nextInt();
			
		if(guess>ans){
		    System.out.println("0到" +guess);
		}
		else if(guess<ans) {
			System.out.println(guess+"到100");
		}
		else  {
			System.out.println("你猜對了!!");
			break;
		}
	}
	}
}
