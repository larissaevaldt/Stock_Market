///CLASS BUIDER

public class Investor {

	private String id;
	private int budget;
	
	private Investor(BuilderInvestor builder) {
		this.id = builder.id;
		this.budget = builder.budget;
		
	}
	@Override
	public String toString() {
		return "Investor [ id=" + id + ", budget=" + budget + "]";
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
public class BuilderInvestor {
		
		private String id;
		private int budget;
		
	public  BuilderInvestor(String id){
		this.id = id;
		
	}
	public BuilderInvestor setbudget(int budget) {
		this.budget = budget;
		return this;
	
}
	
	public Investor build() {
		return new Investor(this);
	}
	public void setId(String id) {
		this.id = id;
		
	}
}


	
}


