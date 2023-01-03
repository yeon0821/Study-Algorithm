import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[1001];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 1;
        for (int i = 4; i <= n; i++) {
            dp[i] = Math.min(dp[i-1],dp[i-3]) + 1;
        }
        if (dp[n] % 2 == 0) {
            System.out.print("CY");
        } else {
            System.out.print("SK");
        }
    }
}
