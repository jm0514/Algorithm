package algorithm;
import java.util.*;

	public class Infl801{
		static String answer = "NO";
		static int n, total = 0;
		boolean flag = false;
		public void DFS(int Layer, int sum, int arr[]) {
			if(Layer == n) {
				if(total/2 < sum) return;
				if(flag)return;
				if((total) == 2*(sum)) {
					answer = "YES";
					flag = true; //�ι�° DFS�� ����� �� �̹� ���� �������� �������ش�.
				}
			}else {
				DFS(Layer+1, sum+arr[Layer], arr); //����Ʈ���� ����
				DFS(Layer+1, sum, arr); //����Ʈ���� ������
			}
		
		}
		
		
	public static void main(String[] args) {
		Infl801 T = new Infl801();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		int arr[] = new int [n];
		for(int i = 0; i<n; i++) {
			arr[i] = kb.nextInt();
			total += arr[i];
		}
		T.DFS(0, 0, arr);
		System.out.print(answer);
	
	}
	
}

