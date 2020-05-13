package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShareTransaction<Company, CompanyBuilder> {
	
	//list to hold the retrieved shares
	private List shares = new ArrayList();
	private Iterator sharesIterator = null;
	ArrayList<Company> companies;
	
	//THIS METHOD GENERATES A RANDOM NUMBER OS SHARES
			public static boolean GenerateShares() {
				
				int min = 500;
				int max = 1000;

				//Generate random int value from 500 to 1000 
				int random_int = (int)(Math.random() * (max - min + 1) + min);
				System.out.println("Number of shares:" + random_int);
				return false;
			}

			
			public String[] getNext() {
				return (String []) sharesIterator.next();
			}

			public int getNumberOfShares() {
				return shares.size();
				
			}
			
}