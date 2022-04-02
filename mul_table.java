package Positive_number_multiplication_table;

import java.util.Scanner;

public class mul_table {
	public static void main(String[] args) {
		// TODO Auto-generated method stud
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a positive number:");
		int n = s.nextInt();
		while (n < 0) {
			System.out.println("please enter a positive number");
			n = s.nextInt();
		}
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
		}

	}

}
