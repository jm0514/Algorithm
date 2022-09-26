package algorithm;
import java.util.*;

public class Infl507{
	public String solution(String str1, String str2) {
		String answer = "YES";
		
		Queue<Character> Q = new LinkedList<>();
		
		
		for(char x : str1.toCharArray()) {
			 Q.offer(x);
		}
		
		for(int i =0; i<str2.length(); i++) {
			if(Q.contains(str2.charAt(i))) {
				if(Q.poll() != str2.charAt(i)) { //poll�� �ϰ� �Ǹ� �Ǿտ� �ڸ��� �����鼭(����) �����Ѵ�.
					return "NO";
				}
			}
		}
		
		if(Q.size() != 0) {
			return "NO";
		}
		
		
		return answer;
		
	}
	
	
	
	public static void main(String args[]) {
	Infl507 T = new Infl507();
	Scanner kb = new Scanner(System.in);
	
	String st1 = kb.next();
	String st2 = kb.next();
	
	System.out.print(T.solution(st1, st2));
	}
}