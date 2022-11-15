package algorithm;
import java.util.*;

	public class Infl807{
		
		int [][] dy = new int [35][35];
		public int DFS(int n, int r) {
			if(n==r || r==0) return 1;
			else {
				return dy[n][r] = DFS(n-1, r-1)+DFS(n-1, r);
			}
		}
		
	public static void main(String[] args) {
		
		Infl807 T = new Infl807();
		Scanner kb = new Scanner(System.in);
		
		int n=kb.nextInt();
		int r=kb.nextInt();
		
		System.out.println(T.DFS(n,r));
	
	}
	
}

