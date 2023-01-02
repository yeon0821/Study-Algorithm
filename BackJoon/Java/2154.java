 import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();

		for(int i = 1 ; i <= 100000 ; i++) {
			sb.append(i);
		}

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		System.out.println(sb.indexOf(str) + 1);
		sc.close();
	}
}
