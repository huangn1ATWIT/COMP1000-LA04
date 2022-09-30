package LA4a;

import java.util.*;

public class LA4a {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = input.nextInt();
		System.out.print("Enter b: ");
		int b = input.nextInt();
		System.out.printf("The GCD of %d and %d is %d", a, b, gcd(a, b));
	}
	public static int gcd(int a, int b) {
		while (b != 0) {
			int t = b;
			b = a % b;
			a = t;
		}
		return a;
	}
}
