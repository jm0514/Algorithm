package practice;
import java.util.*;

public class Infl405 {
	public int solution(int n, int m, int arr[]) {
		int answer = 0;
		//내림차순(Collections.reverseOrder()가 없으면 오름차순)
		TreeSet<Integer> ts = new TreeSet<>(Collections.reverseOrder());
		
		for(int i =0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int k=j+1; k<n; k++) {
					ts.add(arr[i]+arr[j]+arr[k]);
				}
			}
		}
		int cnt = 0;
		for(int x : ts) {
			cnt++;
			if(cnt == m) answer = x;
		}
		
		return answer;
	}
		
	public static void main(String[] args) {
		Infl405 T = new Infl405();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int m = kb.nextInt();
		
		int arr[] = new int[n];
		for(int i =0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		
		System.out.print(T.solution(n,m,arr));
	}
	
}
