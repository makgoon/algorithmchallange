package Step;

import java.util.Scanner;

public class no_1330 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner	sc = new Scanner(System.in);
		int a;
		int b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a > b)
			System.out.println(">");
		else if (a < b)
			System.out.println("<");
		else
			System.out.println("==");
		
	}

}
