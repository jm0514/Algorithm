package algorithm;
import java.util.*;

	public class Infl805{
		
		static int n,m , answer = Integer.MAX_VALUE;
	
		public void DFS(int Layer, int sum, Integer arr[]) {
			if(sum>m)return;
			if(Layer>=answer) return;
			if(m==sum) {
				answer = Math.min(answer, Layer);
			}else {
					for(int i =0; i<n; i++) {
						DFS(Layer+1, sum + arr[i], arr);
					}
				}

		}
		
	public static void main(String[] args) {
		
		Infl805 T = new Infl805();
		Scanner kb = new Scanner(System.in);
		
		n=kb.nextInt();
		Integer [] arr = new Integer[n];
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		Arrays.sort(arr, Collections.reverseOrder());
		m=kb.nextInt();
		
		T.DFS(0, 0, arr);
		
		System.out.println(answer);
		
	
	}
	
}

