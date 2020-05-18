package facade;

import java.util.ArrayList;

import builder.Company;
import builder.Investor;
import builder.RandomCompany;
import builder.RandomInvestor;
import view.Display;

//StockPreparator is a Thread Safe Singleton class
public class StockPreparator {

    public ArrayList<Company> companies;
    private ArrayList<Investor> investors;
    public ArrayList<Company> inTenTransactions;
    private static int soldShares = 0;
    // private int numberOfSharesOnMarket;

    private static StockPreparator instance = new StockPreparator();

 

        private StockPreparator() {
        this.companies = CreateCompanies();
        this.investors = CreateInvestors();
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

    public static synchronized StockPreparator getInstance() {
        if (instance == null) {
            instance = new StockPreparator();
        }

        return instance;
    }

}
