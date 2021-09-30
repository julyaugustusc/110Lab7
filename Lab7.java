/*-------------------------------------------------------------------------
// AUTHOR: Augustus Crosby
// FILENAME: Lab7.java
// SPECIFICATION: your own description of the program.
// FOR: CSE 110- Lab #7
// TIME SPENT: 1 hour
//-----------------------------------------------------------*/

import java.util.Scanner;
public class Lab7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Name of the builder: ");
		String name = in.nextLine();
		
		Builder myBuilder = new Builder(name);
		System.out.println("The name of the builder is: " + myBuilder.getName());
		
		System.out.println("Enter a positive integer: ");
		int int1 = in.nextInt();
		
		System.out.print(myBuilder.makeRow(int1,"="));
		System.out.print(myBuilder.makeRow(int1,"*"));
		System.out.print(myBuilder.makeRow(int1,"="));
		System.out.println();
		
		System.out.println("Enter a positive odd integer: ");
		int int2 = in.nextInt();
		
		myBuilder.makePyramid(int2,"*");
		
		

		// Using the Builder method makePyramid and integer t, print pyramid with "*" as a string
		// s.
		//-->
	}
}