import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream.Builder;



public class RandomGeneratorInvestor {
	
	public static ArrayList<Investor>investors;

	
	//THIS METHOD GENERATES THE ID
	public static ArrayList<Investor> GenerateId(String id) {
	
		// chose a Character random from this int
		Random rand = new Random();
		//for(int i = 1; i <= 100; i++) {
		int randomNum = rand.nextInt((999 - 100) + 1) + 100;
		System.out.println("Investor " + randomNum);

		return investors ;
	}
		//THIS METHOD GENERATES A RANDOM BUDGET
		public static void GenerateBudget(int budget) {
		      int min = 1000;
		      int max = 10000;
		      
		      //Generate random float value from 1000 to 10000 
		      float random_float = (float) (Math.random() * (max - min + 1) + min); 
		      System.out.println("Budget: " + random_float);
		}
		      
		      ///METHOD THAT CREATE AN INVESTOR
		      static ArrayList<Investor>investors(String id, int budget) {
		    	  
		    	  //Loop 100 times to generate 100 different investors
		    	  for(int i = 0; i <= 100; i++) {
		    	  RandomGeneratorInvestor.GenerateId(id);
		    	  RandomGeneratorInvestor.GenerateBudget(budget);
		    	
		    	  
		    	  //Print the ArrayList of investors created
		    	  System.out.print(investors);
		        	
		    	  System.out.println("***********************************************************");
		    	  }
		    	  return investors;
		
}
		}
