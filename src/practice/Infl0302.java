package practice;
import java.util.*;

public class Infl0302 {
	public ArrayList<Integer> solution (int n, int m, int arr1[], int arr2[]){
		ArrayList<Integer> answer = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
			if(arr1[n] == arr2[m]) {
				answer.add(arr2[m]);
			}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Infl0302 T = new Infl0302();
		Scanner kb = new Scanner(System.in);
		
		
		int n = kb.nextInt();
		int arr1[] = new int[n];
		for(int i =0; i<n; i++) {
			arr1[i] = kb.nextInt();
		}
		
		
		int m = kb.nextInt();
		int arr2[] = new int[m];
		for(int i =0; i<m; i++) {
			arr2[i] = kb.nextInt();
		}
		
		
		for(int x : T.solution(n, m, arr1, arr2))System.out.print(x+ " ");
		
		
	}


}
