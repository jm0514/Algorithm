package algorithm;
import java.util.*;

public class Infl506 {
	public int solution(int n,int m) {
		int answer = 0;
		//큐 생성
		Queue<Integer> Q = new LinkedList<>();
		
		//큐는 offer와 poll을 사용해 넣고 뺼 수 있다.
		for(int i = 1; i<=n; i++) {
			Q.offer(i);
		}
		while(!Q.isEmpty()) {
			for(int i =1; i<m; i++) {
				Q.offer(Q.poll());
			}
			Q.poll();
			if(Q.size()==1) {
				answer = Q.poll();
			}
		}
		
		
		
		return answer;
	}
		
	public static void main(String[] args) {
		Infl506 T = new Infl506();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int m = kb.nextInt();
		
		System.out.print(T.solution(n, m));
	}
}