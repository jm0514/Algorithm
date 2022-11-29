package algorithm;
import java.util.*;

	public class Infl809{
		static int n, f;
		static int arr[];
		
		
		public void DFS(int L, int s) {
			if(L==f) {
				for(int x : arr)System.out.print(x + " ");
				System.out.println();
			}else {
				for(int i=s; i<=n; i++) {
					arr[L] = i;
					DFS(L+1, i+1);
				}
			}
			
		}
		
	public static void main(String[] args) {
		
		Infl809 T = new Infl809();
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		f = kb.nextInt();
		
		arr= new int [f];
		
		T.DFS(0,1);
		
	}
	
}

