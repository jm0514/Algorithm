package algorithm;
import java.util.*;

public class Infl604{
	
	public int[] solution(int size, int n, int input[]) {
		
		int cache[] = new int[size];
		
		for(int x : input) {
			int pos = -1;
			for(int i = 0; i< size; i++) {
				if(x==cache[i]) {
					pos = i;
				}
			}
			
			if(pos == -1) {
				for(int i = size -1; i >= 1; i--) {
				cache[i] = cache[i-1];
				}
			}
			else{
				for(int i = pos -1; i >= 1; i--) {
				cache[i] = cache[i-1];
				}
			}
			cache[0] = x;
		}
		return cache;
		
	}
	
	
	public static void main(String args[]) {
	Infl604 T = new Infl604();
	Scanner kb = new Scanner(System.in);
	
	int s = kb.nextInt();
	int n = kb.nextInt();
	
	int input[] = new int[n];	
	
	for(int i =0; i<n; i++) {
		input[i] = kb.nextInt();
	}
	
	for(int x : T.solution(s, n , input)) System.out.print(x+" ");
	}
	
}