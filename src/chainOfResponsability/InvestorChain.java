package chainOfResponsability;

import java.util.ArrayList;
import builder.Company;
import observer.StockSubject;

public interface InvestorChain {

    void setNextLink(InvestorChain nextLink);

    void trade(ArrayList<Company> companies, StockSubject stock);
}