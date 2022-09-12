package practice;
import java.util.*;

public class Infl404 {
	public int solution(String str1, String str2) {
		int answer = 0;
		HashMap<Character, Integer> hm1 = new HashMap<>(); 
		HashMap<Character, Integer> hm2 = new HashMap<>();
	
		for(char x : str2.toCharArray()) {
				hm2.put(x, hm2.getOrDefault(x,0)+1);
			}
		int L = str2.length()-1;
		for(int i = 0; i<L; i++) {
			hm1.put(str1.charAt(i), hm1.getOrDefault(str1.charAt(i), 0)+1);
		}
		int lt = 0;
		for(int rt = L; rt<str1.length(); rt++) {
			hm1.put(str1.charAt(rt), hm1.getOrDefault(str1.charAt(rt),0)+1);
			if(hm1.equals(hm2)) {
				answer++;
			}
			hm1.put(str1.charAt(lt), hm1.get(str1.charAt(lt))-1);
			if(hm1.get(str1.charAt(lt))==0) {
				hm1.remove(str1.charAt(lt));
			}
			lt++;
			
		}
		return answer;
	}
		
	public static void main(String[] args) {
		Infl404 T = new Infl404();
		Scanner kb = new Scanner(System.in);
		
		String str1 = kb.next();
		String str2 = kb.next();		
		
		System.out.print(T.solution(str1,str2));
	}
	
}
