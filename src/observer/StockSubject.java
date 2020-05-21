package observer;

import java.util.ArrayList;

import builder.Company;

public class StockSubject implements Subject {
    private ArrayList<Company> companies;
    private static ArrayList<Company> lastTenTransactions = new ArrayList<>();
    private int transactionCounter;
    private static StockSubject instance = new StockSubject();

    private StockSubject() {
    }

    public void gettingCompanies(ArrayList<Company> list) {
        companies = list;
    }

    @Override
    public void notifyObservers() {

        for (int i = 0; i < companies.size(); i++) {
            if (!lastTenTransactions.contains(companies.get(i))) {
                companies.get(i).update();
            }
        }
    }

    @Override
    public void addTransaction(Company c) {
        lastTenTransactions.add(c);
        transactionCounter++;
        if (transactionCounter == 10) {
            transactionCounter = 0;
            notifyObservers();
        }
    }

    public static StockSubject getInstance() {
        return instance;
    }
}