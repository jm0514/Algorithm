package practice;
import java.util.*;

public class Infl0401 {
	public char solution(int n, String s) {
		char answer = ' ';
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char x : s.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		int max = Integer.MIN_VALUE;
		for(char key : map.keySet()) {
			if(map.get(key)>max) {
				max = map.get(key);
				answer = key;
			}
		}
	
		return answer;
	}
		
	public static void main(String[] args) {
		Infl0401 T = new Infl0401();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str = kb.next();
		
		System.out.println(T.solution(n, str));
		
	}

	
}
