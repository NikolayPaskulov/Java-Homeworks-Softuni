import java.util.Scanner;

public class _07_CounToBitsOne {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		
		System.out.println(Integer.bitCount(a));
	}
	
	

}
