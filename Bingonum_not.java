package control_stmts;

import java.util.Scanner;

public class Bingonum_not {

	public static void main(String[] args) {
		// To check number is bingo number or not
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		
		if(num%7==0) {
			boolean is_seven=false;
			while(num>0) {
				if(num%10==7) {
					is_seven=true;
					break;
				}
				num/=10;
			}
			if(!is_seven) {
				System.out.println("bingo num");
			}
			else {
				System.out.println("not bingo num, contains 7");
			}
		}
		else {
			System.out.println("not bingo num not div by 7 ");
		}
	}
}
