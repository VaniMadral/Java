package control_stmts;

import java.util.Scanner;

public class Min_3nos {

	public static void main(String[] args) {
		// Min from 3 numbers
				Scanner sc=new Scanner(System.in);
				System.out.println("enter 1st number: ");
				int x=sc.nextInt();
				System.out.println("enter 2nd number: ");
				int y=sc.nextInt();
				System.out.println("enter 3rd number: ");
				int z=sc.nextInt();
				
				if(x<y && x<z)
					System.out.println(x+" is minimum");
				else if(y<x && y<z)
					System.out.println(y+" is minimum");
				else
					System.out.println(z+" is minimum");
	}

}
