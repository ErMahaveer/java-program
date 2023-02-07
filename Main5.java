import java.util.Scanner;

public class Main5 {
	static final int[] PARTNER_BERTH_NUMBER = { 3, 4, 5, 0, 1, 2, 7, 6 };
	static final String[] PARTNER_BERTH_CODE = { "LB", "MB", "UB", "LB", "MB", "UB", "SU", "SL" };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();

			System.out.println(solve(N));
		}

		sc.close();
	}

	static String solve(int N) {
		int compartment = (N - 1) / 8;
		int berthNumber = (N - 1) % 8;

		return String.format("%d%s", compartment * 8 + PARTNER_BERTH_NUMBER[berthNumber] + 1,
				PARTNER_BERTH_CODE[berthNumber]);
	}
}