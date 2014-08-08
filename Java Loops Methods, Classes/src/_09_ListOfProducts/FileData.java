package _09_ListOfProducts;
import java.io.IOException;

public class FileData {

	public static void main(String[] args) throws IOException {
		
		String file_name = "D:/Input.txt";
		String write_to_file = "D:/Output.txt";
		
		try {
			ReadFile file = new ReadFile(file_name);
			String[] aryLines = file.OpenFile();
			
			
			WriteFile data = new WriteFile(write_to_file, true);
			for (int i = 0; i < aryLines.length; i++) {
				data.writeToFile(aryLines[i]);
			}

		}
		
		catch (IOException e) {
			System.out.println("Error");
		}

	}

}
