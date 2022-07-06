package Zsgs;

import java.util.Scanner;

public class Eignt {
	public void startPattern() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input");
		int input = sc.nextInt();

		for (int i = 0; i < input; i++) {
			System.out.print("*");
			for (int j = 0; j < input; j++) {
				if (i == 0 || i == input - 1) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		sc.close();
	}

	public static void main(String[] args) {
		Eignt obj = new Eignt();
		obj.startPattern();
	}
}