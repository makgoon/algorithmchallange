package Step;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class no_15552 {
	public static void main(String[] args) {
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int b = Integer.parseInt(br.readLine());
			
			
			for (int i = 0; i < b; i++ ) {
				String a = br.readLine();
				String array[] = a.split(" ");
				int first = Integer.parseInt(array[0]);
				int second = Integer.parseInt(array[1]);
				bw.write(first + second + "\n");
				
			}
			bw.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
