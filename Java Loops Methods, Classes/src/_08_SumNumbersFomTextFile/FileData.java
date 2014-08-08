package _08_SumNumbersFomTextFile;
import java.io.IOException;

public class FileData {

	public static void main(String[] args) throws IOException {
		
		String file_name = "C:/Input.txt";
		
		try {
			ReadFile file = new ReadFile(file_name);
			String[] aryLines = file.OpenFile();
			
			int result = 0;
			
			for (int i = 0; i < aryLines.length; i++) {
				result += Integer.parseInt(aryLines[i]);
			}
			System.out.println(result);
		}
		
		catch (IOException e) {
			System.out.println("Error");
		}
	}

}
