package Step;

import java.util.Scanner;

public class no_1002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x1 = sc.nextInt();
		double y1 = sc.nextInt();
		double r1 = sc.nextInt();
		double x2 = sc.nextInt();
		double y2 = sc.nextInt();
		double r2 = sc.nextInt();
		double h1 = Math.pow((x1 - x2), 2);
		double h2 = Math.pow((y1 - y2), 2);
		double h3 = Math.pow((r1 + r2), 2);
		double h4 = Math.pow((r1 - r2), 2);
		
		if (x1 == x2 && y1 == y2 && r1 == r2)
			System.out.println("-1");		
		else if ((h1 + h2) == h3)
			System.out.println("1");
		else if ((h1 + h2) > h3 || (x1 == x2 && y1 == y2 && r1 != r2)|| (h1 + h2 < h4))
			System.out.println("0");
		else 
			System.out.println("2");
			
	}

}
