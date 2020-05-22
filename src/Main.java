import facade.StockPreparator;
import view.Display;

public class Main {

    public static void main(String[] args) {

        System.out.println("------------------Companies----------------------------");
        StockPreparator.getInstance();
        Display.DisplayMenu();

    }
}