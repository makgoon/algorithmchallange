package Step;

import java.util.Scanner;

public class no_2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		if (a == 0 && b < 45)
			a = 24;
		
		if (b < 45) {
			a--;
			b += 15;
		}
		else {
			b -= 45;
		}				
		System.out.println(a + " " + b);
	}

}
