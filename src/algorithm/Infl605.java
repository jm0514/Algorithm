package algorithm;
import java.util.*;

public class Infl605{
	
	public String solution(int n, int arr[]) {
		String answer = "U";
		Arrays.sort(arr);
		
		for(int i=0; i<n-1; i++) {
			if(arr[i]==arr[i+1]) {
				return "D";
			}
		}
		
		/*for(int i =0; i<n-1; i++) {
			for(int j = i+1; j<n; j++) {
				if(arr[i] == arr[j] ) {
					return "D";
				}
			}
		}
		*/	
		
		return answer;
		
	}
	
	
	public static void main(String args[]) {
	Infl605 T = new Infl605();
	Scanner kb = new Scanner(System.in);
	
	int s = kb.nextInt();

	int arr[] = new int[s];	
	
	for(int i =0; i<s; i++) {
		arr[i] = kb.nextInt();
	}
	System.out.print(T.solution(s,arr));
	}
	
}