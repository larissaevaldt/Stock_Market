package facade;

import java.util.ArrayList;
import java.util.Random;

import builder.Investor;




public class RandomInvestor {
	
	public static ArrayList<Investor>investors;

	
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

		return sb.toString();
						
	}
		//THIS METHOD GENERATES A RANDOM BUDGET
		public static float GenerateBudget() {
		      int min = 1000;
		      int max = 10000;
		      
		      //Generate random float value from 1000 to 10000 
		      float random_float = (float) (Math.random() * (max - min + 1) + min); 
		    //  System.out.println("Budget: " + random_float);
			return random_float;
		
		
		
}      
		public static ArrayList<Investor> getInvestor(){
			for (int i = 0; i<investors.size(); i++);{	
			}
			return investors;
		}
}
      
