package algorithm;
import java.util.*;

public class Infl601{
	
	public int[] solution(int n, int arr[]) {
		
		for(int i = 0; i<n-1; i++) {
			int min_index = i;
			for(int j = i+1; j<n; j++) {
				if(arr[min_index]>arr[j]) {
					min_index = j;
				}
				int tmp = arr[i];
				arr[i] = arr[min_index];
				arr[min_index] = tmp;
			}
		}
		
		return arr;
		
	}
	
	
	public static void main(String args[]) {
	Infl601 T = new Infl601();
	Scanner kb = new Scanner(System.in);
	
	int n = kb.nextInt();
	int arr[] = new int[n];	
	
	for(int i =0; i<n; i++) {
		arr[i] = kb.nextInt();
	}
	
	for(int x : T.solution(n, arr)) System.out.print(x+" ");
	}
	
}