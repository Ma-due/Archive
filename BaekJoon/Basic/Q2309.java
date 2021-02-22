package basic;

import java.io.*;
import java.util.Arrays;

public class Q2309 {

	static int[] talls = new int[9];
	static int sum = 0;
	public static void main(String[] args)	throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0; i < 9; i++) {
			talls[i] = Integer.parseInt(br.readLine());
			sum += talls[i];
		}
		
		Arrays.sort(talls);
		
		for(int i = 0; i < 9; i++) {
			for(int j = i+1; j < 9; j++) {
				if(sum - talls[i] - talls[j] == 100) {
					for(int k = 0; k < 9; k++) {
						if(k == i || k == j) continue;
						System.out.println(talls[k]);
					}
					System.exit(0);
				}
			}
		}
	}
}
