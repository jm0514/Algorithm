package algorithm;
import java.util.*;

	public class Infl804{
		
		static int pm[];
		static int n,m ;
	
		public void DFS(int Layer) {
		
			if(Layer == m) {
				for(int x: pm) System.out.print(x+" ");
				System.out.println();
			}else {
					for(int i =1; i<=n; i++) {
						pm[Layer] = i;
						DFS(Layer+1);
					}
				}

		}
		
	public static void main(String[] args) {
		
		Infl804 T = new Infl804();
		Scanner kb = new Scanner(System.in);
		
		n=kb.nextInt();
		m=kb.nextInt();
		
		pm = new int [m];
		
		T.DFS(0);
		
	
	}
	
}

