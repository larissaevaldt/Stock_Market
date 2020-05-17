package facade;

import java.util.ArrayList;

import builder.Company;
import builder.Investor;
import view.Display;

//trading day is a Thread Safe Singleton class
public class TradingDay {

    public ArrayList<Company> companies;
    public ArrayList<Company> inTenTransactions;
    private static int soldShares = 0;
    // private int numberOfSharesOnMarket;

    private static TradingDay instance = new TradingDay();

    private ArrayList<Investor> investors;

    private TradingDay() {
        companies = CreateCompanies();
        investors = CreateInvestors();
    }

    /*
     * This method creates 100 companies with random ID, Number of Shares and price
     * 
     * @return the list of companies created
     */
    public static ArrayList<Company> CreateCompanies() {

        ArrayList<Company> companies = new ArrayList<Company>();
        Company c;

        for (int i = 0; i < 100; i++) {
            // generate random id, numberShares and price
            String id = RandomCompany.GenerateId();
            int numberShares = RandomCompany.GenerateShares();
            double price = RandomCompany.GeneratePrice();

            // Creating a new Company through the builder
            c = new Company.BuilderCompany(id, numberShares, price).build();
            // add company to the list
            companies.add(c);
            System.out.println(c);
        }
        // return the list
        return companies;
    }

    /*
     * This method creates 100 investors with random ID and budget
     * 
     * @return the list of investors created
     */
    public static ArrayList<Investor> CreateInvestors() {

        ArrayList<Investor> investors = new ArrayList<Investor>();
        Investor investor;

        for (int i = 0; i < 100; i++) {
            // generate random id and budget
            String id = RandomInvestor.GenerateId();
            float budget = RandomInvestor.GenerateBudget();

            // Creating a new Investor
            investor = new Investor.BuilderInvestor(id, budget).build();
            // adding the investor to the list
            investors.add(investor);
            System.out.println(investor);
        }
        // return list of investors
        return investors;
    }

    public static synchronized TradingDay getInstance() {
        if (instance == null) {
            instance = new TradingDay();
        }

        return instance;
    }

    // STILL NEED TO CHECK WHAT IS WRONG WITH THIS METHODS
    // // Get Share sold
    // public static void sold() {
    // for (int i = 0; i < 100; i++) {
    // if (companies.get(i).getshareSold() > 9) {
    // double doubledPrice = companies.get(i).getPrice() * 2;
    // companies.get(i).setsharePrice();
    // companies.get(i).setshareSold(0);
    // }
    // }
    // }

    // public double buyShares(int NumberOfSharesBought, float budget) {
    // double SharePrice = companies.get(0).getPrice();
    // if (investors.get(0).getBudget() >= SharePrice && SharePrice != 0) {
    // budget = (float) (budget - SharePrice);
    // NumberOfSharesBought++;
    // }
    // return budget;

    // }

    // public int CompanyInvestedIn(int numberOfCompaniesInvestedIn) {
    // int shareSold = companies.get(0).getShares();
    // if (companies.get(0).getshareSold() >= shareSold && shareSold != 0) {
    // numberOfCompaniesInvestedIn = numberOfCompaniesInvestedIn - shareSold;
    // numberOfCompaniesInvestedIn++;
    // }
    // return shareSold;
    // }

    // private static void increasePrice() {
    // // TODO Auto-generated method stub

    // }
}
