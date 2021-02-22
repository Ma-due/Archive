package basic;

import java.io.*;
import java.util.*;
public class Q1107 {

	static ArrayList<Integer> al;
	static int target;
	public static void main(String[] args) throws IOException{
		
		Scanner scan = new Scanner(System.in);
		
		target = scan.nextInt();
		int broken = scan.nextInt();
		al = new ArrayList<>();
		
		for(int i = 0; i < broken; i++) {
			al.add(scan.nextInt());
		}
		
		int ans = Math.abs(100 - target);
		
		if(target != 100) {
			for(int i = 0; i <= 999999; i++) {
				ans = Math.min(solve(i), ans);
			}
		}
		
		System.out.println(ans);
	}
	
	static int solve(int i) {
		
		int check = i, length = 0;

		
		while(check != 0) {
			if(al.contains(check%10)) {
				return Integer.MAX_VALUE;
			}
			check /= 10;
			length++;
		}
		
		if(i == 0 && !al.contains(0)) length = 1;
		
		if(length == 0) return Math.abs(100 - target);
		
		return length + Math.abs(target - i);		
	}
}
