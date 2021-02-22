package basic;

import java.io.*;
import java.util.*;

public class Q2609 {

	public static int gcd(int x, int y) {
		if(y == 0) {
			return x;
		} else {
			return gcd(y, x%y);
		}
	}
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(s.nextToken());
		int b = Integer.parseInt(s.nextToken());
		
		int g = gcd(a,b);
		int l = a * b / g;
		
		System.out.println(g);
		System.out.println(l);
	}
}
