package control_stmts;

import java.util.Scanner;

public class Pradjusted_no {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		
		int l_d=num%10;
		
		if(l_d>5) {
			num=num-l_d;
			num=num+5;
			System.out.println(num);
		}
		else if(l_d!=0){
			num=num-l_d;
			System.out.println(num);
		}
		else {
				System.out.println(num);
		}
		
	}

}
