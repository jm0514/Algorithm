package practice;
import java.util.*;

public class Array11 {
	public int solution(int n, int[][] arr) {
		int answer = 0;
		int max = 0;
		
		for(int i = 1; i<=n; i++) {
			int count = 0;
			for(int j = 1; j<=n; j++) {
				for(int k=1; k<=5; k++) {
					if(arr[i][k] == arr[j][k]) {
						count++;
						break;
						
					}
				}	
			}
			if(count>max) {
				max= count;
				answer = i;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Array10 T = new Array10();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n+1][6];
		
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=5; j++) {
			arr[i][j] = kb.nextInt();
			}
		}
		System.out.print(T.solution(n, arr));
	}

}
