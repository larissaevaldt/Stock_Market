package iterator;


////CLASS BUILDER
public class Share {
	
	private int numberOfShares;
	private double price;
	private boolean sold;
	

	private Share(BuilderShare builder) {

		this.price = builder.price;
		this.numberOfShares = builder.numberOfShares;
	}
	@Override
	public String toString() {
		return "Share [numberOfShares=" + numberOfShares + ", price=" + price + ", sold=" + sold
				+ ", getNumberOfShares()=" + getNumberOfShares() + ", getPrice()=" + getPrice() + ", isSold()="
				+ isSold() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	
	}
	
	
	public int getNumberOfShares() {
		return numberOfShares;
	}

	
	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isSold() {
		return sold;
	}
	public void setSold(boolean sold) {
		this.sold = sold;
	}
public class BuilderShare {
		
		private int numberOfShares;
		private double price;
		private boolean sold;
	
		
	public  BuilderShare (int numberOfShares){
		this.numberOfShares = numberOfShares;
		
	}
	public BuilderShare setprice(double price) {
		this.price = price;
		return this;
	}
	public BuilderShare setsold(boolean sold){
		this.sold = sold;
		return this;
	
}
	
	public Share build() {
		return new Share(this);
	}
	public void setNumberOfShares(int NumberOfShares) {
		this.numberOfShares = numberOfShares;
		
	}
}
public boolean isEmpty() {
	// TODO Auto-generated method stub
	return false;
}
	
}
