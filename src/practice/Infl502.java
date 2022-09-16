package practice;
import java.util.*;

public class Infl502 {
	public String solution(String str) {
		String answer = "";
		Stack<Character> stack = new Stack<>();
		
		for(char x : str.toCharArray()) {
			if(x == ')') {
				while(stack.pop()!='('); //pop은 값을 리턴하기 때문에 조건에서 끝낼 수 있다.
			}else stack.push(x);
		}
		for(int i =0; i<stack.size(); i++) {
			answer += stack.get(i); //스택에서 각 자리에 있는 값을 꺼낼 때 get을 이용한다.
		}
		
		return answer;
	}
		
	public static void main(String[] args) {
		Infl502 T = new Infl502();
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next();
		
		System.out.print(T.solution(str));
	}
	
}