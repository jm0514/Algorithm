package practice;

import java.util.*;

public class Array08 {
	
	public int[] solution(int n, int arr[]){
		int[] answer = new int[n];
		
		for(int i = 0; i<n; i++) {
			int count = 1;
			
			for(int j = 0; j<n; j++) {
				if(arr[i] < arr[j]) {
					count++;
				}
				answer[i] = count;
			}
		}
		
		return answer;
	}
	
	public static void main(String arg[]) {
		Array08 T = new Array08();
		
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		
		for(int x: T.solution(n,arr))System.out.print(x + " ");
	}

}
