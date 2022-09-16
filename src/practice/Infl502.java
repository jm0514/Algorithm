package practice;
import java.util.*;

public class Infl502 {
	public String solution(String str) {
		String answer = "";
		Stack<Character> stack = new Stack<>();
		
		for(char x : str.toCharArray()) {
			if(x == ')') {
				while(stack.pop()!='('); //pop�� ���� �����ϱ� ������ ���ǿ��� ���� �� �ִ�.
			}else stack.push(x);
		}
		for(int i =0; i<stack.size(); i++) {
			answer += stack.get(i); //���ÿ��� �� �ڸ��� �ִ� ���� ���� �� get�� �̿��Ѵ�.
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