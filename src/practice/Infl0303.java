package practice;
import java.util.*;

public class Infl0303 {
	public int solution(int n, int m, int arr[]) {
		int answer=0;
		int sum = 0;
		
		for(int i =0; i<m; i++) {
			sum += arr[i];
			answer = sum;
				
		}
		for(int i = m; i<n; i++) {
			sum += (arr[i]-arr[i-m]);
			answer  = Math.max(answer, sum);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Infl0303 T = new Infl0303();
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		
		int arr[] = new int[n];
		
		for(int i =0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.print(T.solution(n, m, arr));
	
	}
	

	
}
