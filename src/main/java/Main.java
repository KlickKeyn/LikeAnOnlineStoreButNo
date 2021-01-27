import Buyer.Buyer;
import Buyer.BuyerAction;
import Simulation.Simulation;

public class Main {
    public static void main(String[] args) {
        BuyerAction buyer1 = new Buyer(1000);
        BuyerAction buyer2 = new Buyer(1000);

        System.out.println(buyer1.hashCode());
        System.out.println(buyer2.hashCode());
    }
}
