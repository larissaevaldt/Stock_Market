package builder;

import java.util.ArrayList;

import chainOfResponsability.InvestorChain;
import observer.StockSubject;

///CLASS BUIDER
public class Investor implements InvestorChain {

    private String id;
    private float budget;
    private int totalNumberOfSharesBought;
    private int numberOfCompaniesInvestedIn;
    private InvestorChain nextInvestor;

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

    public InvestorChain getNextLink() {
        return nextInvestor;
    }

    // method to increases the total amount of shares brought
    public void incrementSharesBought() {
        this.totalNumberOfSharesBought++;
    }

    @Override
    public void setNextLink(InvestorChain nextLink) {
        this.nextInvestor = nextLink;

    }

    @Override
    public void trade(ArrayList<Company> companies, StockSubject stock) {

        while (budget > stock.getCheapestShareOnMarket()) {
            for (int i = 0; i < companies.size(); i++) {
                if (this.budget >= companies.get(i).getSharePrice()
                        && companies.get(i).getShareSold() != companies.get(i).getShares()) {
                    this.budget -= companies.get(i).getSharePrice();
                    this.numberOfCompaniesInvestedIn++;
                    this.totalNumberOfSharesBought++;
                    companies.get(i).shareSold();
                } else {
                    System.out.println("Not enough money. Investor" + id + " have " + this.budget
                            + " and the share price is " + companies.get(i).getSharePrice());
                }
            }

        }

        System.out.println(budget);
        nextInvestor.trade(companies, stock);

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
