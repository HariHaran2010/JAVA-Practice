package project1;

import java.util.Scanner;

public class Alpha {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the character : ");
		char c = in.next().charAt(0);
		for(char i=c; i<='Z'; i++) {
			System.out.print(i+" ");
		}
	}

}
