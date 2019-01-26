package challenges;

import java.util.Scanner;

/*
 * In this challenge, you must read an integer, a double, and a String from 
 * stdin, then print the values according to the instructions in the Output 
 * Format section below. 
 */
public class JavaStdinAndStdoutII {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		double d = scan.nextDouble();
		scan.nextLine(); // clears buffer
		String s = scan.nextLine();

		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
		
		scan.close();
	}
}
