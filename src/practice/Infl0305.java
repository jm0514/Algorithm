package practice;
import java.util.*;

/*
public class Infl0305 {
	public int solution(int n) {
		int answer =0;
		
		for(int i =1; i< n;  i++) {
			int sum = 0;
			for(int j = i; j<n; j++) {
				sum += j;
				if(sum == n) {
					answer++;
					break;
				}
			}
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Infl0305 T = new Infl0305();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		
		System.out.print(T.solution(n));
		
	}

	
}
*/

public class Infl0305 {
	public int solution(int n) {
		int answer=0, sum =0, lt =0;
		int max = n/2+1;
		int arr[] = new int[max];
		
		for(int i=0; i<max; i++) {
			arr[i] = i+1;
		}
		for(int rt = 0; rt<max; rt++) {
			sum += arr[rt];
			if(sum == n) {
				answer++;
			}
			while(sum >= n) {
				sum -= arr[lt++];
				if(sum ==n) {
					answer++;
				}
			}
			
		}
		
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Infl0305 T = new Infl0305();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		
		System.out.print(T.solution(n));
		
	}

	
}
