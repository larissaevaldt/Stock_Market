package view;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import builder.Company;
import builder.Investor;

public class Display  {
	
	 private static ArrayList<Company> companies;
	 private ArrayList<Investor> investor;

	public ArrayList<Company> getCompanies() {
		return companies;
	}

	public ArrayList<Investor> getInvestor() {
		return investor;
	}

	public void setCompanies(ArrayList<Company> companies) {
		this.companies = companies;
	}

	public void setInvestor(ArrayList<Investor> investor) {
		this.investor = investor;
	}

		///BufferedReader to get input from the user
		public static String getReader() {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String input ="";
			try {
				input = reader.readLine();
			}catch(Exception e) {System.out.println("It works!");}
			return input;
		}
	      ///Initial menu to get the input from the client.
	
		public static  void DisplayMenu() {
			System.out.println("------Welcome to Stock Market------");
			System.out.println("Choose one of the options.\n1.Company with the highest capital\n2.Company with the lowest capital\n3.Investor with the highest number of shares\n4.Investor with the lowest number of shares\n5.Exit");


			try { //try is necessary because if i am user the Integer.parseInt to transform the user input into an integer, and it may cause
				//an exception, so is necessary to handle the exception now.

				Integer input = Integer.parseInt(getReader()); 

				switch(input) {//This switch get what the client would like to do.

				case 1:getCompanyWithHighestCapital(companies);
			break;
				case 2: getCompanyWithLowestCapital(companies);
				break;
				case 3:investorsWithLowestShares();
				break;
				case 4:investorWithHighestShares();
				break;  
				case 5:exit();
				break;        

				default:System.out.println("Invalid Input?"); 
				DisplayMenu();

				}}catch(Exception e) { // if the input from the user, is not a number valid between the options of my menu, it will send the user back to the menu options.
					//System.out.println(e);
					System.out.println("Please insert a valid option");
					DisplayMenu();
					}
		}
		private static void getCompanyWithHighestCapital(ArrayList<Company> companies) {
			double highestCapital = companies.get(0).getSharePrice()*companies.get(0).getShares();
			int highestPosition = 0;
			for(int i=0; i<companies.size(); i++) {
				double thisCapital = companies.get(i).getSharePrice()*companies.get(i).getShares();
				if(thisCapital > highestCapital) {
					highestCapital = thisCapital;
					highestPosition = i;
				}
			}
			
			System.out.println("The company with the highest capital is " + companies.get(highestPosition).getId() + " with " + highestCapital);
			
		}
		private static void getCompanyWithLowestCapital(ArrayList<Company> companies) {
			double lowestCapital = companies.get(0).getSharePrice()*companies.get(0).getShares();
			int lowestPosition = 0;
			for(int i=0; i<companies.size(); i++) {
				double thisCapital = companies.get(i).getSharePrice()*companies.get(i).getShares();
				if(thisCapital < lowestCapital) {
					lowestCapital = thisCapital;
					lowestPosition = i;
				}
			}
			
			System.out.println("The company with the highest capital is " + companies.get(lowestPosition).getId() + " with " + lowestCapital);
			
		}
		private  static void investorsWithLowestShares() {
			
			
		}
		private static void investorWithHighestShares() {
			
			
		}
		private  static void exit() {
			System.out.println("Good bye!");
			System.exit(0);
			
		}
	
		
	}
	
  
