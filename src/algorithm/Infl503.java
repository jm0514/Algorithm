package algorithm;
import java.util.*;

public class Infl503 {
	public int solution(int board[][], int moves[]) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(int pos : moves) {
			for(int i =0; i<board.length; i++) { //열의 길이는 board[].length
				if(board[i][pos-1] !=0) {
					int pick = board[i][pos-1];
					board[i][pos-1] = 0;
					if(!stack.empty() && stack.peek()==pick ) { //peek는 stack의 맨 위값을 리턴
						answer += 2;
						stack.pop();
					}else {
						stack.push(pick);
					}
					break;
				}
			}
		}
		
		
		
		return answer;
	}
		
	public static void main(String[] args) {
		Infl503 T = new Infl503();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int [][] board = new int [n][n];		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				board[i][j] = kb.nextInt();
			}
		}
		
		int m = kb.nextInt();
		
		int moves[] = new int[m];
		for(int i = 0; i<m; i++) {
			moves[i] = kb.nextInt();
		}
		
		System.out.print(T.solution(board, moves));
	}
	
}