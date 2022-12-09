package algorithm;
import java.util.*;

	class Infl815{
		
		static int answer = 0, n;
		static int board[][];
		static int dx[] = {-1, -1, 0, 1, 1, 1, 0, -1};
		static int dy[] = {0, 1, 1, 1, 0, -1, -1, -1};
		Queue<Point> Q = new LinkedList<>();
		
		class Point{
			public int x,y;
			Point(int x, int y){
				this.x = x;
				this.y = y;
			}
		}
		
		public void BFS(int x, int y, int board[][]) {
			Q.offer(new Point(x, y));
			while(!Q.isEmpty()) {
			Point tmp = Q.poll();
			for(int i = 0; i< 8; i++) {
				int nx = dx[i] + tmp.x;
				int ny = dy[i] + tmp.y;
				if(nx >= 0 && nx < n && ny >= 0 && ny <n && board[nx][ny] ==1) {
					board[nx][ny] = 0;
					Q.offer(new Point(nx, ny));
				}
			}
			}
		}
		
		public void solution(int board[][]) {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n ; j++) {
					if(board[i][j]==1) {
						answer++;
						board[i][j]=0;
						BFS(i, j, board);
					}
				}
			}
		}

		public static void main(String[] args){
			Infl815 T = new Infl815();
			Scanner kb = new Scanner(System.in);
			n=kb.nextInt();
			int[][] arr=new int[n][n];
			for(int i=0; i<n; i++){
				for(int j=0; j<n; j++){
					arr[i][j]=kb.nextInt();
				}
			}
			T.solution(arr);
			System.out.println(answer);
		}
}

