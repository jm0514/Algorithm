package algorithm;
import java.util.*;

public class Infl603{
	
	public int[] solution(int n, int arr[]) {
		
		for(int i = 1; i<n; i++) {
			int tmp = arr[i];
			int j;
			for(j = i-1; j>=0; j--) {
				if(tmp<arr[j]) {
					arr[j+1]=arr[j];
				}else break;
			
			 	arr[j] = tmp;
			}
			
		}
		
		return arr;
		
	}
	
	
	public static void main(String args[]) {
	Infl603 T = new Infl603();
	Scanner kb = new Scanner(System.in);
	
	int n = kb.nextInt();
	int arr[] = new int[n];	
	
	for(int i =0; i<n; i++) {
		arr[i] = kb.nextInt();
	}
	
	for(int x : T.solution(n, arr)) System.out.print(x+" ");
	}
	
}