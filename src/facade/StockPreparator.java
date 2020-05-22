package facade;

import java.util.ArrayList;

import builder.Company;
import builder.Investor;
import builder.RandomCompany;
import builder.RandomInvestor;

public class StockPreparator {

    private ArrayList<Company> companies;
    private ArrayList<Investor> investors;

    private static StockPreparator instance = new StockPreparator();

    private StockPreparator() {
        this.companies = createCompanies();
        this.investors = createInvestors();
    }

    public ArrayList<Company> getCompanies() {
        return companies;
    }

    public ArrayList<Investor> getInvestors() {
        return investors;
    }

    /*
     * This method creates 100 companies with random ID, Number of Shares and price
     * It is private because it's only used inside this class to populate the lists
     * 
     * @return the list of companies created
     */
    private ArrayList<Company> createCompanies() {

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
     * This method creates 100 investors with random ID and budget It is private
     * because it's only used within this class to populate the lists
     * 
     * @return the list of investors created
     */
    private ArrayList<Investor> createInvestors() {

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

    public static StockPreparator getInstance() {
        return instance;
    }

}
