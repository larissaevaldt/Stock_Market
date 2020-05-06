import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;

public class AccessFileInvestor {

	public static void readFile() throws IOException {
		
		File file = new File("C:\\Users\\atricia\\eclipse-workspace\\Stock_Market\\investorName"); 

		BufferedReader br = new BufferedReader(new FileReader(file)); 
		RandomAccessFile in = new RandomAccessFile("C:\\Users\\atricia\\eclipse-workspace\\Stock_Market\\investorName", "r");
		String line = "";
		while ((line = in.readLine()) != null) {
			System.out.println("investor: [" + line + "]");

		}
		  
	}
}
