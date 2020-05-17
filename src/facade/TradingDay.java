package facade;

import java.util.ArrayList;

import builder.Company;
import builder.Investor;
import view.Display;


public class TradingDay {
	private static TradingDay controllerSimulation;
	
	public static  ArrayList<Company> companies;
	private ArrayList<Investor> investors;
		
	private TradingDay(){
		companies = CreateCompanies();
		investors = CreateInvestors();
	}

	//helper instantiating  100 companies
	   public static  ArrayList<Company> CreateCompanies(){
	    Company.BuilderCompany builder = new Company.BuilderCompany(null);
	    ArrayList<Company>companies = new ArrayList<Company>();
	    Company c = builder.build();  
	   
	    for(int i = 0; i < 100; i++) {
		double price = RandomCompany.GeneratePrice() ;
		String id = RandomCompany.GenerateId();
		int shares = RandomCompany.GenerateShares();
		int sold = 0;
		//Creating a new Company
		c = new Company.BuilderCompany(id).setSharePrice(price).setShares(shares).setShareSold(sold ).build();
		
	    
     System.out.println(c);
	    }
		return companies;
	}
	   
	  
	  // helper instantiating 100 Investors
	   public static  ArrayList<Investor> CreateInvestors(){
			Investor.BuilderInvestor builder = new Investor.BuilderInvestor(null);
		    ArrayList<Investor>investors = new ArrayList<Investor>();
		    Investor c = builder.build();  
		   
		    for(int i = 0; i < 100; i++) {
			float budget = RandomInvestor.GenerateBudget();
			String id = RandomInvestor.GenerateId();
			
			//Creating a new Investor
			c = new Investor.BuilderInvestor(id).setBudget(budget).build();
			
		    
	     System.out.println(c);
		    }
		    
			return investors;
	}
		
		public static TradingDay getInstance() {
			if (controllerSimulation == null) {
				controllerSimulation = new TradingDay();
			}
		
			return controllerSimulation;
		}
		//Get Share sold
		public static void sold() {
			for (int i = 0; i < 100; i++) {
				if (companies.get(i).getshareSold() > 9) {
					double doubledPrice =  companies.get(i).getPrice() * 2;
					companies.get(i).setsharePrice();
					companies.get(i).setshareSold(0);
				}
			}
		}
		
			public double buyShares(int NumberOfSharesBought, float budget) {
			double SharePrice = companies.get(0).getPrice();
				if(investors.get(0).getBudget() >= SharePrice && SharePrice !=0) {
					budget = (float) (budget - SharePrice);
					NumberOfSharesBought ++;
				}
				return budget;
				
			}
			
			public int CompanyInvestedIn(int numberOfCompaniesInvestedIn) {
				int shareSold = companies.get(0).getShares();
				if(companies.get(0).getshareSold() >= shareSold && shareSold !=0) {
					numberOfCompaniesInvestedIn = numberOfCompaniesInvestedIn - shareSold;
					numberOfCompaniesInvestedIn++;
				}
				return shareSold;
			}
			
			
			



		private static void increasePrice() {
			// TODO Auto-generated method stub
			
		}}









	
