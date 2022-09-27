package algorithm;
import java.util.*;

public class Infl508{
	
	class Person{
		int id;
		int priorty;
		
		public Person(int id, int priorty){
			this.id = id;
			this.priorty = priorty;
		}
	}
	
	public int solution(int n, int m, int arr[]) {
		int answer = 0;
		
		Queue<Person> Q = new LinkedList<>();
		
		for(int i = 0; i<n; i++) {
			Q.offer(new Person(i, arr[i]));
		}
		
		while(!Q.isEmpty()) {
			Person tmp = Q.poll();
			for(Person x : Q) {
				if(x.priorty>tmp.priorty) {
					Q.offer(tmp);
					tmp=null;
					break;
				}
			}
			if(tmp != null) {
				answer ++;
				if(tmp.id == m) {
					return answer;
				}
			}
		}
		
		return answer;
		
	}
	
	
	public static void main(String args[]) {
	Infl508 T = new Infl508();
	Scanner kb = new Scanner(System.in);
	
	int n = kb.nextInt();
	int m = kb.nextInt();
	int arr[] = new int[n];	
	
	for(int i =0; i<n; i++) {
		arr[i] = kb.nextInt();
	}
	
	System.out.print(T.solution(n, m, arr));
	}
}