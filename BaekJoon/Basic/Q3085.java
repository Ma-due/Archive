package basic;

import java.io.*;
import java.util.*;

public class Q3085 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n  = Integer.parseInt(br.readLine());
		
		char[][] arr = new char[n][n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = br.readLine().toCharArray();
		}
		
		int ans = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(j + 1 < n) {
					char t = arr[i][j]; arr[i][j] = arr[i][j+1]; arr[i][j+1] = t;
					int temp = check(arr, i, i, j, j+1);
					if(ans < temp) ans = temp;
					t = arr[i][j]; arr[i][j] = arr[i][j+1]; arr[i][j+1] = t;
				}
				
				if(i + 1 < n) {
					char t = arr[i][j]; arr[i][j] = arr[i+1][j]; arr[i+1][j] = t;
					int temp = check(arr, i, i+1, j, j);
					if(ans < temp) ans = temp;
					t = arr[i][j]; arr[i][j] = arr[i+1][j]; arr[i+1][j] = t;
				}
			}
		}
		
		System.out.println(ans);
	}
	
	static int check(char[][] arr, int start_row, int end_row, int start_col, int end_col) {
		int n = arr.length;
		int ans = 1;
		for(int i = start_row; i <= end_row; i++) {
			int cnt = 1;
			for(int j = 1; j < n; j++) {
				if(arr[i][j] == arr[i][j-1]) {
					cnt += 1;
				} else {
					cnt = 1;
				}
				if(ans < cnt) ans = cnt;
			}
		}
		for(int i = start_col; i <= end_col; i++) {
			int cnt = 1;
			for(int j = 1; j < n; j++) {
				if(arr[j][i] == arr[j-1][i]) {
					cnt +=1;
				} else {
					cnt = 1;
				}
				if(ans < cnt) ans = cnt;
			}
		}
		return ans;
	}
}
