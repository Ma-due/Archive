package basic;

import java.io.*;
import java.util.*;

public class Q14500 {

	static int[][][] block = {
			{{1,0}, {2,0}, {3,0}},
			{{0,1}, {0,2}, {0,3}},
			{{0,1}, {1,0}, {1,1}},
			{{1,0}, {2,0}, {2,1}},
			{{0,1}, {0,2}, {-1,2}},
			{{0,1}, {1,1}, {2,1}},
			{{1,0}, {0,1}, {0,2}},
			{{0,1}, {-1,1}, {-2,1}},
			{{0,1}, {0,2}, {1,2}},
			{{0,1}, {1,0}, {2,0}},
			{{1,0}, {1,1}, {1,2}},
			{{1,0}, {1,1}, {2,1}},
			{{0,1}, {-1,1}, {-1,2}},
			{{1,0}, {0,1}, {-1,1}},
			{{0,1}, {1,1}, {1,2}},
			{{0,1}, {1,1}, {0,2}},
			{{0,1}, {-1,1}, {0,2}},
			{{1,0}, {1,1}, {2,0}},
			{{1,0}, {1,-1}, {2,0}}
		};
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(s.nextToken());
		int m = Integer.parseInt(s.nextToken());
		
		int[][] arr = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			s = new StringTokenizer(br.readLine());	
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(s.nextToken());
			}
		}
		
		int ans = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				for(int k = 0; k < 19; k++) {
					boolean ok = true;
					int sum =  arr[i][j];
					for(int l = 0; l < 3; l++) {
						int x = i + block[k][l][0];
						int y = j + block[k][l][1];
						
						if(x < 0 || y < 0 || x >= n || y >= m) {
							ok = false;
							break;
						} else {
							sum += arr[x][y];
						}
					}
					
					if(ok && ans < sum) {
						ans = sum;
					}
				}
			}
		}
		
		System.out.println(ans);
	}
}
