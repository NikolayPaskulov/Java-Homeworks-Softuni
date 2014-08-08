import java.util.Scanner;

public class _05_Converter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		double[] number = new double[n];
		String[] type = new String[n];
		
		for (int i = 0; i < n; i++) {
			number[i] = in.nextDouble();
			type[i] = in.next();
		}
		
		for (int i = 0; i < n; i++) {
			converter(number[i], type[i]);
		}
	}
	
	public static void converter(double number, String type) {
		
		double result = 0;	
		
		if(type.equals("deg")) {
			result = Math.toRadians(number);
			System.out.printf("%.6f rad \n", result);
		}
		else {
			result = Math.toDegrees(number);
			System.out.printf("%.6f deg \n", result);
		}
	}

}
