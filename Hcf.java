package find_hcf_2numbers;

import java.util.Scanner;

public class Hcf {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, x, y, t, hcf;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Two Numbers : ");
		x = scan.nextInt();
		y = scan.nextInt();

		a = x;
		b = y;

		while (b != 0) {
			t = b;
			b = a % b;
			a = t;
		}

		hcf = a;

		System.out.print("HCF = " + hcf);
	}

}
