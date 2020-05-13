
import java.util.ArrayList;




public class TradingDay {
	
	public  ArrayList<Company> companies;
	private ArrayList<Investor> investors;
		
	

	// instantiating  100 companies
	   public static  ArrayList<Company> CreateCompanies(){
	    Company.BuilderCompany builder = new Company.BuilderCompany(null);
	    ArrayList<Company>companies = new ArrayList<Company>();
	    Company c = builder.build();  
	   
	    for(int i = 0; i < 100; i++) {
		double price = RandomGeneratorCompany.GeneratePrice() ;
		String id = RandomGeneratorCompany.GenerateId();
		int shares = RandomGeneratorCompany.GenerateShares();
		
		//Creating a new Company
		c = new Company.BuilderCompany(id).setPrice(price).setShares(shares).setsold(true).build();
		
	    
     System.out.println(c);
	    }
		return companies;
	}
	   
	  
	  //instantiating 100 Investors
	   public static  ArrayList<Investor> CreateInvestors(){
			Investor.BuilderInvestor builder = new Investor.BuilderInvestor(null);
		    ArrayList<Investor>investors = new ArrayList<Investor>();
		    Investor c = builder.build();  
		   
		    for(int i = 0; i < 100; i++) {
			float budget = RandomGeneratorInvestor.GenerateBudget();
			String id = RandomGeneratorInvestor.GenerateId();
			
			//Creating a new Company
			c = new Investor.BuilderInvestor(id).setbudget(budget).build();
			
		    
	     System.out.println(c);
		    }
			return investors;
	}
	/*
	public static TradingDay getInstance() {
		if (tradingDay == null) {
			tradingDay = new TradingDay();
		}
		
		return tradingDay;
	}
*/







	
}