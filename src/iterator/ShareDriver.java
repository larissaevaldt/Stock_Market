package iterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import iterator.Share.BuilderShare;



public class ShareDriver<Company> {
	
	public <Investor> ShareDriver() {

	List companies = new ArrayList<Company>(); 
	List investors = new ArrayList<Investor>();
	ShareTransaction st = new ShareTransaction();

	//get number of shares the company has
	int numberOfShares = st.getNumberOfShares();
	//print the number of shares
	System.out.println("Number of Shares: " + numberOfShares);
	//create ArrayList to hold shares
	List shareList = new ArrayList();
	
	//create new Share object and store into shareList
	for(int i = 0; i <numberOfShares; i++) {
		
		//get the share from ShareTransaction and assign it to variables
		String s[] = st.getNext();
		boolean sold = s[0] != null;
		double price = Double.parseDouble(s[1]);
		
		//create new Share object for each getNext method
	  //  new Share.BuilderShare(numberOfShares);
		((Share) shareList).setNumberOfShares(numberOfShares);
		((BuilderShare) shareList).setprice(price);
		((BuilderShare) shareList).setsold(false);
		
		//add the created share into ArrayLIst
		shareList.add(shareList);
			
	}
	double totalPrice = 0;
	//Sum the final total share amount
	for(Iterator iterator = shareList.iterator(); iterator.hasNext();) {
		Share share = (Share) iterator.next();
		totalPrice +=share.getPrice();
	}
	//print the total share amount
	System.out.println("Total price:" + totalPrice);
	System.out.println("___________________________________________");
	}
}