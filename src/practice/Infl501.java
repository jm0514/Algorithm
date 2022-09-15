package practice;
import java.util.*;

public class Infl501 {
	public String solution(String str) {
		String answer = "YES";
		Stack<Character> stack = new Stack<>();
		for(char x : str.toCharArray()) {
			if(x=='(') {
				stack.push(x);
			}else {
				if(stack.isEmpty()) {
					answer = "NO";
				}
				stack.pop();
			}
			
		}
		if(!stack.isEmpty()) {
			answer = "NO";
		}
		
		return answer;
	}
		
	public static void main(String[] args) {
		Infl501 T = new Infl501();
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next();
		
		System.out.print(T.solution(str));
	}
	
}
