package control_stmts;

import java.util.Scanner;

public class Max_bet_3nos {

	public static void main(String[] args) {
		// Max from 3 numbers
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st number: ");
		int a=sc.nextInt();
		System.out.println("enter 2nd number: ");
		int b=sc.nextInt();
		System.out.println("enter 3rd number: ");
		int c=sc.nextInt();
		
		if(a>b && a>c)
			System.out.println(a+" is maximum");
		else if(b>a && b>c)
			System.out.println(b+" is maximum");
		else
			System.out.println(c+" is maximum");
	}

}
