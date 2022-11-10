package algorithm;
import java.util.*;

	public class Infl803{
		
		static int answer = Integer.MIN_VALUE;
		static int n,m =0;
	
		public void DFS(int Layer, int scoreSum, int timeSum, int Qscore[], int Qtime[]) {
			if( m < timeSum ) return;
		
			if(Layer == n) {
				
				answer = Math.max(answer, scoreSum);
			}else {
				DFS(Layer+1, scoreSum+Qscore[Layer], timeSum+Qtime[Layer], Qscore, Qtime); 
				DFS(Layer+1, scoreSum, timeSum, Qscore, Qtime);			
				}

		}
		
	public static void main(String[] args) {
		
		Infl803 T = new Infl803();
		Scanner kb = new Scanner(System.in);
		
		n=kb.nextInt();
		m=kb.nextInt();
		
		int a[] = new int [n];
		int b[] = new int[n];
		
		for(int i = 0; i<n; i++) {
			a[i] = kb.nextInt();
			b[i] = kb.nextInt();
		}
		
		T.DFS(0, 0, 0, a, b);
		System.out.print(answer);
	
	}
	
}

