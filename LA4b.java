package LA4b;

import java.util.*;

public class LA4b {

	public static void main(String[] args) {
		int x1 = 4;
		int x2 = 5;
		int y1 = 4;
		int y2 = 5;
		int m = (y2 - y1) / (x2-x1);
		int x = 1;
		int b = 1;
		int Y = m * x + b;
		int r = 2;
		double A = 4 * Math.PI * r * r;
		System.out.println(Y);
		System.out.println(m);
		System.out.print(A);
	}

}
