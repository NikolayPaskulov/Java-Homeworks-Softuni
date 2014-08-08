import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class _07_DaysBetweenTwoDates {


    public static void main(String[] args) throws ParseException {
    	Scanner in = new Scanner(System.in);
    	
    	String input1 = in.next();
    	String input2 = in.next();
    	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    	
    	Date firstDate = dateFormat.parse(input1);
    	Date secondDate = dateFormat.parse(input2);
    	
    	 System.out.println((int)daysBetween(firstDate, secondDate));
    }
    
    public static double daysBetween(Date firstDate, Date secondDate) {
    	long diff = 0;
    	
    	diff = secondDate.getTime() - firstDate.getTime();
    	return ((double) diff) / (86400.0 * 1000.0);
    }

}