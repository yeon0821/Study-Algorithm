import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

         int min = (int) Math.ceil(Math.sqrt(m));
         int sum = 0;
        for (int i = min; i <= Math.floor(Math.sqrt(n)); i++) {
             sum += Math.pow(i, 2);

        }

         if (sum > 0) {
            System.out.println(sum);
            System.out.println((int) Math.pow(min, 2));

        } else System.out.println(-1);
    }
}
