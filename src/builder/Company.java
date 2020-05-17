package builder;

////CLASS BUILDER
public class Company {
	
	private String id;
	private int shares;
	private double sharePrice;
	private int shareSold;

	
      //Constructor
	private Company(BuilderCompany builder) {

		this.id = builder.id;
		this.sharePrice = builder.Shareprice;
		this.shares = builder.shares;
		this.shareSold = builder.sharesold;
	}
	//implementation for Company
	@Override
	public String toString() {
		return "Company [id=" + id + ", Number Of Shares=" + shares + ", price=" + sharePrice + ", sharesold=" + shareSold + "]";
	}
	public String getId() {
		return id;
	}
	
	public int getShares() {
		return shares;
	}
	
	public double getPrice() {
		return getPrice();
	}
	public double setsharePrice() {
		return sharePrice;
		
	}
	public int getshareSold() {
		return shareSold;
	}
	public void setshareSold(int sharesold) {
		this.shareSold = sharesold;
	}

	
	
	public static class BuilderCompany {
		
		public int sharesold;
		private String id;
		private int shares;
		private double Shareprice;

	
		
	public  BuilderCompany (String id){
		this.id = id;
	    this.shares= shares;
	    this.Shareprice = Shareprice;
	    this.sharesold= sharesold;
	}
	public BuilderCompany setShares(int shares) {
		this.shares = shares;
		return this;
	}
	public BuilderCompany setSharePrice(double price){
		this.Shareprice = price;
		return this;
	
}
	public  BuilderCompany setShareSold(int shareSold){
		this.sharesold = shareSold;
		return this;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public Company build() {		
		return new Company(this);
		//return new ArrayList<Company>();
	}
	
}
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

}





	









	


