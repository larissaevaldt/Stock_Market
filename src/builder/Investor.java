package builder;

///CLASS BUIDER
public class Investor {

    private String id;
    private float budget;
    private int totalNumberOfSharesBought;
    private int numberOfCompaniesInvestedIn;

    private Investor(BuilderInvestor builder) {
        this.id = builder.id;
        this.budget = builder.budget;
        this.totalNumberOfSharesBought = builder.totalNumberOfSharesBought;
        this.numberOfCompaniesInvestedIn = builder.numberOfCompaniesInvestedIn;
    }

    @Override
    public String toString() {
        return "Investor [id: " + id + ", budget: " + budget + ", totalNumberOfSharesBought: "
                + totalNumberOfSharesBought + ", numberOfCompaniesInvestedIn: " + numberOfCompaniesInvestedIn + "]";
    }

    // getters
    public String getId() {
        return id;
    }

    public float getBudget() {
        return budget;
    }

    public int getTotalNumberOfSharesBought() {
        return totalNumberOfSharesBought;
    }

    public int getNumberOfCompaniesInvestedIn() {
        return numberOfCompaniesInvestedIn;
    }

    // method to increases the total amount of shares brought
    public void incrementSharesBought() {
        this.totalNumberOfSharesBought++;
    }

    public static class BuilderInvestor {

        private String id;
        private float budget;
        private int totalNumberOfSharesBought;
        private int numberOfCompaniesInvestedIn;

        public BuilderInvestor(String id, float budget) {
            this.id = id;
            this.budget = budget;
            this.totalNumberOfSharesBought = 0;
            this.numberOfCompaniesInvestedIn = 0;
        }

        public BuilderInvestor setTotalNumberOfSharesBought(int totalNumberOfSharesBought) {
            this.totalNumberOfSharesBought = totalNumberOfSharesBought;
            return this;
        }

        public BuilderInvestor setNumberOfCompaniesInvestedIn(int numberOfCompaniesInvestedIn) {
            this.numberOfCompaniesInvestedIn = numberOfCompaniesInvestedIn;
            return this;
        }

        public BuilderInvestor setBudget(float budget) {
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
