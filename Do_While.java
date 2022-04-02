package do_while_numbers;

import java.util.Scanner;

public class Do_While {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int sum = 0;
		char op;
		do {
			System.out.println("Enter two numbers:");
			int num1 = in.nextInt();
			int num2 = in.nextInt();
			sum = num1 + num2;
			System.out.println("sum = " + sum);
			System.out.println("Do you wish to perform another operation, Y/N");
			op = in.next().charAt(0);
		} while (op == 'Y' || op == 'y');

	}
}
