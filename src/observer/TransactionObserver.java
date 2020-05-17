package observer;
 import builder.Investor;
import facade.RandomCompany;
import facade.RandomInvestor;

import java.util.ArrayList;
import builder.Company; 

public class TransactionObserver{
	
	private ArrayList<Company> companies;
	private ArrayList<Investor> investors;
    
public void executeTransaction(Company company, Investor investor) {
	/*
	if (investors.get(0).getBudget()<companies.get(0).getPrice()) {	
	
	}else if (companies.get(0).getShares() <=0) {
		
	}else {
		Company share = RandomCompany.sellShare();
		
	}*/
}
}