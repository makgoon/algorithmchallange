package Step;

import java.util.Scanner;

public class no_2742 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int result = 0;
		
		for (int i = 0; i < a; i++) {
			result = a - i;
			System.out.println(result);
		}
		
	}

}
