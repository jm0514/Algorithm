package practice;
import java.util.*;

public class Infl403 {
	public ArrayList<Integer> solution(int n , int m, int arr[]) {
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> hashmap = new HashMap<>();
	
		for(int i = 0; i<m-1; i++) {
			hashmap.put(arr[i], hashmap.getOrDefault(arr[i], 0)+1);
		}
		int lt = 0;
		for(int rt = m-1; rt<n; rt++) {
			hashmap.put(arr[rt],hashmap.getOrDefault(arr[rt], 0)+1);
			answer.add(hashmap.size());
			hashmap.put(arr[lt], hashmap.get(arr[lt])-1);
			if(hashmap.get(arr[lt])==0) {
				hashmap.remove(arr[lt]);
			}
			lt++;
		}
	
		return answer;
	}
		
	public static void main(String[] args) {
		Infl403 T = new Infl403();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int m = kb.nextInt();
		int arr[] = new int [n];
		
		for(int i = 0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		
		for(int x : T.solution(n, m, arr))System.out.print(x +" ");
	}
	
}
