package facade;

import java.util.ArrayList;

public class facadeShare {

	private int sharesSold;
	private boolean hasSoldShare;
	private int initialShares;
	
	public <Shares> int getNumberOfSharesAvailable() {
		ArrayList<Shares>shares = new ArrayList<Shares>();
		return shares.size();
	}
 public void incrementShareSold() {
	 this.sharesSold++;
 }
 public facadeShare setInitialShares(int initialShares) {
	 this.initialShares = initialShares;
	 return this;
 }
}
