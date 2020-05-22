package observer;

import java.util.ArrayList;

import builder.Company;
import chainOfResponsability.InvestorChain;

public class StockSubject implements Subject {

    private ArrayList<Company> companies;
    private static ArrayList<Company> lastTenTransactions = new ArrayList<>();
    private int transactionCounter;
    private static StockSubject instance = new StockSubject();
    private double cheapestShareOnMarket;

    private StockSubject() {
    }

    public void gettingCompanies(ArrayList<Company> list) {
        this.companies = list;
        this.cheapestShareOnMarket = setCheapestShare(companies);
    }

    public double getCheapestShareOnMarket() {
        return this.cheapestShareOnMarket;
    }

    /*
     * Receives a list of companies, set cheapest share to the first and then loops
     * through the list checking whether the price of the next one is cheaper then
     * the one before, if it is update cheapestShare
     * 
     * @return cheapestShare
     */
    public double setCheapestShare(ArrayList<Company> companies) {
        double cheapestShare = companies.get(0).getSharePrice();

        for (int i = 0; i < companies.size(); i++) {
            if (companies.get(i).getSharePrice() < cheapestShare) {
                cheapestShare = companies.get(i).getSharePrice();
            }
        }

        return cheapestShare;

    }

    /*
     * Loop through the list of all companies and check, if the company is not on
     * the list of the last ten transactions call the method update() which reduces
     * the price. Also checks if the cheaper price needs to be updated
     */
    @Override
    public void notifyObservers() {

        for (int i = 0; i < companies.size(); i++) {
            if (!lastTenTransactions.contains(companies.get(i))) {
                companies.get(i).update();
            }
        }

        this.cheapestShareOnMarket = setCheapestShare(companies);

        lastTenTransactions.clear();
    }

    /*
     * Receives a company and adds it to the list of ten transactions, increments
     * the counter When the counter gets to 10 it calls notifyObservers() and sets
     * counter to zero again
     */
    @Override
    public void addTransaction(Company c) {
        lastTenTransactions.add(c);
        transactionCounter++;
        if (transactionCounter == 10) {
            transactionCounter = 0;
            notifyObservers();
        }
    }

    public void runTradingDay(InvestorChain investor) {
        investor.trade(companies, this);
    }

    public static StockSubject getInstance() {
        return instance;
    }
}