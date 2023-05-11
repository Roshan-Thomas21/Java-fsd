import java.io.*;
import java.util.*;
public class FileHandling {
	public static void main(String[] args) {		
		try {
			//Read Data
			File file = new File("d://testFile1.txt");
			Scanner myReader = new Scanner(file);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}

			//Write Content
			FileWriter writer = new FileWriter(file);
			writer.write("Test data written");

			//Append Data using BufferedWriter  
			FileWriter fr = new FileWriter(file, true);
			BufferedWriter br = new BufferedWriter(fr);
			br.write("\nTest data appended");

			myReader.close();
			writer.close();
			br.close();
			fr.close();

		} 
		catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}