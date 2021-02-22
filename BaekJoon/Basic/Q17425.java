package basic;

import java.io.*;
import java.util.*;

public class Q17425 {
	static final int max = 1000000;
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long[] d = new long [max + 1];
		
		for(int i = 1; i <= max; i++) {
			d[i] = 1;
		}
		
		for(int i = 2; i <= max; i++) {
			for(int j = 1; i*j <= max; j++) {
				d[i*j] += i;
			}
		}
		
		long[] s = new long[max + 1];
		for(int i = 1; i <= max; i++) {
			s[i] = s[i-1] + d[i];
		}
		
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			bw.write(s[n] + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}
