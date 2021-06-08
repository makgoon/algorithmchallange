package Step;

import java.util.Scanner;

public class no_2588 {
	public static void main(String[] args) {
		int a, b, c, d, e;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		c = b / 100;
		d = (b / 10) - (c * 10);
		e = b - (c * 100 ) - (d * 10);

		System.out.println(a * e);
		System.out.println(a * d);
		System.out.println(a * c);
		System.out.println(a * b);
		
	}
}
