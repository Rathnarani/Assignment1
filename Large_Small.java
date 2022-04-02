package print_large_small_numbers;

import java.util.Scanner;

public class Large_Small {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char op;
		do {
			System.out.println("Please enter total numbers: ");
			int numbers = sc.nextInt();
			int maximum = Integer.MIN_VALUE;
			int minimum = Integer.MAX_VALUE;
			System.out.println("Please enter " + numbers + " numbers.");
			for (int a = 0; a < numbers; a++) {
				int current = sc.nextInt();
				if (current > maximum) {
					maximum = current;
				}
				if (current < minimum) {
					minimum = current;
				}
			}
			System.out.println("largest of " + numbers + " numbers is: " + maximum);
			System.out.println("smallest of " + numbers + " numbers is: " + minimum);
			System.out.println("Do you wish to perform another operation, Y/N");
			op = sc.next().charAt(0);

		} while (op == 'Y' || op == 'y');

		sc.close();

	}
}
