import facade.TradingDay;
import view.Display;

import view.Display;

public class Main {

    public static void main(String[] args) {

        // RandomGeneratorCompany.companies("", 0, 0);

        // RandomGeneratorInvestor.investors("", 0);
        // ShareDriver marketDriver;
        // Transaction.TransactionDetail();
        // TradingDay.CreateCompanies();
        System.out.println("------------------Companies----------------------------");
        TradingDay.getInstance();
        Display.DisplayMenu();

    }
}