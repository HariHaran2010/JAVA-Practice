package five;

import java.util.Scanner;

public class Seven {
	public void CopyElements() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int n = sc.nextInt();
		int input[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("enter" + " " + i + " " + "Indexof element");
			input[i] = sc.nextInt();
		}
		int output[] = new int[input.length];

		for (int i = 0; i < output.length; i++) {
			output[i] = input[i];
		}
		for (int elements : output) {
			System.out.print(elements + " ");
		}
		sc.close();
	}

	public static void main(String[] args) {
		Seven obj = new Seven();
		obj.CopyElements();
	}
}