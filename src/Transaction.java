import java.util.ArrayList;

import iterator.Share;
import iterator.ShareTransaction;


public class Transaction<CompanyBuilder> {

	 ArrayList<Company>companies;
	 ArrayList<Investor> investors;
	
	
	public Transaction(ArrayList<Company> comp, ArrayList<Investor> inv) {
		this.companies = comp;
		this.investors = inv;
		
	}
	private Transaction() {
		this.companies = null;
		this.investors = null;
		
	}
	public static void TransactionDetail() {
		
		System.out.println("________Transactions________");
		 //Loop 100 times to generate 100 different companies
  	    for(int i = 0; i <= 100; i++) {
		RandomGeneratorCompany.GenerateId();
		ShareTransaction.GenerateShares();
		RandomGeneratorCompany.GeneratePrice();
		RandomGeneratorInvestor.GenerateId();
		RandomGeneratorInvestor.GenerateBudget();
		
		System.out.println("_________________________");
  	  }}
		
	
	
	
	
	public int sellShare(Share share) throws Exception {
		if (((ArrayList<Company>) companies).get(0).isEmpty()) {
			throw new Exception("Company "+ companies.get(0)+" has no shares left to sell."); // check if it's empty	
		}else {
			int sold = ((share).getNumberOfShares());
			//sold.setprice(share.getPrice());
			share.setSold(true);
			if(share.getNumberOfShares()%10==0) {
				//increasePrice(share);
			}
		return sold;
		}
		
	

	}}
