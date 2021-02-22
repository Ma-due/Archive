package basic;

import java.io.*;

public class Q17427 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		long ans = 0L;
		
		for(int i = 1; i <= n; i++) {
			ans += (n/i) * i;
		}
		
		System.out.println(ans);
	}
}
