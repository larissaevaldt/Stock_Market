import java.util.ArrayList;

////CLASS BUILDER
public class Company {
	
	private String id;
	private int shares;
	private double price;
	private boolean sold;
	
      //Constructor
	private Company(BuilderCompany builder) {

		this.id = builder.id;
		this.price = builder.price;
		this.shares = builder.shares;
		this.sold = builder.sold;
	}
	//implementation for Company
	@Override
	public String toString() {
		return "Company [id=" + id + ", shares=" + shares + ", price=" + price + ", sold=" + sold + "]";
	}
	public String getId() {
		return id;
	}
	
	public int getShares() {
		return shares;
	}
	
	public double getPrice() {
		return price;
	}
	
	public boolean isSold() {
		return sold;
	}

	
	
	public static class BuilderCompany {
		
		private String id;
		private int shares;
		private double price;
		private boolean sold;
	
		
	public  BuilderCompany (String id){
		this.id = id;
	    this.shares= shares;
	    this.price = price;
	    this.sold= sold;
	}
	public BuilderCompany setShares(int shares) {
		this.shares = shares;
		return this;
	}
	public BuilderCompany setPrice(double price){
		this.price = price;
		return this;
	
}
	public BuilderCompany setsold(boolean sold){
		this.sold = sold;
		return this;
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





	









	


