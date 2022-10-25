package algorithm;
import java.util.*;

	public class Infl702{
		
		int A[] = {-1, 1, 5};
		int ch[];
		Queue<Integer> Q =new LinkedList<>();
		
		public int BFS(int start, int end) {
			ch = new int[10001];
			ch[start] = 1;
			int L = 0;
			Q.offer(start);
			while(!Q.isEmpty()) {
				int len = Q.size();
				for(int i = 0; i<len; i++) {
				int x = Q.poll();
				if(x==end) {
					return L;
				}
				
				 for(int j = 0; j < 3; j++){
					int nx = x + A[j];
					if(nx >= 0 && nx <= 10000 && ch[nx]==0) {
						ch[nx] = 1;
						Q.offer(nx);
					}
				}
				 
				}
				L++;
			}
			return -1;
		}
	public static void main(String[] args) {
		Infl702 T = new Infl702();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int m = kb.nextInt();
		
		System.out.print(T.BFS(n,m));
		
	}
	
}

