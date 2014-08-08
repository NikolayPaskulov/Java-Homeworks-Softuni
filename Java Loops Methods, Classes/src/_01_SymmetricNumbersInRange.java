import java.util.Scanner;

public class _01_SymmetricNumbersInRange {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int start = in.nextInt();
		int end = in.nextInt();

		for (int i = start; i <= end; i++) {
			String normal = Integer.toString(i);
			String reverse = new StringBuilder(Integer.toString(i)).reverse().toString();
			if(normal.equals(reverse)) {
				System.out.print(i + " ");
			}
		}

	}
}

