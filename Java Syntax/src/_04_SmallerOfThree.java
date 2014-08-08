import java.util.Scanner;

public class _04_SmallerOfThree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		
		double smallest = a;
		if (smallest > b) smallest = b;
		if (smallest > c) smallest = c;
		
		System.out.println(smallest);
	}

}
