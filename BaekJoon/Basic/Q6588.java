package basic;
import java.io.*;
import java.util.*;

public class Q6588 {
	static final int max = 1000000;
	public static void main(String[] args) throws IOException{
		
		boolean[] check = new boolean[max + 1];
		check[0] = true; check[1] = true;
		
		ArrayList<Integer> prime = new ArrayList<>();
		
		for(int i = 2; i*i <= max; i++) {
			
			if(check[i] == true) continue;
			
			prime.add(i);
			for(int j = i + i; j <= max; j += i) {
				check[j] = true;
			}
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
		int n = Integer.parseInt(br.readLine());
		
		if(n == 0) break;
		
		for(int i = 1; i < prime.size(); i++) {
			int p = prime.get(i);
			
			if(check[n - p] == false) {
				System.out.println(n + " = " + p + " + " + (n - p));
				break;
				}
			}
		}
	}
}
