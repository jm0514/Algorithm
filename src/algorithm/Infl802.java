package algorithm;
import java.util.*;

	public class Infl802{
		
		static int answer = Integer.MIN_VALUE;
		static int C,N = 0;
		
		public void DFS(int Layer, int sum, int arr[]) {
			if(C < sum) return;
			if(Layer == N) {
				 // 두 수를 비교할 때 Math.max를 사용한다.
				 // N층에 모든 부분집합들의 합의 조합(sum)이 나오기 때문에 모든 sum과 answer를 비교해야 한다.
				answer = Math.max(answer, sum);
			}else {
				DFS(Layer+1, sum+arr[Layer], arr); 
				DFS(Layer+1, sum, arr);			
				}

		}
		
		
	public static void main(String[] args) {
		
		Infl802 T = new Infl802();
		Scanner kb = new Scanner(System.in);
		
		C=kb.nextInt();
		N=kb.nextInt();
		
		int arr[] = new int [N];
		for(int i = 0; i<N; i++) {
			arr[i] = kb.nextInt();
		}
		
		T.DFS(0, 0, arr);
		System.out.print(answer);
	
	}
	
}

