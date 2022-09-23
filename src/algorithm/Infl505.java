package algorithm;
import java.util.*;

public class Infl505 {
	public int solution(String str) {
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '(') {
				stack.push('(');
			}else {
				stack.pop();
				if(str.charAt(i-1) == '(') {
					answer += stack.size(); //쌓여있는 '('의 개수만큼 answer가 증가함
				}else {
					answer++;
				}
			}
		}
		
		
		return answer;
	}
		
	public static void main(String[] args) {
		Infl505 T = new Infl505();
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next();
		
		System.out.print(T.solution(str));
	}
}