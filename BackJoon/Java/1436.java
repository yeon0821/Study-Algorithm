
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        System.out.println(tlqkf(N, 0));
    }

    static int tlqkf(int N, int count) {
        // N이 2 미만인 경우 누적된 count값을 반환
        if (N < 2) {
            return count;
        }
        return Math.min(tlqkf(N / 2, count + 1 + (N % 2)), tlqkf(N / 3, count + 1 + (N % 3)));

    }
}
