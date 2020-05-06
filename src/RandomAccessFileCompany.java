import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.RandomAccessFile;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class RandomAccessFileCompany {
	
	//THIS METHOD READS THE FILE
	public static void ReadFile() throws IOException {
	
		File file = new File("C:\\Users\\atricia\\eclipse-workspace\\Stock_Market\\companyName"); 

		BufferedReader br = new BufferedReader(new FileReader(file)); 
		RandomAccessFile in = new RandomAccessFile("C:\\Users\\atricia\\eclipse-workspace\\Stock_Market\\companyName", "r");
		String line = "";
		while ((line = in.readLine()) != null) {
		System.out.println( "Company: [" + line + "]");
	}
	}
		
			//THIS METHOD GENERATES THE ID
		public static String GenerateId() {
			// chose a Character random from this String 
			String characters = "ABCDEFGHIJKLMNOPQRSTUVXYZ"
					+ "0123456789"  
			    	+ "abcdefghijklmnopqrstuvxyz";   
			// create StringBuffer size of AlphaNumericString
			StringBuilder sb = new StringBuilder(5); 
		 
			for(int i = 0; i < 5; i++) {
				// generate a random number between    // 0 to AlphaNumericString variable length  
				int index = (int)(characters.length()* Math.random());      
				// add Character one by one in end of sb 
				sb.append(characters.charAt(index));  
					
					System.out.println(sb.toString());
			}
			return characters;
				
		}
		//THIS METHOD GENERATES A RANDOM NUMBER OS SHARES
		public static void GenerateShares() {
			
			int min = 500;
			int max = 1000;

			//Generate random int value from 500 to 1000 
			System.out.println("Random number of Shares "+min+" to "+max+ ":");
			int random_int = (int)(Math.random() * (max - min + 1) + min);
			System.out.println(random_int);
		}
		//THIS METHOD GENERATES A RANDOM SHARE PRICE
		public static void GeneratePrice() {
		      int min = 10;
		      int max = 100;
		      
		      //Generate random double value from 50 to 100 
		      System.out.println("Random price in double from "+min+" to "+max+ ":");
		      double random_double = Math.random() * (max - min + 1) + min; 
		      System.out.println(random_double);
		}
		
}
	
		