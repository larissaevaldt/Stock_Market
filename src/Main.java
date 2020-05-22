import facade.StockPreparator;
import observer.StockSubject;
import view.Display;

import java.util.ArrayList;

import builder.Investor;

public class Main {

    public static void main(String[] args) {

        System.out.println("------------------Companies----------------------------");
        // call the class that holds the 100 companies and investors
        StockPreparator stockPreparator = StockPreparator.getInstance();
        // create a new Stock Subject
        StockSubject stockSubject = StockSubject.getInstance();
        // pass the 100 randomly created companies to the stockSubject
        stockSubject.gettingCompanies(stockPreparator.getCompanies());
        // get the randomly generated 100 investors
        ArrayList<Investor> investors = stockPreparator.getInvestors();

        /*
         * Set the nextInvestor in the chain of responsability Loops through the
         * arrayList of investors, setting the nextLink to the next investor in the list
         */
        for (int i = 0; i < investors.size() - 1; i++) {
            investors.get(i).setNextLink(investors.get(i + 1));
            System.out.println(investors.get(i).getNextLink());
        }

        /*
         * Call the runTradingDay method passing the first investor in the arrayList the
         * first investor should move to the next in the chain once he can't buy
         * anything else
         */
        stockSubject.runTradingDay(investors.get(0));

        Display.DisplayMenu();

    }
}