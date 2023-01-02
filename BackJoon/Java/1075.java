import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int f = sc.nextInt();
        n = (n/100) * 100; // 마지막 두자리 00으로 바꾸기

        while (n % f != 0)// 나누어 떨어지는 수 찾기
            n++;
        n %= 100;

        if (n < 10) System.out.println("0"+ n);
        else System.out.println(n);
    }
}
