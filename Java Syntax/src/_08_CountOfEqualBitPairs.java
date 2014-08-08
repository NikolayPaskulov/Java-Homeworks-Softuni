import java.util.Scanner;

public class _08_CountOfEqualBitPairs {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();	
		
		char[] arr = Integer.toBinaryString(num).toCharArray();
		
		int count11 = 0;
		int count22 = 0;
		

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i]=='1') {
				if (arr[i+1]=='1') {
					count11++;
				}
			}
		}
		
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i]=='0') {
				if (arr[i+1]=='0') {
					count22++;
				}
			}
		}
		

		System.out.print(count11 + count22);

	}

}