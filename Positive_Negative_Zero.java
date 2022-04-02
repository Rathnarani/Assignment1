package print_count_positive_negative_zeros;

import java.util.Scanner;

public class Positive_Negative_Zero {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char opt = 'Y';
		int counter = 0, nve = 0, pve = 0, zero = 0, num;
		while (opt == 'y' || opt == 'Y') {
			++counter;
			System.out.println("Enter the number: ");
			num = scan.nextInt();
			if (num == 0)
				++zero;
			else if (num > 0)
				++pve;
			else if (num < 0)
				++nve;
			System.out.println("Total Number Of Entries: " + counter);
			System.out.println("Negative Entries: " + nve);
			System.out.println("Positive Entries: " + pve);
			System.out.println("Zero Entries: " + zero);
			System.out.println("Enter 'Y' if you wish to continue else enter 'N'!");
			opt = scan.next().charAt(0);
		}

		scan.close();
	}

}
