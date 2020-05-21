package observer;

import builder.Company;

public interface Subject {

    // method to notify observers of change
    public void notifyObservers();

    // method to get updates from subject
    public void addTransaction(Company c);
}