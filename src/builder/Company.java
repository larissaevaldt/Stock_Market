package builder;

import observer.Observer;
import observer.StockSubject;

////CLASS BUILDER
public class Company implements Observer {

    private String id;
    private int numberShares;
    private double sharePrice;
    private int shareSold;

    // private constructor so the only way to create a Country object is through the
    // Builder Class
    private Company(BuilderCompany builder) {

        this.id = builder.id;
        this.numberShares = builder.numberShares;
        this.sharePrice = builder.sharePrice;
        this.shareSold = builder.shareSold;
    }

    // implementation for Company
    @Override
    public String toString() {
        return "Company [id=" + id + ", Number Of Shares=" + numberShares + ", price=" + sharePrice + ", sharesold="
                + shareSold + "]";
    }

    // no setters, only getters
    public String getId() {
        return id;
    }

    public int getShares() {
        return numberShares;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public int getShareSold() {
        return shareSold;
    }

    private void doublePrice() {
        sharePrice = sharePrice * 2;
    }

    // everytime a share is sold,
    public void shareSold() {
        shareSold++;
        StockSubject.getInstance().addTransaction(this);
        if (shareSold == 10) {
            shareSold = 0;
            doublePrice();
        }
    }

    public void update() {
        sharePrice = sharePrice * 0.98;
    }

    public static class BuilderCompany {

        private String id;
        private int numberShares;
        private double sharePrice;
        private int shareSold;

        public BuilderCompany(String id, int numberShares, double sharePrice) {
            this.id = id;
            this.numberShares = numberShares;
            this.sharePrice = sharePrice;
            this.shareSold = 0;
        }

        public BuilderCompany setShareSold(int shareSold) {
            this.shareSold = shareSold;
            return this;
        }

        public Company build() {
            return new Company(this);
        }

    }

}
