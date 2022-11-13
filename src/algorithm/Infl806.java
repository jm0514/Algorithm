package algorithm;
import java.util.*;

	public class Infl806{
		
		static int n,m;
		static int[] pm, ch, arr;
	
		public void DFS(int Layer) {
			if(Layer==m) {
				for(int x: pm)System.out.print(x+" ");
				System.out.println();
				
			}else {
				for(int i=0; i<n; i++) {
					if(ch[i] ==0 ) {
						ch[i]=1;
						pm[Layer]=arr[i];
						DFS(Layer+1);
						ch[i]=0;
						
					}
				}
			}
			

		}
		
	public static void main(String[] args) {
		
		Infl806 T = new Infl806();
		Scanner kb = new Scanner(System.in);
		
		n=kb.nextInt();
		m=kb.nextInt();
		arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=kb.nextInt();
			
		}
		ch=new int[n];
		pm=new int[m];
		T.DFS(0);
	
	}
	
}

