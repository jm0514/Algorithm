package algorithm;
import java.util.*;

	public class Infl810{ // 시계 방향 12시부터
		static int dx[] = {-1, 0, 1, 0};
		static int dy[] = { 0, 1, 0, -1};
		static int[][] board;
		static int answer = 0;
		
		public void DFS(int x, int y) {
			if(x == 7 && y==7) answer ++;
			else {
				for(int i = 0; i<4; i++) {
					int ax = x + dx[i];
					int ay = y + dy[i];
					if(ax >=1 && ax <=7 && ay >= 1 && ay <=7 && board[ax][ay] == 0) {
						board[ax][ay] = 1;
						DFS(ax, ay);
						board[ax][ay] = 0; // back
					}
				}
			}
			
		}
		
	public static void main(String[] args) {
		
		Infl810 T = new Infl810();
		Scanner kb = new Scanner(System.in);
		board = new int [8][8];
		
		for(int i = 1;  i<=7; i++) {
			for(int j = 1; j<=7; j++) {
				board[i][j] = kb.nextInt(); 
			}
		}
		board[1][1] = 1;
		T.DFS(1,1);
		System.out.print(answer);
	}
	
}

