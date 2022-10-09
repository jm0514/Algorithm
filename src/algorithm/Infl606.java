package algorithm;
import java.util.*;

public class Infl606{
	
	public ArrayList<Integer> solution(int n, int arr[]) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		int tmp[] = arr.clone(); // 배열 복사
		Arrays.sort(tmp);
		
		for(int i = 0; i <n; i++) {
			if(arr[i]!=tmp[i]) {
				answer.add(i+1);
			}
		}
		
		return answer;
		
	}
	
	
	public static void main(String args[]) {
	Infl606 T = new Infl606();
	Scanner kb = new Scanner(System.in);
	
	int s = kb.nextInt();

	int arr[] = new int[s];	
	
	for(int i =0; i<s; i++) {
		arr[i] = kb.nextInt();
	}
	
	for(int x: T.solution(s, arr))System.out.print(x+" ");
	}
	
}