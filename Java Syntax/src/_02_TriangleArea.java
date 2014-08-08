import java.util.Scanner;

public class _02_TriangleArea {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double Ax = in.nextDouble();
		double Ay = in.nextDouble();
		double Bx = in.nextDouble();
		double By = in.nextDouble();
		double Cx = in.nextDouble();
		double Cy = in.nextDouble();
		
		double area = ((Ax *(By - Cy) + Bx * (Cy - Ay) + Cx * (Ay - By)) / 2);
		
		
		System.out.println(Math.abs(area));
	}

}
