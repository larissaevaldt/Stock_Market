import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.RandomAccessFile;
import java.util.Random;

public class RandomAccessFileCompany {
	
	//THIS METHOD READS THE FILE
	public static void readFile() throws IOException {
		
		File file = new File("C:\\Users\\atricia\\eclipse-workspace\\Stock_Market\\companyName"); 

		BufferedReader br = new BufferedReader(new FileReader(file)); 

		String st; 
			RandomAccessFile in = new RandomAccessFile("C:\\Users\\atricia\\eclipse-workspace\\Stock_Market\\companyName", "r");
			String line = "";
			while ((line = in.readLine()) != null) {
				System.out.println("Company: [" + line + "]");

	            	//System.out.println(st);
		  
	}
		  }
	
}/*
	//THIS METHOD READS THE FILE RANDOM
	public static void randomNames() throws IOException {
		
		  try {
	            RandomAccessFile in = new RandomAccessFile("C:\\Users\\atricia\\eclipse-workspace\\Stock_Market\\companyName", "r");
	            in.seek(0);
	            byte[] bytes = new byte[5];
	            in.read(bytes);
	            String line = "";
	            while ((line = in.readLine()) != null) {
	               // System.out.println(next + ":" + next.length());
	            	 System.out.println("Company: [" + line + "]");
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }*/
	
	
