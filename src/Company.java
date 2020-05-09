
////CLASS BUILDER
public class Company {
	
	private String id;
	private int shares;
	private int price;
	
	
	private Company(BuilderCompany builder) {

		this.id = builder.id;
		this.price = builder.price;
		this.shares = builder.shares;
	}
	
	
	

	@Override
	public String toString() {
		return "Company [id=" + id + ", shares=" + shares + ", price=" + price +"]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getShares() {
		return shares;
	}
	public void setShares(int shares) {
		this.shares = shares;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public class BuilderCompany {
		
		private String id;
		private int shares;
		private int price;
	
		
	public  BuilderCompany (String id){
		this.id = id;
		
	}
	public BuilderCompany setshares(int shares) {
		this.shares = shares;
		return this;
	}
	public BuilderCompany setprice(int price){
		this.price = price;
		return this;
	
}
	
	public Company build() {
		return new Company(this);
	}
	public void setId(String id) {
		this.id = id;
		
	}
}


	
}








	


