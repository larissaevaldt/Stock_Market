

import java.util.ArrayList;




public class RandomGeneratorCompany {
	
	 public static ArrayList<Company>companies;
	
		
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
			}
					//System.out.println("Company:" + sb.toString());
					return sb.toString();
				
					
				
			
		}
		
		//THIS METHOD GENERATES A RANDOM NUMBER OS SHARES
		public static int GenerateShares() {
			
			int min = 500;
			int max = 1000;

			//Generate random int value from 500 to 1000 
			int random_int = (int)(Math.random() * (max - min + 1) + min);
			//System.out.println("Number of shares:" + random_int);
			return random_int;
		
		}
		//THIS METHOD GENERATES A RANDOM SHARE PRICE
		public static double GeneratePrice() {
		      int min = 10;
		      int max = 100;
		      
		      //Generate random float value from 50 to 100 
		      double random_double = (double) (Math.random() * (max - min + 1) + min); 
		   //  System.out.println("Share price:" + random_double);
			return random_double;
		
		}
		 
		     
		    	  


 
	 
 }
 

	
		