


import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// 아파트 생성
		int[][] dp = new int[15][15];

		for(int i = 0; i < 15; i++) {
			dp[i][1] = 1;	// i층 1호
			dp[0][i] = i;	// 0층 i호
		}


		for(int i = 1; i < 15; i ++) {	// 1층부터 14층까지

			for(int j = 2; j < 15; j++) {	// 2호부터 14호까지
				dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
			}
		}

		// 테스트 부분
		int T = in.nextInt();

		for(int i = 0; i < T; i++) {
			int k = in.nextInt();
			int n = in.nextInt();
			System.out.println(dp[k][n]);
		}
	}

}

