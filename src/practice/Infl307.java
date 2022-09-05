package practice;
import java.util.*;


public class Infl307 {
	public int solution(int n, int m, int arr[]) {
		int answer=0, lt =0, count=0;
		
		for(int rt = 0; rt<n; rt++) {
			if(arr[rt] == 0) {
				count++;
			}
			while(count>m) {
				if(arr[lt] == 0) {
					count--;
				}
					lt++;
				}
			answer = Math.max(answer, rt-lt+1);
		}
		
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Infl307 T = new Infl307();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int m = kb.nextInt();
		
		int arr[] = new int [n];
		
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		
		System.out.print(T.solution(n, m ,arr));
		
	}

	
}
