package algorithm;
import java.util.*;


class Infl815 {
	static class Point{
		public int x, y;
		Point(int x, int y){
			this.x=x;
			this.y=y;
		}
	}
	
	static int n, m, len, answer=Integer.MAX_VALUE;
	static int[] combi;
	static ArrayList<Point> home, pizza;
	public void DFS(int L, int s){
		if(L==m){
			int sum=0;
			for(Point h : home){
				int dis=Integer.MAX_VALUE;
				for(int i : combi){
					dis=Math.min(dis, Math.abs(h.x-pizza.get(i).x)+Math.abs(h.y-pizza.get(i).y));
				}
				sum+=dis;
			}
			answer=Math.min(answer, sum);
		}
		else{ // 조합생성(암기하자!)
			for(int i=s; i<len; i++){
				combi[L]=i;
				DFS(L+1, i+1);
			}
		}
	}

	public static void main(String[] args){
		Infl815 T = new Infl815();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		m=kb.nextInt();
		pizza=new ArrayList<>();
		home=new ArrayList<>();
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				int tmp=kb.nextInt();
				if(tmp==1) home.add(new Point(i, j));
				else if(tmp==2) pizza.add(new Point(i, j));
			}
		}
		len=pizza.size();
		combi=new int[m];
		T.DFS(0, 0);
		System.out.println(answer);
	}
}

