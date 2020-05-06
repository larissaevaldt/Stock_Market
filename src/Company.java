
public class Company {
	
	private String id;
	private int shares;
	private double price;
	private String name;
	
	@Override
	public String toString() {
		return "Company [id=" + id + ", shares=" + shares + ", price=" + price + ", name=" + name + "]";
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
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
