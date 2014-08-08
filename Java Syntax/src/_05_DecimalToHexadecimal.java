import java.util.Scanner;

public class _05_DecimalToHexadecimal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int number = in.nextInt();
		String hex  = Integer.toHexString(number);
		System.out.println(hex.toUpperCase());
	}

}
