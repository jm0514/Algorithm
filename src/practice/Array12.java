package practice;
import java.util.*;

import java.util.Scanner;

public class Array12 {
	public int solution(int n, int m, int arr[][]) {
		int answer = 0;
		
		for(int i = 1; i<=n; i++ ) {
			for(int j = 1; j <=n; j++) {
				int count = 0;
				for(int k = 0; k<m; k++) {
					int si=0, sj=0;
					for(int s = 0; s<n; s++) {
						if(arr[k][s] == i) {
							si = s;
						}
						if(arr[k][s]==j) {
							sj = s;
						}
						
					}
					if(si < sj) {
						count++;
					}
				}
				if(count == m) {
					answer++;
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String args[]) {
		Array12 T = new Array12();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int m = kb.nextInt();
		
		int arr[][] = new int[m][n];
		
		for(int i = 0; i<m; i++) {
			for(int j = 0; j<n; j++ ) {
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.print(T.solution(n,m,arr));
	}

}
