package algorithm;
import java.util.*;

	public class Infl706{
		static int n, m=0;
		static ArrayList<ArrayList<Integer>> graph;
		static int[] check;
		static int[] dis;
		public void BFS(int v) {
			Queue<Integer> queue = new LinkedList<>();
			check[v] = 1;
			dis[v] = 0;
			queue.offer(v);
			while(!queue.isEmpty()) {
				int currentv = queue.poll();
				for(int nextv: graph.get(currentv)) {
					if(check[nextv]==0) {
						check[nextv] = 1;
						queue.offer(nextv);
						dis[nextv] = dis[currentv] +1;
					}
				}
			}
		
		
		}
		
		
	public static void main(String[] args) {
		Infl706 T = new Infl706();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		m=kb.nextInt();
		graph=new ArrayList<ArrayList<Integer>>();
		for(int i =0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		check = new int [n+1];
		dis = new int [n+1];
		for(int i = 0; i<m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph.get(a).add(b);
		}
		T.BFS(1);
		for(int i = 2; i<=n; i++) {
			System.out.println(i+" : "+dis[i]);
		}
	}
	
}

