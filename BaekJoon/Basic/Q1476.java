package basic;

import java.io.*;
import java.util.StringTokenizer;

public class Q1476 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer s = new StringTokenizer(br.readLine());
		
		int E = Integer.parseInt(s.nextToken()); // 1~15
		int S = Integer.parseInt(s.nextToken()); // 1~28
		int M = Integer.parseInt(s.nextToken()); // 1~19
		
		int year;
		
		// 1 16 16 = 1 / 2 17 17 / 3 18 18 / 4 19 19 / 5 20 1
		//
		
		solve(E,S,M);
	}
	static void solve(int E, int S, int M) {
		
		int cnt = 0;
		int e = 0, s = 0, m = 0;
		while(true) {
			
			e++; s++; m++;
			
			if(e == 16) e = 1;
			if(s == 29) s = 1;
			if(m == 20) m = 1;
			
			cnt++;
			
			if(e == E && s == S && m == M) break;
		}
		
		System.out.println(cnt);
	}
}