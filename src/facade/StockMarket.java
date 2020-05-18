package facade;

import java.util.ArrayList;

import builder.Company;
import builder.Investor;

public class StockMarket {
	
   static ArrayList<Company>companies;
   ArrayList<Investor>investors;

////class were will happen the transactions


// STILL NEED TO CHECK WHAT IS WRONG WITH THIS METHODS
// Get Share sold
          public static void sold() {
	        for (int i = 0; i < 100; i++) {
		       if (companies.get(i).getShareSold() > 9) {
			     double doubledPrice = companies.get(i).getSharePrice() * 2;
		//	companies.get(i).setsharePrice();
		//	companies.get(i).setshareSold(0);
		}
	}
}

public double buyShares(int NumberOfSharesBought, float budget) {
	double SharePrice = companies.get(0).getSharePrice();
	if (investors.get(0).getBudget() >= SharePrice && SharePrice != 0) {
		budget = (float) (budget - SharePrice);
		NumberOfSharesBought++;
	}
	return budget;

}

public int CompanyInvestedIn(int numberOfCompaniesInvestedIn) {
	int shareSold = companies.get(0).getShares();
	if (companies.get(0).getShareSold() >= shareSold && shareSold != 0) {
		numberOfCompaniesInvestedIn = numberOfCompaniesInvestedIn - shareSold;
		numberOfCompaniesInvestedIn++;
	}
	return shareSold;
}


private static void increasePrice() {


}
}