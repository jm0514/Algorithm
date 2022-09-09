package practice;
import java.util.*;

public class Infl402 {
	public String solution(String s1, String s2) {
		String answer = "Yes";
		HashMap<Character, Integer> map1 = new HashMap<>();
	/* HashMap<Character, Integer> map2 = new HashMap<>();
			for(char x : s1.toCharArray()) {
			map1.put(x, map1.getOrDefault(x, 0)+1);
		}
		
		for(char x : s2.toCharArray()) {
			map2.put(x, map2.getOrDefault(x, 0)+1);
		}
		
		if(map1.equals(map2)){
			answer = "YES";
		}else {
			answer="NO";
		}
	*/
		for(char x : s1.toCharArray()) {
			map1.put(x, map1.getOrDefault(x, 0)+1);
		}
		
		for(char x: s2.toCharArray()) {
			if(!map1.containsKey(x) || map1.get(x)==0) {
				return "NO";
			}
			map1.put(x, map1.get(x)-1);
		}
	
		return answer;
	}
		
	public static void main(String[] args) {
		Infl402 T = new Infl402();
		Scanner kb = new Scanner(System.in);
		
		String str1 = kb.next();
		String str2 = kb.next();
		
		System.out.println(T.solution(str1, str2));
		
	}

	
}
