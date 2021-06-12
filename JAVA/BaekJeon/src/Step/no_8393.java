package Step;

import java.util.Scanner;

public class no_8393 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = 0;
		for ( int i = 0; i <= n; i++) {
			k = i + k;
		}
		System.out.println(k);
	}
}
