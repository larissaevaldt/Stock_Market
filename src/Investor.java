///CLASS BUIDER

public class Investor {

	private String id;
	private float budget;
	
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
	
	public float getBudget() {
		return budget;
	
	}
public static class BuilderInvestor {
		
		private String id;
		private float budget;
		
	public  BuilderInvestor(String id){
		this.id = id;
		this.budget= budget;
		
	}
	public BuilderInvestor setbudget(float budget) {
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


