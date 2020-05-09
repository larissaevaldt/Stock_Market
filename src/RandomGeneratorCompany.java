
import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.Stream;



public class RandomGeneratorCompany {
	
	 public static ArrayList<Company>companies;
	
		
			//THIS METHOD GENERATES THE ID
		public static String GenerateId(String id) {
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
			}
					System.out.println("Company:" + sb.toString());
					
				
			return characters;
			
		}
		
		//THIS METHOD GENERATES A RANDOM NUMBER OS SHARES
		public static void GenerateShares(int shares) {
			
			int min = 500;
			int max = 1000;

			//Generate random int value from 500 to 1000 
			int random_int = (int)(Math.random() * (max - min + 1) + min);
			System.out.println("Number of shares:" + random_int);
		
		}
		//}
		//THIS METHOD GENERATES A RANDOM SHARE PRICE
		public static void GeneratePrice(int price) {
		      int min = 10;
		      int max = 100;
		      
		      //Generate random float value from 50 to 100 
		      float random_float = (float) (Math.random() * (max - min + 1) + min); 
		     System.out.println("Share price:" + random_float);
		     System.out.println("*****************************************************");
		}
		 
		      ///METHOD THAT CREATE A COMPANY
		      public static ArrayList<Company> companies(String id, int shares, int price) {
		    	  
		    	  //Loop 100 times to generate 100 different companies
		    	  for(int i = 0; i <= 100; i++) {
		    	  RandomGeneratorCompany.GenerateId(id);
		    	  RandomGeneratorCompany.GenerateShares(shares);
		    	  RandomGeneratorCompany.GeneratePrice(price);
		    	  
		    	  //Print the ArrayList of companies created
		    	  System.out.print(companies);
		    	
		    	  }
		    	  return companies;
		    	  
		    	 
		    	  

}
}
	
		