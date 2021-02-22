package basic;
import java.io.*;
import java.util.*;
public class Q1929 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int m = Integer.parseInt(s.nextToken());
		int n = Integer.parseInt(s.nextToken());
		
		boolean[] check = new boolean[n + 1];
		
		check[0] = true; check[1] = true;
		
		for(int i = 2; i*i <= n; i++) {
			
			if(check[i] == true) continue;
			
			for(int j = i + i; j <= n; j += i) {
				check[j] = true;
			}
		}
		
		for(int i = m; i <= n; i++) {
			if(check[i] == false) {
				sb.append(i).append('\n');
			}
		}
		
		System.out.println(sb);
	}
}
